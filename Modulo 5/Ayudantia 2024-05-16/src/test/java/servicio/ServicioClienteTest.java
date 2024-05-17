package servicio;

import modelo.Cliente;
import modelo.Cuenta;
import modelo.CuentaCorriente;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServicioClienteTest {

    Cliente cliente = new Cliente("Juan", "123", "pass");
    Cuenta cuenta = new CuentaCorriente();

    @Test(expected = Exception.class)
    public void addCuenta() throws NullPointerException {
        int inicio = cliente.getCuentas().size();
        ServicioCliente.addCuenta(cliente, cuenta);
        int fin = cliente.getCuentas().size();
        assertNotEquals(inicio, fin);
        ServicioCliente.addCuenta(null, null);
    }
}