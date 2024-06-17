package cl.alkemy.examen2.dao;

import cl.alkemy.examen2.model.Stores;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StoreDao extends CrudRepository<Stores, Integer> {

    @Query("SELECT store_name FROM Stores")
    public List<String> getName();
}
