package contactos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Contactos {
    private String id;
    private String rut;
    private String nombreContacto;
    private String tipoCuenta;
    private String numeroCuenta;
    private String nombreBanco;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public Contactos(String id, String rut, String nombreContacto, String tipoCuenta, String numeroCuenta,
            String nombreBanco) {
        this.id = id;
        this.rut = rut;
        this.nombreContacto = nombreContacto;
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
        this.nombreBanco = nombreBanco;
    }

    public Contactos() {
    }

    @Override
    public String toString() {
        return "Contactos: \n Id: "+ id +
                            "\n Rut: " + rut + 
                            "\n Nombre Contacto: " + nombreContacto +
                            "\n Tipo de Cuenta: " + tipoCuenta +
                            "\n Número Cuenta: " + numeroCuenta + 
                            "\n Banco: " + nombreBanco;
    }
    public static void cargarDatos() {
        String contactos = "src/contactos/contactos.csv";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(contactos))) {
            String linea;

            while ((linea = bufferedReader.readLine()) != null) {
                String[] datos = linea.split(",");
                System.out.println();

                for (String dato : datos) {
                    System.out.println(dato);

                }
                
            }
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


