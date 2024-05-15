package org.example.repository;

import org.example.model.Empleado;
import org.example.util.ConexionDb;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoRepositorio implements Repositorio<Empleado> {

    private Connection obtenerConexion() throws SQLException {
        return ConexionDb.getConection();
    }

    @Override
    public List<Empleado> encontrarTodo() throws SQLException {
        List<Empleado> empleados = new ArrayList<>();
        try (
                Connection connection = obtenerConexion();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement
                        .executeQuery("SELECT * FROM empleados")) {
            while (resultSet.next()) {
                Empleado empleado = crearEmpleado(resultSet);
                empleados.add(empleado);
            }
        }
        return empleados;

    }

    private Empleado crearEmpleado(ResultSet resultSet) throws SQLException {
        Empleado empleado = new Empleado();
        empleado.setId(resultSet.getInt("id"));
        empleado.setNombre(resultSet.getString("nombre"));
        empleado.setPrimerApellido(resultSet.getString("primerApellido"));
        empleado.setSegundoApellido(resultSet.getString("segundoApellido"));
        empleado.setEmail(resultSet.getString("email"));
        empleado.setSalario(resultSet.getFloat("salario"));
        return empleado;

    }

    @Override
    public Empleado obtenerPorId(int id) throws SQLException {
        Empleado empleado = null;
        try (
                Connection connection = obtenerConexion();
                PreparedStatement preparedStatement =
                        connection.prepareStatement("SELECT * FROM empleados WHERE id =?")
        ) {
            preparedStatement.setInt(1, id);
            try (
                    ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    empleado = crearEmpleado(resultSet);
                }
            }

        }
        return empleado;
    }

    @Override
    public void guardar(Empleado empleado) {
        if (empleado == null) {
            return;
        }
        String sql;
        if (empleado.getId() > 0) {
            sql = "UPDATE empleados SET nombre=?, primerApellido=?" +
                    "segundoApellido=?, email=?, salario=? WHERE id=?";
        } else {
            sql = "INSERT INTO empleados (nombre, primerApellido, segundoApellido, email, salario)" +
                    "VALUES (?,?,?,?,?)";
        }

        try (
                Connection connection = obtenerConexion();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, empleado.getNombre());
            preparedStatement.setString(2, empleado.getPrimerApellido());
            preparedStatement.setString(3, empleado.getSegundoApellido());
            preparedStatement.setString(4, empleado.getEmail());
            preparedStatement.setFloat(4, empleado.getSalario());

            if(empleado.getId() > 0) {
                preparedStatement.setInt(6, empleado.getId());
            }

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void eliminar(int id) throws SQLException {
        try (
                Connection connection = obtenerConexion();
                PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM empleados WHERE id=?")) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        }


    }
}
