package cl.alke.pruebaDelicias.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Consulta {
    private String sucursal;
    @Id
    private int id;
    private String producto;
    private String categoria;
    private int stock;
}
