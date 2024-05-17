package contactos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoContacto {

    private static ArrayList<Contactos> contactosExtraidos;

    public static void cargarDatos() throws IOException {

        File file = new File("src/contactos/contactos.csv");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String linea;

            while ((linea = bufferedReader.readLine()) != null) {
                String[] datos = linea.split(",");
                System.out.println();
                String id = datos[0];
                String rut = datos[1];
                String nombreContacto = datos[2];
                String tipoCuenta = datos[3];
                String numeroCuenta = datos[4];
                String nombreBanco = datos[5];

                Contactos contactos = new Contactos(id, rut, nombreContacto, tipoCuenta, numeroCuenta, nombreBanco);
                AdministrarContacto.agregarContacto(contactos);
                
            }
        }

        public static void listarContactos(){
            System.out.println("Contacto: ");
            System.out.println();
            AdministrarContacto.listarContactos();
        }

        public static void extraerContacto(){
            contactosExtraidos = AdministrarContacto.getListarContactos();

            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/contactos/contactos.csv"));

                for(Contactos contacto : contactosExtraidos){
                    bufferedWriter.write(contacto.getId()+","+contacto.getRut()+","+contacto.getNombreContacto()+","+contacto.getTipoCuenta()+","+contacto.getNumeroCuenta()+","+contacto.getNombreBanco()+",");
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            }
            catch (IOException e){
                System.out.println(e);
            }

        }
}
