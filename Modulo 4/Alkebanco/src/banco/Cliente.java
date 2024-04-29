package banco;

import java.util.LinkedList;
import java.util.List;

public class Cliente {

    private String nombre;
    private String apellido;
    private String rut;
    private String password;
    List<Cuenta> cuentas;


    public Cliente(String nombre, String apellido, String rut, String password) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.password = password;
        cuentas = new LinkedList<Cuenta>() {
            @Override
            public String toString() {
                String result = new String();
                for(int i = 0; i < cuentas.size(); i++) {
                    result += cuentas.get(i);
                }
                return result;
            }
        };
    }

    public void addCuenta(Cuenta c) {
        cuentas.add(c);
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    @Override
    public String toString() {
        //*****************************************************
        return String.format("**%15s%-10s%10s%-14s**\n", "Nombre:", nombre, "Apellido:", apellido)+
                String.format("**%15s%-10s%10s%-14s**\n", "Password:", password, "RUT:", rut)+
                "*****************************************************\n"+
                cuentas +
                "*****************************************************\n";

//		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", rut=" + rut + ", password=" + password
//				+ ", cuentas=" + cuentas + "]";
    }



}
