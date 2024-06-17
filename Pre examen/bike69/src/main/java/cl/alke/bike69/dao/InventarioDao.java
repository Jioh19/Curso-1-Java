package cl.alke.bike69.dao;

import cl.alke.bike69.model.Inventario;

import java.util.List;

public interface InventarioDao {

    List<Inventario> findAll(String tienda, String categoria, String marca);
}
