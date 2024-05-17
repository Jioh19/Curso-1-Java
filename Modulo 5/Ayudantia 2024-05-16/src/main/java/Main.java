import modelo.*;
import servicio.ServicioBanco;
import servicio.ServicioCuenta;
import servicio.ServicioCuentaCorriente;
import servicio.ServicioCliente;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Chiste");
        Cliente cliente = new Cliente("Juan", "456465", "pass123");
        ServicioBanco.addCliente(banco, cliente);
        Cuenta cuenta1 = new CuentaCorriente();
        Cuenta cuenta2 = new CuentaComplicada(2, 5000000);
        ServicioCuenta sc = new ServicioCuentaCorriente();
        sc.deposito(cuenta1, 1000000);
        sc.deposito(cuenta2, 4000000);

        double x = 10, y;

        ServicioCliente.addCuenta(cliente, cuenta1);
        ServicioCliente.addCuenta(cliente, cuenta2);
       // System.out.println(cliente);

        try {
            ServicioBanco.transferencia(cuenta2, cuenta1, 1200000);
            ServicioBanco.transferencia(cuenta2, cuenta1, 1200000);

        }catch(RuntimeException e) {
            System.err.println(e.getMessage());

        }

        System.out.println(banco);


    }
}
