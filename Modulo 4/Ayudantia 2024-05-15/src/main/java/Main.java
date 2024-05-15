import modelo.Banco;
import modelo.Cliente;
import modelo.Cuenta;
import modelo.CuentaCorriente;
import servicio.ServicioBanco;
import servicio.ServicioCuenta;
import servicio.ServicioCuentaCorriente;
import servicio.ServicioCliente;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Chiste");
        Cliente cliente = new Cliente("Juan", "456465", "pass123");
        ServicioBanco.addCliente(banco, cliente);
        Cuenta cuenta1 = new CuentaCorriente();
        Cuenta cuenta2 = new CuentaCorriente();
        ServicioCuenta sc = new ServicioCuentaCorriente();
        sc.deposito(cuenta1, 1000000);
        sc.deposito(cuenta2, 5000000);

        ServicioCliente.addCuenta(cliente, cuenta1);
        ServicioCliente.addCuenta(cliente, cuenta2);
       // System.out.println(cliente);

        try {
            ServicioBanco.transferencia(cuenta1, cuenta2, 123456);


        }catch(RuntimeException e) {
            System.err.println(e.getMessage());

        }

        System.out.println(banco);


    }
}
