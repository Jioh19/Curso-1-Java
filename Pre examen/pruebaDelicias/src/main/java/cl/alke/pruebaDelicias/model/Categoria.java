package cl.alke.pruebaDelicias.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="CATEGORIA_PRODUCTO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Categoria {
    @Id
    private int idCategoriaProducto;
    private String nombre;
    private String descripcion;

}
