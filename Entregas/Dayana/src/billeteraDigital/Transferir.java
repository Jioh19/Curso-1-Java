package billeteraDigital;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transferir extends Usuario {

    private List<Float> transferencias = new ArrayList<>();

    public static void menuTrans() throws Exception {

        Usuario usuario = new Usuario();
        
        Scanner transf = new Scanner(System.in);

        System.out.println();
        System.out.println("Saldo disponible: CLP " + usuario.getSaldo());
        System.out.println();
        System.out.println("***   TRANSFERENCIAS   ***");
        System.out.println();
        System.out.println("Seleccione Tipo de Moneda: ");
        System.out.println();
        System.out.println("1. Dolar.");
        System.out.println("2. Euro.");
        System.out.println("3. Peso.");
        System.out.println("4. Volver.");
        System.out.println();
        System.out.print("Ingrese una opción: ");
        int opcion = transf.nextInt();

        switch (opcion) {

            case 1:
                Scanner leerDolar = new Scanner(System.in);
                float tipoCambioDolar = 935.66f;
                float pesosChileno;
                float dolares;
                float montoD;

                System.out.println();
                System.out.print("Ingrese monto en USD: ");
                dolares = leerDolar.nextFloat();
                pesosChileno = dolares * tipoCambioDolar;

                System.out.println();
                System.out.println("El equivalente en CLP es: " + pesosChileno);
                System.out.println();
                float saldoD = usuario.getSaldo();
    
                
                if (pesosChileno <= saldoD) {
                    montoD = pesosChileno;
                    transferencias.add(montoD);
                    saldoD -= montoD;
                    System.out.println();
                    System.out.println("Se retiraron: " + pesosChileno + " CLP de su saldo.");
                    System.out.println();
                    System.out.println("Saldo Actual Disponible: CLP " + saldoD);
                    usuario.setSaldo(saldoD);
                    System.out.println();

                } else {
                    System.out.println();
                    System.out.println("SALDO INSUFICIENTE!");
                    System.out.println("NO SE PUEDE REALIZAR LA TRANSFERENCIA");
                    System.out.println();
                }
                menuTrans();
                break;

            case 2:
                Scanner leerEuro = new Scanner(System.in);
                float tipoCambioEuro = 1002.12f;
                float pesosChilenos;
                float euros;
                float montoE;

                System.out.println();
                System.out.print("Ingrese monto en EURO: ");
                euros = leerEuro.nextFloat();

                pesosChilenos = euros * tipoCambioEuro;

                System.out.println();
                System.out.println("El equivalente en CLP es: " + pesosChilenos);
                System.out.println();
                float saldoE = usuario.getSaldo();

                if (pesosChilenos <= saldoE) {
                    montoE = pesosChilenos;
                    transferencias.add(montoE);
                    saldoE -= montoE;
                    System.out.println();
                    System.out.println("Se retiraron: " + pesosChilenos + " CLP de su saldo.");
                    System.out.println();
                    System.out.println("Saldo Actual Disponible: CLP " + saldoE);
                    usuario.setSaldo(saldoE);
                    System.out.println();

                } else {
                    System.out.println();
                    System.out.println("SALDO INSUFICIENTE!");
                    System.out.println("NO SE PUEDE REALIZAR LA TRANSFERENCIA");
                    System.out.println();
                }
                menuTrans();
                break;

            case 3:
                Scanner leerP = new Scanner(System.in);
                float montoP;

                System.out.println();
                System.out.print("Ingrese monto en CLP: ");
                montoP = leerP.nextFloat();

                float saldo = usuario.getSaldo();

                if (montoP <= saldo) {
                    transferencias.add(montoP);
                    saldo -= montoP;
                    System.out.println();
                    System.out.println("Se retiraron: " + montoP + " CLP de su saldo.");
                    System.out.println();
                    System.out.println("Saldo Actual Disponible: CLP " + saldo);
                    usuario.setSaldo(saldo);
                    System.out.println();

                } else {
                    System.out.println();
                    System.out.println("SALDO INSUFICIENTE!");
                    System.out.println("NO SE PUEDE REALIZAR LA TRANSFERENCIA");
                    System.out.println();
                }
                menuTrans();
                break;

            case 4:
                System.out.println("Volviendo...");
                Menu.menu();
                break;
            default:
                System.out.println();
                System.out.println("Opción no valida...");
                System.out.println("Ingrese una opción valida.");
                menuTrans();
                break;
        }

    }

    public static void movTransferencia() {

        System.out.println();
        System.out.println("TRANSFERENCIAS: ");

        for (float transferir : transferencias) {
            LocalDate fechaActual = LocalDate.now();
            System.out.println("Transferencia por: CLP " + transferir+" con fecha "+fechaActual);
        }
    }

}
