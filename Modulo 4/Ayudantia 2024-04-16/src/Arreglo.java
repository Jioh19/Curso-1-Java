import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arreglo {
    public static void main(String[] args) throws FileNotFoundException {

        File miArchivo = new File("input.txt");
        Scanner scanner = new Scanner(miArchivo);
        String primera = scanner.next();
        String segunda = scanner.next();
        scanner.nextLine();
        String tercera = scanner.nextLine();

        System.out.println(primera + " " + segunda + " " + tercera);
    }
}
