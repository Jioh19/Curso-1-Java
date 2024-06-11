package com.example.crudConsola.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Reserva {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

}
