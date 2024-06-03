package repository;

import model.Categoria;
import model.Producto;
import util.ConexionDb;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepository implements Repository<Producto>{

    private Connection connection;

    public ProductoRepository() {
        try {
            this.connection = ConexionDb.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Producto getProducto(ResultSet resultSet) throws SQLException{
        Producto producto = new Producto();
        producto.setId(resultSet.getLong("id"));
        producto.setSku(resultSet.getString("nombre"));
        producto.setPrecio(resultSet.getInt("precio"));
        producto.setSku(resultSet.getString("sku"));
        producto.setFechaRegistro(resultSet.getDate("fecha_registro").toLocalDate());
        Categoria categoria = new Categoria();
        categoria.setId(resultSet.getLong("categoria_id"));
        categoria.setNombre(resultSet.getString("categoria"));
        producto.setCategoria(categoria);

        return producto;
    }

    @Override
    public List<Producto> listar() throws SQLException {
        List<Producto> productos = new ArrayList<>();
        try ( Statement statement = connection.createStatement();
              ResultSet resultSet =statement.executeQuery(
                      "SELECT p.*, c.nombre as categoria\n" +
                              "from productos as p inner join categorias as c \n" +
                              "on c.id=p.categoria_id");) {
            while(resultSet.next()) {
                Producto p = getProducto(resultSet);
                productos.add(p);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productos;
    }

    @Override
    public Producto porId(Long id) throws SQLException {
        Producto producto = null;

        try(
                PreparedStatement preparedStatement =
                        connection.prepareStatement("SELECT p.*, c.nombre as categoria\n" +
                                "from productos as p inner join categorias as c \n" +
                                "on c.id=p.categoria_id where p.id=?");
                ){
            preparedStatement.setLong(1, id);
            try (
                    ResultSet resultSet = preparedStatement.executeQuery();
                    ) {
                if(resultSet.next()) {
                    producto = getProducto(resultSet);
                }
            }
        }
        return producto;
    }

    @Override
    public void guardar(Producto producto) throws SQLException {
        String sql;
        if(producto.getId() != null && producto.getId()>0) {
            sql = "UPDATE productos SET nombre=?, precio=?, sku=? WHERE id=?";
        } else {
            sql = "INSERT INTO productos (nombre, precio, sku, categoria_id, fecha_registro)" +
                    "VALUES (?,?,?,?,?)";
        }
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, producto.getNombre());
            preparedStatement.setInt(2, producto.getPrecio());
            preparedStatement.setString(3, producto.getSku());
            preparedStatement.setLong(4, producto.getCategoria().getId());
            if(producto.getId() != null && producto.getId() > 0) {
                preparedStatement.setLong(5, producto.getId());
            } else {
                preparedStatement.setDate(5, Date.valueOf(producto.getFechaRegistro()));
            }
            preparedStatement.executeQuery();
        }
    }

    @Override
    public void eliminar(Long id) throws SQLException {
        String sql = "DELETE FROM productos WHERE id=?";
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setLong(1, id);
            preparedStatement.executeQuery();
        }
    }
}
