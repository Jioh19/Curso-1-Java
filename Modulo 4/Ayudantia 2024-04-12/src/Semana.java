

import java.util.Scanner;

public class Semana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while(continuar) {
            System.out.println("Ingrese el dia");
            int dia = scanner.nextInt();
            switch(dia) {
                case 1:
                    System.out.println("Hoy es lunes");
                    break;
                case 2:
                    System.out.println("Hoy es martes");
                    break;
                case 3:
                    System.out.println("Hoy es miércoles");
                    break;
                case 4:
                    System.out.println("Hoy es jueves");
                    break;
                case 5:
                    System.out.println("Hoy es viernes");
                    break;
                case 6:
                    System.out.println("Hoy es sábado");
                    break;
                case 7:
                    System.out.println("Hoy es domingo");
                    break;
                case 0:
                    continuar = false;
                    break;

                default:
                    System.out.println("Ingresa un valor válido");
                    break;
            }
        }
        scanner.close();
    }
}
