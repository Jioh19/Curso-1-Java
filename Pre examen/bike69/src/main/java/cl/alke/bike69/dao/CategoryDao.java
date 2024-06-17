package cl.alke.bike69.dao;

import cl.alke.bike69.model.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryDao extends CrudRepository<Category, Integer> {

    @Query("SELECT category_name FROM Category")
    public List<String> getCategory();
}
