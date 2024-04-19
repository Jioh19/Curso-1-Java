package com.always.personal;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Personal {
    public static void main(String[] args) throws FileNotFoundException {
        Persona pedro = new Persona();
        pedro.setNombre("Pedro");
        pedro.setApellido("González");
        pedro.setEdad(25);
        Persona alexander = new Persona("Alexander", "Perez", 9);

        File fl = new File("input.txt");
        Scanner sc = new Scanner(fl);



        String menu = """
                *******************************************
                ** Hola como esta, Juan os ama           **
                ** Bienvenidos a la AlkeWallet           **
                *******************************************""";
        System.out.println(menu);
        //System.out.printf("**%10s%s", "Nombre: ");
        System.out.printf("**%10s%-13s%8s%-8d**\n", "Nombre: ", pedro.getNombre(), "Edad: ", pedro.getEdad());
        System.out.printf("**%10s%-13s%8s%-8d**\n", "Nombre: ", alexander.getNombre(), "Edad: ", alexander.getEdad());
    }
}
