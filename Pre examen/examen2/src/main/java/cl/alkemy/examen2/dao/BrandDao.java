package cl.alkemy.examen2.dao;

import cl.alkemy.examen2.model.Brands;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BrandDao extends CrudRepository<Brands, Integer> {

    @Query("SELECT brand_name FROM Brands")
    public List<String> getBrands();
}
