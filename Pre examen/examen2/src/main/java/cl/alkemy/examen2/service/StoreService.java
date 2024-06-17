package cl.alkemy.examen2.service;

import cl.alkemy.examen2.dao.StoreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    StoreDao dao;

    public List<String> getNombre() {
        return dao.getName();

    }
}
