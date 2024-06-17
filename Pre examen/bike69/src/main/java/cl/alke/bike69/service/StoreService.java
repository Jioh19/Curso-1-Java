package cl.alke.bike69.service;

import cl.alke.bike69.dao.StoreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    StoreDao dao;

    public List<String> getTienda() {
        return dao.getStore();
    }
}
