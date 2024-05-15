package service;

import model.Cliente;
import model.Cuenta;
import model.CuentaCorriente;
import model.Transferencia;

public class ServiceCliente {

    public static void addCuenta(Cliente cliente, Cuenta cuenta) {
        if(cuenta == null) {
            throw new NullPointerException();
        }
        cliente.getCuentas().put(cuenta.getId(), cuenta);
    }

    public static void addTransferencia(Cliente cliente, Transferencia transferencia) {
        if(transferencia == null) {
            throw new NullPointerException();
        }
        cliente.getTransferencias().add(transferencia);
    }


}
