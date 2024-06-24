package cl.alke.pruebaDelicias.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "stock")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@IdClass(StockId.class)
public class Stock {
    @Id
    private int idProducto;
    @Id
    private int idSucursal;
    private int stock;
    private int FK_idAdministrador;
}
