package Principal;
import Model.Cliente;

import java.nio.file.AccessDeniedException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Login {
    static Cliente cliente = null;

    public static Cliente getCliente(List<Cliente> clientes) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingrese id de usuario");
            int id = sc.nextInt();
            System.out.println("Ingrese password de usuario");
            String pass = sc.next();

            for (Cliente c : clientes) {
                if (c.getId() == id) {
                    if (c.getPassword().equals(pass)) {
                        cliente = c;
                    }
                }
            }


            if (cliente == null) {
                throw new AccessDeniedException("Id o password Incorrectos");
            }

            sc.close();

        } catch(AccessDeniedException | InputMismatchException e) {
            System.out.println(e.getMessage());
            getCliente(clientes);
        } catch(Exception e) {
            System.out.println("Error desconocido");
        }
        return cliente;

    }
}
