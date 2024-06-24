package cl.alke.pruebaDelicias.service;

import cl.alke.pruebaDelicias.dao.StockDao;
import cl.alke.pruebaDelicias.model.Stock;
import cl.alke.pruebaDelicias.model.StockId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    @Autowired
    StockDao dao;

    public Stock getStockPorId(StockId id){
        System.out.println(id);
        return dao.getReferenceById(id);
    }

    public int getStock(int idProducto, int idSucursal) {
        return dao.getStock(idProducto, idSucursal);
    }
}
