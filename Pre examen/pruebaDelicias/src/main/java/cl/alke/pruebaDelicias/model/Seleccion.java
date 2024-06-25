package cl.alke.pruebaDelicias.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Seleccion {
    private String sucursal;
    private String categoria;
}
