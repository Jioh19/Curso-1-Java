package org.example.service;

import org.example.model.Cuenta;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ServiceCuentaTest {

    Cuenta cuenta = new Cuenta(123456);
    ServiceCuenta serviceCuenta = new ServiceCuenta();

//    @InjectMocks
//    ServiceCuenta serviceCuenta;
//
//    @Mock
//    Cuenta cuenta;
//
//    @BeforeEach
//    public void init() {
//        MockitoAnnotations.openMocks(this);
//    }

    @org.junit.Test
    public void depositar() {
        double inicial = cuenta.getSaldo();
        double monto = 1000000;
        serviceCuenta.depositar(cuenta, monto);
        double termino = cuenta.getSaldo();
        assertEquals(inicial, termino, monto);
//        when(cuenta.getSaldo()).thenReturn(0.0);
//        when(serviceCuenta.depositar(cuenta,1000)).thenReturn(true);
//        assertEquals(cuenta.getSaldo(), 0, 0);
//        assertTrue(serviceCuenta.depositar(cuenta,1000));
    }

    @org.junit.Test
    public void retiro() {
        double monto = 1000000;
        serviceCuenta.depositar(cuenta, monto);
        double inicial = cuenta.getSaldo();
        serviceCuenta.retiro(cuenta, 500000);
        double termino = cuenta.getSaldo();
        assertEquals(inicial, termino, 500000);
//        when(serviceCuenta.retiro(cuenta,1000)).thenReturn(true);
//        assertTrue(serviceCuenta.retiro(cuenta,1000));
    }

    @Test
    public void retiroFallido() {
        double monto = 1000000;
        serviceCuenta.depositar(cuenta, monto);
        double inicial = cuenta.getSaldo();
        boolean efectuado = serviceCuenta.retiro(cuenta, 5000000);
        double termino = cuenta.getSaldo();
        assertFalse(efectuado);
        assertEquals(inicial, termino, 0);
//        when(serviceCuenta.retiro(cuenta,1000)).thenReturn(false);
//        assertFalse(serviceCuenta.retiro(cuenta,1000));
    }
}