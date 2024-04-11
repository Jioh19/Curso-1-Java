import java.util.Scanner;

public class Sumatoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero para la sumatoria");
        int num = sc.nextInt();
        int total = 0;
        for(int i = 1; i <= num; i++) {
            total += i;
            System.out.println(i + " " + total);
        }
        System.out.println("El total es de: " + total);
        sc.close();
    }
}
