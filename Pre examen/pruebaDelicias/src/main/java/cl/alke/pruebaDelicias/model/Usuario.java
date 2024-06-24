package cl.alke.pruebaDelicias.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CLIENTE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    private String rutCliente;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String direccion;
    private String comuna;
    private String telefono;
    @Column(name = "e-mail")
    private String email;
    private int puntos;

}
