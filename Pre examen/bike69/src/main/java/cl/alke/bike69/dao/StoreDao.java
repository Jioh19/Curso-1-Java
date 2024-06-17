package cl.alke.bike69.dao;

import cl.alke.bike69.model.Store;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StoreDao extends CrudRepository<Store, Integer> {

    @Query("SELECT store_name FROM Store")
    public List<String> getStore();
}
