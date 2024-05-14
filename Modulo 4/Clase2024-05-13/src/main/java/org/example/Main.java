package org.example;

import org.example.model.Empleado;
import org.example.repository.EmpleadoRepositorio;
import org.example.repository.Repositorio;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Repositorio<Empleado> repositorio = new EmpleadoRepositorio();
        repositorio.encontrarTodo().forEach(System.out::println);
        repositorio.eliminar(1);
    }
}
