package servicio;

import modelo.Banco;
import modelo.Cliente;
import modelo.Cuenta;
import modelo.CuentaComplicada;
import modelo.CuentaCorriente;

public class ServicioBanco {

    public static void addCliente(Banco banco, Cliente cliente) {
        if(cliente == null) {
            throw new NullPointerException("Verificar cliente");
        }
        banco.getClientes().put(cliente.getId(), cliente);
    }

    public static void transferencia(Cuenta origen, Cuenta destino, double monto) {

        ServicioCuenta scO = seleccionServicio(origen);
        ServicioCuenta scD = seleccionServicio(destino);

        if(scD.checkDeposito(destino, monto) && scO.checkRetiro(origen, monto)) {
            scO.retiro(origen, monto);
            scD.deposito(destino, monto);
        } else {
            throw new RuntimeException("Error en el deposito y/o retiro");
        }
    }

    public static ServicioCuenta seleccionServicio(Cuenta cuenta) {
        if(cuenta instanceof CuentaCorriente) {
            return new ServicioCuentaCorriente();
        } else if(cuenta instanceof CuentaComplicada) {
            return new ServicioCuentaComplicada();
        } else
            return null;
    }
}
