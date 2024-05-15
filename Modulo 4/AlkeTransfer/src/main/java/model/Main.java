package model;

import service.ServiceBanco;
import service.ServiceCliente;
import service.ServiceCuenta;
import service.ServiceCuentaCorriente;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Chile", "1");
        Cuenta cuenta1 = new CuentaCorriente();
        Cuenta cuenta2 = new CuentaCorriente();
        Cuenta cuenta3 = new CuentaCorriente();
        Cuenta cuenta4 = new CuentaCorriente();
        Cliente cliente1 = new Cliente("Juan Oh", "15335679-3", "pass123");
        Cliente cliente2 = new Cliente("Natalia Peña", "20882884-3", "123456");

        ServiceBanco.addCliente(banco, cliente1);
        ServiceBanco.addCliente(banco, cliente2);
        ServiceCuenta sc = new ServiceCuentaCorriente();
        sc.deposito(cuenta1, 1000000);
        sc.deposito(cuenta2, 5000000);
        sc.deposito(cuenta3, 2000000);
        sc.deposito(cuenta4, 3000000);

        ServiceCliente.addCuenta(cliente1, cuenta1);
        ServiceCliente.addCuenta(cliente1, cuenta2);
        ServiceCliente.addCuenta(cliente2, cuenta3);
        ServiceCliente.addCuenta(cliente2, cuenta4);
        ServiceBanco.transferCuenta(cuenta1, cuenta4, 500000);
        System.out.println(banco);
    }
}
