package cl.alke.pruebaDelicias.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.alke.pruebaDelicias.dao.SucursalDao;

import java.util.List;

@Service
public class SucursalService {

    @Autowired
    SucursalDao dao;

    public List<String> getNombres() {
        return dao.getNombres();
    }
}
