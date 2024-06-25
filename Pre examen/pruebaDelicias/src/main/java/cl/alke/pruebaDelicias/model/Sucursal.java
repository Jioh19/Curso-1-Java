package cl.alke.pruebaDelicias.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="SUCURSAL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sucursal {
    @Id
    private int idSucursal;
    private String nombre;
    private String direccion;
    private String comuna;
    private String telefono;
}
