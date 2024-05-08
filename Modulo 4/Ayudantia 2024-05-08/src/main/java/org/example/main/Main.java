package org.example.main;

import org.example.main.model.Cliente;
import org.example.main.model.Cuenta;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan", 123456, "987654");
        Cliente cliente2 = new Cliente("Lee", 321654, "123456");
        Cuenta cuenta1 = new Cuenta(123456);
        Cuenta cuenta2 = new Cuenta(987654);

        List<Cliente> clientes = new LinkedList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);

        cliente1.getCuentas().add(cuenta1);
        cliente2.getCuentas().add(cuenta2);

    }
}
