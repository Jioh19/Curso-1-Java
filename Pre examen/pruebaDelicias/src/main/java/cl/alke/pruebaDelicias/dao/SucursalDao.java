package cl.alke.pruebaDelicias.dao;

import cl.alke.pruebaDelicias.model.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SucursalDao extends JpaRepository<Sucursal, Integer> {

    @Query(value= "SELECT nombre FROM SUCURSAL", nativeQuery = true)
    public List<String> getNombres();
}
