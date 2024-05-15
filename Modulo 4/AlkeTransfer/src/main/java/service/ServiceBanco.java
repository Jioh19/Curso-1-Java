package service;

import model.Banco;
import model.Cliente;
import model.Cuenta;
import model.CuentaCorriente;

public class ServiceBanco {

    public static void addCliente(Banco banco, Cliente cliente) {
        if(cliente == null) {
            throw new NullPointerException("No existe el cliente");
        }
        banco.getClientes().put(cliente.getId(), cliente);
    }



    public static void transferCuenta(Cuenta origen,
                                      Cuenta destino,
                                      double monto) {

        ServiceCuenta sc1 = selectService(origen);
        ServiceCuenta sc2 = selectService(destino);
        if(sc1.checkRetiro(origen, monto) && sc2.checkDeposito(destino, monto)) {
            sc1.retiro(origen, monto);
            sc2.deposito(destino, monto);
        } else {
            throw new RuntimeException("Error en los montos");
        }
    }

    public static ServiceCuenta selectService(Cuenta cuenta) {
        if(cuenta instanceof CuentaCorriente) {
            return new ServiceCuentaCorriente();
        }
        return null;
    }
}
