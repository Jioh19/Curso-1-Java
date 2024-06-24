package cl.alke.pruebaDelicias.dao;

import cl.alke.pruebaDelicias.model.Stock;
import cl.alke.pruebaDelicias.model.StockId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StockDao extends JpaRepository<Stock, StockId> {

    @Query(value = "SELECT stock FROM stock WHERE idProducto = :idProducto AND idSucursal = :idSucursal",
            nativeQuery = true)
    int getStock(int idProducto, int idSucursal);

}
