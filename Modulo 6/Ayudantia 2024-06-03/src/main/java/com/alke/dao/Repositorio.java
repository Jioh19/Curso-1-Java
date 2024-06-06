package com.alke.dao;
import java.sql.SQLException;
import java.util.List;

public interface Repositorio<T> {
    //implemetar CRUD

    //Create
    int crear(T t) throws SQLException;

    //Read
    List<T> leer() throws SQLException;

    //Update
    int actualizar(T t) throws SQLException;

    //Delete
    int eliminar(int id) throws SQLException;

}
