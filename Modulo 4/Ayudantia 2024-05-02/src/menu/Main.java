package menu;

import java.util.Scanner;
import Calculadora.Calculadora;

import javax.swing.*;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Calculadora calcu = new Calculadora();
        boolean continuar = true;

//        Object[] values = {"Sumar", "Restar"};
//
//        Object value = JOptionPane.showInputDialog(null, "Seleccion operacion", "Input",
//                JOptionPane.INFORMATION_MESSAGE, null,
//                values, values[0]);

        while(continuar) {

            menu.dibujaMenu();
            System.out.println("** Ingresa una seleccion                      **");
            Scanner leer = new Scanner(System.in);
            int opcion = leer.nextInt();

            if(opcion == 1) {
                System.out.println("Has seleccionado la suma");
                System.out.println("Ingresa el primero número");
                double num1 = leer.nextDouble();
                System.out.println("Ingresa el segundo número");
                double num2 = leer.nextDouble();
                double resultado = calcu.sumar(num1, num2);
                System.out.println("La suma es " + resultado);
            } else if(opcion == 2) {
                System.out.println("Has seleccionado la resta");
                System.out.println("Ingresa el primero número");
                double num1 = leer.nextDouble();
                System.out.println("Ingresa el segundo número");
                double num2 = leer.nextDouble();
                double resultado = calcu.restar(num1, num2);
                System.out.println("La resta es " + resultado);
            } else if(opcion == 3) {
                System.out.println("Has seleccionado la multiplicación");
                System.out.println("Ingresa el primero número");
                double num1 = leer.nextDouble();
                System.out.println("Ingresa el segundo número");
                double num2 = leer.nextDouble();
                double resultado = calcu.multiplicar(num1, num2);
                System.out.println("La multiplicación es " + resultado);
            } else if(opcion == 4) {
                System.out.println("Has seleccionado la división");
                System.out.println("Ingresa el primero número");
                double num1 = leer.nextDouble();
                System.out.println("Ingresa el segundo número");
                double num2 = leer.nextDouble();
                double resultado = calcu.dividir(num1, num2);
                System.out.println("La division es " + resultado);
            } else if(opcion == 5) {
                System.out.println("Has seleccionado salir");
                continuar = false;
            } else {
                System.out.println("Has ingresado un valor inválido");
            }

            leer.next();
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
