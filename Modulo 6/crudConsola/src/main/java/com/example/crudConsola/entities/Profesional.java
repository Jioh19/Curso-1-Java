package com.example.crudConsola.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="profesional")
public class Profesional {
    @Id
    private Integer id;
}
