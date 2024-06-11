package com.example.crudConsola.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cliente {
    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
}
