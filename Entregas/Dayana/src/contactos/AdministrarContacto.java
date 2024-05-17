package contactos;

import java.util.ArrayList;
import java.util.Scanner;

public class AdministrarContacto {

    private static ArrayList<Contactos> listaContactos = new ArrayList<Contactos>();

    public static ArrayList<Contactos> getListarContactos() {
        return listaContactos;
    }

    public void setListarContactos(ArrayList<Contactos> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public static void listarContactos() {
        for (Contactos contactos : listaContactos) {
            System.out.println();
            System.out.println("Datos del Contacto: ");
            System.out.println("Id: " + contactos.getId());
            System.out.println("Rut: " + contactos.getRut());
            System.out.println("Nombre Contacto: " + contactos.getNombreContacto());
            System.out.println("Tipo Cuenta: " + contactos.getTipoCuenta());
            System.out.println("Número Cuenta: " + contactos.getNumeroCuenta());
            System.out.println("Nombre Banco: " + contactos.getNombreBanco());

        }
    }

    public static void agregarContacto(Contactos contacto) {

        listaContactos.add(contacto);

    }

    public static void buscarEditarContacto() {

        Scanner leer = new Scanner(System.in);
        System.out.println();
        System.out.println("Ingrese Rut para buscar contacto: ");
        String rut = leer.nextLine();

        for (Contactos contacto : listaContactos) {

            if (rut.equals(contacto.getRut())) {

                System.out.println();
                System.out.println("Datos del Contacto: ");
                System.out.println("Id: " + contacto.getId());
                System.out.println("Rut: " + contacto.getRut());
                System.out.println("Nombre Contacto: " + contacto.getNombreContacto());
                System.out.println("Tipo Cuenta: " + contacto.getTipoCuenta());
                System.out.println("Número Cuenta: " + contacto.getNumeroCuenta());
                System.out.println("Nombre Banco: " + contacto.getNombreBanco());
                System.out.println();

                Scanner nuevo = new Scanner(System.in);

                System.out.println("Se puede Modificar: tipo de cuenta, numero de cuenta ó nombre de banco ");
                System.out.println("Ingrese campo a modificar en el contacto: ");
                System.out.println();
                System.out.println("Si no desea modificar escriba 'no' ");

                String campo = nuevo.nextLine();

                switch (campo) {
                    case "tipo de cuenta":
                        System.out.println();
                        Scanner tipoCuenta = new Scanner(System.in);
                        System.out.println("Ingrese Nuevo Tipo de Cuenta: ");
                        String tipoCuentaN = tipoCuenta.nextLine();
                        contacto.setTipoCuenta(tipoCuentaN);
                        System.out.println();
                        System.out.println("Modificación Existosa");
                        System.out.println();
                        System.out.println("Si no desea seguir en la busqueda, PRESIONE EL NUMERO 0");
                        buscarEditarContacto();
                        break;

                    case "numero de cuenta":
                        Scanner numeroCuenta = new Scanner(System.in);
                        System.out.println();
                        System.out.println("Ingrese Nuevo Número de Cuenta: ");
                        String numeroCuentaN = numeroCuenta.nextLine();
                        contacto.setNumeroCuenta(numeroCuentaN);
                        System.out.println();
                        System.out.println("Modificación Existosa");
                        System.out.println();
                        System.out.println("Si no desea seguir en la busqueda, PRESIONE EL NUMERO 0");
                        buscarEditarContacto();
                        break;

                    case "nombre de banco":
                        Scanner nombreBanco = new Scanner(System.in);
                        System.out.println("Ingrese Nuevo Banco: ");
                        String nombreBancoN = nombreBanco.nextLine();
                        contacto.setNombreBanco(nombreBancoN);
                        System.out.println();
                        System.out.println("Modificación Existosa");
                        System.out.println();
                        System.out.println("Si no desea seguir en la busqueda, PRESIONE EL NUMERO 0");
                        buscarEditarContacto();
                        break;

                    case "no":
                        System.out.println();
                        System.out.println("Si no desea buscar otro contacto, PRESIONE EL NUMERO '0' ");
                        buscarEditarContacto();
                        break;
                    default:
                        System.out.println("Campo NO Existe o NO Se Puede Modificar");
                        buscarEditarContacto();
                        break;
                }

            } else {
            }
        }

    }

}
