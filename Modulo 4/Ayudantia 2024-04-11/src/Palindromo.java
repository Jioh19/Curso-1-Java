import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        texto = texto.toLowerCase();
        System.out.println(texto);
        texto = texto.replaceAll(" ", "");
        System.out.println(texto);
        for(int i = 0; i < texto.length()/2; i++) {
            if(texto.charAt(i) != texto.charAt(texto.length() - 1 - i)) {
                System.out.println("El texto no es palindromo");
                return;
            }
        }
        System.out.println("El texto SI es palindromo");
    }
}
