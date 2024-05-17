package modelo;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private String nombre;
    private Map<String, Cliente> clientes;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.clientes = new HashMap<>();
    }

    public Map<String, Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Map<String, Cliente> clientes) {
        this.clientes = clientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", clientes=" + clientes +
                '}';
    }
}
