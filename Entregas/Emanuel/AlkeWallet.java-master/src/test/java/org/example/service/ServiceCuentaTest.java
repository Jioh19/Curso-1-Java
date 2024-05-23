package org.example.service;

import org.example.model.Cuenta;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceCuentaTest {

    Cuenta cuenta = new Cuenta(123456,0);
    ServiceCuenta serviceCuenta = new ServiceCuenta();

    @Test
    public void depositar() {
        double inicial = cuenta.getSaldo();
        double monto = 250000;
        serviceCuenta.depositar(cuenta,monto);
        double termino = cuenta.getSaldo();
        assertEquals(inicial,termino,monto);

    }

    @Test
    public void retirar() {
        double monto = 250000;
        serviceCuenta.depositar(cuenta,50000);
        double inicial = cuenta.getSaldo();
        serviceCuenta.retirar(cuenta,150000);
        double termino = cuenta.getSaldo();
        assertEquals(inicial,termino,150000);
    }

    @Test
    public void retiroFallido(){
        double monto = 250000;
        serviceCuenta.depositar(cuenta,monto);
        double inicial = cuenta.getSaldo();
        boolean efectuado = serviceCuenta.retirar(cuenta,1500000);
        double termino = cuenta.getSaldo();
        assertFalse(efectuado);
        assertEquals(inicial,termino,0);
    }
}

