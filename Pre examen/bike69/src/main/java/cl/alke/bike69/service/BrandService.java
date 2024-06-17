package cl.alke.bike69.service;

import cl.alke.bike69.dao.BrandDao;
import cl.alke.bike69.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {

    @Autowired
    BrandDao dao;

    public List<String> getBrand() {
        return dao.getBrand();
    }
}
