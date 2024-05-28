package repository;

import model.Categoria;
import util.ConexionDb;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoriaRepository implements Repository<Categoria> {

    private Connection connection;

    public CategoriaRepository() {
        try {
            this.connection = ConexionDb.getConection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Categoria> listar() throws SQLException {
        List<Categoria> categorias = new ArrayList<>();
        try (
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM categorias");
        ) {
            while (resultSet.next()) {
                Categoria categoria = getCategoria(resultSet);
                categorias.add(categoria);
            }
        }
        return categorias;
    }

    private Categoria getCategoria(ResultSet resultSet) throws SQLException {
        Categoria categoria = new Categoria();
        categoria.setId(resultSet.getLong("id"));
        categoria.setNombre(resultSet.getString("nombre"));

        return categoria;
    }

    @Override
    public Categoria porId(Long id) throws SQLException {
        Categoria categoria = null;
        try (PreparedStatement preparedStatement =
                     connection.prepareStatement("SELECT * FROM categorias as c WHERE c.id=?")) {
            preparedStatement.setLong(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    categoria = getCategoria(resultSet);
                }
            }
        }
        return categoria;
    }

    @Override
    public void guardar(Categoria categoria) throws SQLException {
        String sql;
        if(categoria.getId()>0) {
            sql = "UPDATE categorias SET nombre=? where id=?";
        } else {
            sql = "INSERT INTO categorias (nombre) VALUES(?)";
        }
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, categoria.getNombre());
            if(categoria.getId()> 0) {
                preparedStatement.setLong(2, categoria.getId());
            }
            preparedStatement.executeQuery();
        }
    }


    @Override
    public void eliminar(Long id) throws SQLException {
        String sql = "DELETE FROM categorias WHERE id=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setLong(1, id);
            preparedStatement.executeQuery();
        }
    }
}
