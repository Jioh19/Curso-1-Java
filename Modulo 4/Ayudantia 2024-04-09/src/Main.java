import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++) {
            System.out.println(new Random().nextInt(15));
//            if(i % 15 == 0) {
//                System.out.println("fizzbuzz");
//            }
//            else if(i % 3 == 0) {
//                System.out.println("fizz");
//            }
//            else if(i % 5 == 0) {
//                System.out.println("buzz");
//            } else {
//                System.out.println(i);
//            }

        }


    }
}
