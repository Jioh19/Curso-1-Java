package banco;

public class Banco {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan", "Oh", "123456789", "987654321");
        Cuenta cuentaAhorro = new CuentaAhorro();
        Cuenta cuentaVista = new CuentaVista();
        Cuenta cuentaDolares = new CuentaDolar();
        Cuenta cuentaEuro = new CuentaEuro();

        cliente.addCuenta(cuentaAhorro);
        cliente.addCuenta(cuentaVista);
        cliente.addCuenta(cuentaDolares);
        cliente.addCuenta(cuentaEuro);


        cuentaAhorro.depositar(200000);
        cuentaVista.depositar(69420);
        cuentaDolares.depositar(2000);
        cuentaEuro.depositar(4000);


        String bienvenida = """
				*****************************************************
				**          Bienvenido al Alke Banco               **
				*****************************************************""";

        String menu = """
				*****************************************************
				** 1- Depositar                                    **
				** 2- Retirar                                      **
				** 0- Salir                                        **
				*****************************************************""";
        System.out.println(bienvenida);
        System.out.println(menu);
        System.out.println(cliente);

        for(Cuenta cuenta : cliente.getCuentas()) {

            if(cuenta instanceof Conversor) {
                System.out.printf("Tengo $%.2f dolares, lo que equivale a $%.2f pesos\n",
                        cuenta.getSaldo(),
                        ((Conversor) cuenta).conversorPeso(cuenta.getSaldo()));

            }
        }
    }

}
