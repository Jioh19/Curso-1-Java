package billeteraDigital;
import java.util.Scanner;


public class Menu {

    public static void menu() throws Exception {

        Usuario usuario = new Usuario();

        Scanner opcion = new Scanner(System.in);

        System.out.println();
        System.out.println("Billetera Digital");
        System.out.println("*****************");
        System.out.println();
        System.out.println("Saldo disponible: CLP " + usuario.getSaldo());
        System.out.println();
        System.out.println("*** Tu Sesión ***");
        System.out.println();
        System.out.println("1. Transferencias");
        System.out.println("2. Depósitos");
        System.out.println("3. Contactos");
        System.out.println("4. Movimientos");
        System.out.println("5. Cerrar Sesión");
        System.out.println();
        System.out.println("Que es lo que desea realizar?");
        System.out.print("Seleccione una opción: ");
        int opc = opcion.nextInt();

        switch (opc) {
            case 1:
                Transferir.menuTrans();
                break;
            case 2:
                Depositar.menuDepo();
                break;
            case 3:
                contactos.MenuContacto.menuContacto();
                menu();
                break;
            case 4:
                System.out.println();
                System.out.println("MOVIMIENTOS: ");
                System.out.println("***********");
                Transferir.movTransferencia();
                Depositar.movDepositos();
                menu();
                break;
            case 5:
                System.out.println("Cerrando Sesión...");
                break;

            default:
                System.out.println();
                System.out.println("Opción no valida...");
                System.out.println("Ingrese una opción valida.");
                menu();
                break;
        }
    }

    public static void usuarioN() {

        System.out.println("");
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese Usuario: ");
        String nombreUsuario = leer.nextLine();

        switch (nombreUsuario) {
            case "Dayana Carvajal":
            Usuario usuario = new Usuario(50300f);
            System.out.println();
            System.out.println("Usuario en línea: ");
            System.out.println();
            System.out.println("Nombre: "+nombreUsuario);
            System.out.println("N°Cuenta: "+usuario.getCuenta());
            System.out.println("Saldo en Linea: "+usuario.getSaldo());
            break;
            default:
                System.out.println(" Usuario No registrado");
                usuarioN();
                break;
        }


    }
}
