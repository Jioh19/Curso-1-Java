package cl.alkemy.examen2.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Inventario {
    private String tienda;
    private int idProducto;
    private String nombreProducto;
    private int inventario;
}
