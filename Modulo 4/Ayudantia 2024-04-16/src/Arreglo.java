import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Arreglo {
    public static void main(String[] args) throws FileNotFoundException {

        File miArchivo = new File("input.sql");
        Scanner scanner = new Scanner(miArchivo);
        String primera = scanner.next();
        String segunda = scanner.next();
        scanner.nextLine();
        String tercera = scanner.nextLine();

        System.out.println(primera + " " + segunda + " " + tercera);

        int arreglo[] = new int[10];
        String palabra = "palabra";
        int largo = palabra.length();
        for(int i = 0; i < arreglo.length ; i++) {
            arreglo[i] = (int)(Math.random() * 1000);
        }
        System.out.println(Arrays.toString(arreglo));

        for(int j = 0; j < arreglo.length; j++) {
            for(int i = 0 ; i < arreglo.length - 1; i++) {
                if(arreglo[i] > arreglo[i+1]) {
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i+1];
                    arreglo[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arreglo));
    }
}
