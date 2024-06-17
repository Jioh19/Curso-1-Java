package cl.alkemy.examen2.dao;

import cl.alkemy.examen2.model.Inventario;

import java.sql.ResultSet;
import java.util.List;

public interface InventarioDao {

    List<Inventario> findAll(String tienda, String categoria, String marca);
}
