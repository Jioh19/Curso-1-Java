package org.example.menu;


import java.util.List;
import java.util.Scanner;
import org.example.conversor.Conversor;
import org.example.model.Cuenta;
import org.example.model.Usuario;
import org.example.service.ServiceCuenta;


public class Menu {
    private static Scanner sc = new Scanner(System.in);
    public static void menu(List<Usuario> usuarios) {
        int opc;

        try {


            do {
                var menu =
                        "****************************************" + "\n" +
                                "**     Bienvenido a su AlkeWallet     **" + "\n" +
                                "****************************************" + "\n" +
                                "** 1.- Conversor de monedas           **" + "\n" +
                                "** 2.- Datos de cuenta                **" + "\n" +
                                "** 3.- Depositar                      **" + "\n" +
                                "** 4.- Retirar                        **" + "\n" +
                                "** 5.- Salir                          **" + "\n" +
                                "****************************************";

                System.out.println(menu);
                System.out.println("Entro al menu");
                System.out.println(sc);
                opc = sc.nextInt();
                switch (opc) {
                    case 1:
                        Conversor.convertir();
                        break;
                    case 2:
                        // Mostrar datos de la cuenta
                        for (Usuario usuario : usuarios) {
                            System.out.println(usuario);
                        }
                        break;
                    case 3:
                        System.out.print("Ingrese el número de cuenta: ");
                        int numeroCuenta = sc.nextInt();
                        System.out.println("Ingrese el monto a depositar: ");
                        double montoDeposito = sc.nextDouble();

                        for (Usuario usuario : usuarios) {
                            for (Cuenta cuenta : usuario.getCuentas()) {
                                if (cuenta.getNumeroCuenta() == numeroCuenta) {
                                    if (ServiceCuenta.depositar(cuenta, montoDeposito)) {
                                        System.out.println("Depósito realizado con éxito.");
                                        System.out.println("Su nuevo saldo es de: " + cuenta.getSaldo());
                                    } else {
                                        System.out.println("No se pudo realizar el depósito.");
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    case 4:
                        // Retirar
                        System.out.print("Ingrese el número de cuenta: ");
                        numeroCuenta = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingrese el monto a retirar: ");
                        double montoRetiro = sc.nextDouble();
                        sc.nextLine();

                        for (Usuario usuario : usuarios) {
                            for (Cuenta cuenta : usuario.getCuentas()) {
                                if (cuenta.getNumeroCuenta() == numeroCuenta) {
                                    if (ServiceCuenta.retirar(cuenta, montoRetiro)) {
                                        System.out.println("Retiro realizado con éxito.");
                                        System.out.println("Su nuevo saldo es de: " + cuenta.getSaldo());
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    case 5:
                        System.out.println("¡Gracias por elegir AlkeWallet!");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor elegir una opción válida.");
                        break;
                }
            } while (opc != 5);
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("Lanzo una excepcion");
        }
    }
}
