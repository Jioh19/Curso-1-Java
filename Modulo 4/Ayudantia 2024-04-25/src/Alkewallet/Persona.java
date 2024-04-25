package Alkewallet;

import java.util.LinkedList;
import java.util.List;

public class Persona {
    private String nombre;
    private String rut;
    private List<Cuenta> cuentas;

    public Persona(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
        cuentas = new LinkedList<>();
    }

    public void addCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
}
