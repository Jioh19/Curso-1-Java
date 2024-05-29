package cl.alkemy.repositorio;

import cl.alkemy.model.Cliente;
import cl.alkemy.util.ConexionDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ClienteRepo implements Repositorio<Cliente> {

    private Connection obtenerConexion() throws SQLException {
        return ConexionDb.getConection();
    }

    private Cliente crearCliente(ResultSet resultSet) throws SQLException {
        Cliente cliente = new Cliente();
        cliente.setId(resultSet.getInt("id"));
        cliente.setNombre(resultSet.getString("nombre"));
        cliente.setApellido(resultSet.getString("apellido"));
        cliente.setRut(resultSet.getString("rut"));
        return cliente;

    }

    public static void main(String[] args) {
        ClienteRepo repo = new ClienteRepo();
        Cliente cliente = new Cliente( "Oskar", "Pinochet", "123456789-3");
        try {
            repo.crear(cliente);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void crear(Cliente cliente) throws SQLException {
        String sql = String.format("INSERT INTO cliente (id, nombre, apellido, rut)" + "VALUES ('%d', '%s', '%s', '%s')"
                , cliente.getId(), cliente.getNombre(), cliente.getApellido(), cliente.getRut());

        try (Connection connection = obtenerConexion();

             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Cliente> leer() throws SQLException {
        return null;
    }

    @Override
    public void actualizar(Cliente cliente) throws SQLException {

    }

    @Override
    public void eliminar(int id) throws SQLException {

    }
}
