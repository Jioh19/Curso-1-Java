package cl.alke.pruebaDelicias.service;

import cl.alke.pruebaDelicias.dao.CategoriaDao;
import cl.alke.pruebaDelicias.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    CategoriaDao dao;

    public List<Categoria> getCategorias() {
        return dao.findAll();
    }
}
