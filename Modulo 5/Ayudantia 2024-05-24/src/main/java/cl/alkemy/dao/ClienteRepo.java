package cl.alkemy.dao;

import cl.alkemy.model.Cliente;
import cl.alkemy.util.ConexionDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepo extends Dao implements Repositorio<Cliente> {

    public ClienteRepo() {
        this.connectionDb();
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
            List<Cliente> clientes = repo.leer();
            System.out.println(clientes);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int crear(Cliente cliente) throws SQLException {
        String sql = String.format("INSERT INTO cliente (id, nombre, apellido, rut)" + "VALUES ('%d', '%s', '%s', '%s')"
                , cliente.getId(), cliente.getNombre(), cliente.getApellido(), cliente.getRut());

        return this.ejecutarSql(sql);
    }

    @Override
    public List<Cliente> leer() throws SQLException {
        String str = "SELECT * FROM cliente";
        this.consultar(str);
        List<Cliente> clientes = new ArrayList<>();
        while(rs.next()) {
            Cliente cliente = crearCliente(rs);
            clientes.add(cliente);
        }
        return clientes;
    }

    @Override
    public int actualizar(Cliente cliente) throws SQLException {
        return 0;
    }

    @Override
    public int eliminar(int id) throws SQLException {
        return 0;
    }
}
