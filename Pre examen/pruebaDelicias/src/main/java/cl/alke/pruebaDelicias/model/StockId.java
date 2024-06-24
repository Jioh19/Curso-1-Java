package cl.alke.pruebaDelicias.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class StockId implements Serializable {

    private int idProducto;
    private int idSucursal;

    public StockId(int idProducto, int idSucursal) {
        this.idProducto = idProducto;
        this.idSucursal = idSucursal;
    }
}
