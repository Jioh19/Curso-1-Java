package cl.alke.bike69.service;

import cl.alke.bike69.dao.CategoryDao;
import cl.alke.bike69.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Categoryservice {

    @Autowired
    CategoryDao dao;

    public List<String> getCategoria() {
        return dao.getCategory();
    }

}
