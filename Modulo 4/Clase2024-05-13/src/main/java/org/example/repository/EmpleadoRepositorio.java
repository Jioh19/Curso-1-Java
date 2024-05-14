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
        return null;
    }

    @Override
    public void guardar(Empleado empleado) throws SQLException {

    }

    @Override
    public void eliminar(int id) throws SQLException {
        try(
                Connection connection = obtenerConexion();
                PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM empleados WHERE id=?")) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        }


    }
}
