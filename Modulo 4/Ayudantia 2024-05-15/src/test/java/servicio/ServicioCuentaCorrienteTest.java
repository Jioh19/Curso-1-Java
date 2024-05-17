package servicio;

import modelo.CuentaCorriente;
import org.junit.Test;
import modelo.Cuenta;


import static org.junit.Assert.*;

public class ServicioCuentaCorrienteTest {

    Cuenta cuenta = new CuentaCorriente();
    ServicioCuenta sc = new ServicioCuentaCorriente();


    @Test(expected = Exception.class)
    public void checkDeposito() throws NullPointerException{
        double monto = 1000;
        boolean resultado = sc.checkDeposito(cuenta, monto);
        assertTrue(resultado);
        resultado = sc.checkDeposito(null, monto);

    }

    @Test(expected = Exception.class)
    public void checkRetiro() throws NullPointerException{
        cuenta.setMonto(1000);
        boolean resultado = sc.checkRetiro(cuenta, 500);
        assertTrue(resultado);

        resultado = sc.checkRetiro(cuenta, 500000);
        assertFalse(resultado);

        resultado = sc.checkRetiro(null, 1000);

    }

    @Test
    public void deposito() {
        double inicio = cuenta.getMonto();
        sc.deposito(cuenta, 1000);
        double fin = cuenta.getMonto();
        assertEquals(inicio, fin, 1000);
    }

    @Test
    public void retiro() {
        double inicio = cuenta.getMonto();
        sc.retiro(cuenta, 1000);
        double fin = cuenta.getMonto();
        assertEquals(inicio, fin, 1000);
    }
}