import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        System.out.printf("* %23s %10s\n", "Ingresa el numero" , "*");
        System.out.println("************************************");
        int primo = scanner.nextInt();
        if(primo == 2 ) {
            System.out.println("************************************");
            System.out.printf("* %24s %10s\n", "El numero es primo" , "*");
            System.out.println("************************************");
            return;
        }
        for(int i = 2; i <= Math.sqrt(primo); i++) {
            if(primo % i == 0) {
                System.out.println("************************************");
                System.out.printf("* %25s %8s\n", "El numero no es primo" , "*");
                System.out.printf("* %22s %d %9s\n", "Es divisible por " , i, "*");
                System.out.println("************************************");
                return;
            }
        }
        System.out.println("************************************");
        System.out.printf("* %24s %10s\n", "El numero es primo" , "*");
        System.out.println("************************************");
    }
}
