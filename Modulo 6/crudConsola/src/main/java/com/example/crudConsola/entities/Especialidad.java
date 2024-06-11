package com.example.crudConsola.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "especialidad")



public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name ="nombre_especialidad", columnDefinition = "varchar(25)", nullable = false)
    private String nombreEspecialidad;
    @Column(name = "descripcion_especialidad", columnDefinition = "varchar(100)", nullable = false)
    private String descripcionEspecialidad;

}
