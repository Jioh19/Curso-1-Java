package cl.alke.bike69.dao;

import cl.alke.bike69.model.Brand;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BrandDao extends CrudRepository<Brand, Integer> {

    @Query("SELECT brand_name FROM Brand")
    public List<String> getBrand();
}
