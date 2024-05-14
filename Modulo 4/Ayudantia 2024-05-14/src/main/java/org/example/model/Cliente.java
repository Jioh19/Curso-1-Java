package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private int id;
    private String password;
    List<Cuenta> cuentas;

    public Cliente(String nombre, int id, String password) {
        this.nombre = nombre;
        this.id = id;
        this.password = password;
        cuentas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
}
