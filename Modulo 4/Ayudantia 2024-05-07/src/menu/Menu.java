package menu;

import Model.Cliente;
import Principal.Login;

import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void getMenu(List<Cliente> clientes){
        var menu = """
                ******************************************
                **        Bienvenidos al AlkeBanco      **
                ******************************************
                ** 1- Login                             **
                ** 2- Salir                             **
                ******************************************""";
        System.out.println(menu);
        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt();
        switch(option) {
            case 1:
                Cliente cliente = Login.getCliente(clientes);
                System.out.println(cliente);
                break;
            case 2:
                System.out.println("Gracias por usar Alke Banco");
                break;
            default:
                System.out.println("Comando incorrecto");
                break;
        }
    }
}
