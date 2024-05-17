package modelo;

import java.util.HashMap;
import java.util.Map;

public class Cliente {
    private String nombre;
    private String id;
    private String pass;
    private Map<String, Cuenta> cuentas;

    public Cliente(String nombre, String id, String pass) {
        this.nombre = nombre;
        this.id = id;
        this.pass = pass;
        this.cuentas = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Map<String, Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(Map<String, Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", pass='" + pass + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
}
