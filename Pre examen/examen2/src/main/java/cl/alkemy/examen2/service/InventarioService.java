package cl.alkemy.examen2.service;

import cl.alkemy.examen2.dao.InventarioDaoImpl;
import cl.alkemy.examen2.model.Inventario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioService {

    @Autowired
    InventarioDaoImpl dao;

    public List<Inventario> getInventario(String tienda, String categoria, String marca) {
        return dao.findAll(tienda, categoria, marca);
    }
}
