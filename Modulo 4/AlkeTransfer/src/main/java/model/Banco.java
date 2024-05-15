package model;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private String nombre;
    private String id;
    private Map<String, Cliente> clientes;

    public Banco(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        clientes = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public Map<String, Cliente> getClientes() {
        return clientes;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", clientes=" + clientes +
                '}';
    }
}
