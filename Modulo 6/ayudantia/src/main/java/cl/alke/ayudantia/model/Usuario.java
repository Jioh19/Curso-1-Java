package cl.alke.ayudantia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String rut;
    private Integer balance;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String rut, Integer balance) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "\n{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", rut='" + rut + '\'' +
                ", balance=" + balance +
                '}';
    }
}
