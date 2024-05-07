package Principal;

import Model.Cliente;
import Model.Cuenta;
import menu.Menu;

import java.util.List;
import java.util.LinkedList;

public class Principal {
    public static void main(String[] args) {



        Cliente cliente1 = new Cliente("Juan", 123456, "987654");
        Cliente cliente2 = new Cliente("Lee", 321654, "123456");
        Cuenta cuenta1 = new Cuenta(123456);
        Cuenta cuenta2 = new Cuenta(987654);

        List<Cliente> clientes = new LinkedList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);

        cliente1.getCuentas().add(cuenta1);
        cliente2.getCuentas().add(cuenta2);

        cliente2.getCuentas().get(0).depositar(1000000);

        Menu.getMenu(clientes);
    }
}
