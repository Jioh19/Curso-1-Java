package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cliente {
    private String nombre;
    private String id;
    private String password;
    private Map<String, Cuenta> cuentas;
    private List<Transferencia> transferencias;

    public Cliente(String nombre, String id, String password) {
        this.nombre = nombre;
        this.id = id;
        this.password = password;
        this.cuentas = new HashMap<>();
        this.transferencias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public Map<String, Cuenta> getCuentas() {
        return cuentas;
    }

    public List<Transferencia> getTransferencias() {
        return transferencias;
    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
}
