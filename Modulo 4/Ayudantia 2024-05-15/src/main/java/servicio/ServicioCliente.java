package servicio;

import modelo.Cliente;
import modelo.Cuenta;

public class ServicioCliente {

    public static void addCuenta(Cliente cliente, Cuenta cuenta) {
        if(cuenta == null) {
            throw new NullPointerException();
        }
        cliente.getCuentas().put(cuenta.getId(), cuenta);
    }


}
