package org.example.repository;

import java.sql.SQLException;
import java.util.List;

public interface Repositorio<T> {
    List<T> encontrarTodo() throws SQLException;

    T obtenerPorId(int id) throws SQLException;

    void guardar(T t) throws SQLException;

    void eliminar(int id) throws SQLException;

}
