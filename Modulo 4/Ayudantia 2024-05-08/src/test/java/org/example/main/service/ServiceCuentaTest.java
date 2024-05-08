package org.example.main.service;

import org.example.main.model.Cuenta;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceCuentaTest {

    Cuenta cuenta = new Cuenta(123456);
    ServiceCuenta serviceCuenta = new ServiceCuenta();

    @org.junit.Test
    public void depositar() {
        double inicial = cuenta.getSaldo();
        double monto = 1000000;
        serviceCuenta.depositar(cuenta, monto);
        double termino = cuenta.getSaldo();
        assertEquals(inicial, termino, monto);

    }

    @org.junit.Test
    public void retiro() {
        double monto = 1000000;
        serviceCuenta.depositar(cuenta, monto);
        double inicial = cuenta.getSaldo();
        serviceCuenta.retiro(cuenta, 500000);
        double termino = cuenta.getSaldo();
        assertEquals(inicial, termino, 500000);
    }

    @Test
    public void retiroFallido() {
        double monto = 1000000;
        serviceCuenta.depositar(cuenta, monto);
        double inicial = cuenta.getSaldo();
        boolean efectuado = serviceCuenta.retiro(cuenta, 5000000);
        double termino = cuenta.getSaldo();
        assertFalse(efectuado);
    }
}