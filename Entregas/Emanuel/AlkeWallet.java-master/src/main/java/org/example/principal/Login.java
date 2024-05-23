package org.example.principal;

import org.example.model.Usuario;

import java.nio.file.AccessDeniedException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Login {static Usuario usuario = null;

    public static Usuario getUsuario(List<Usuario> usuarios){
        Scanner log = new Scanner(System.in);

        try {

            System.out.println("Ingrese el rut del usuario: ");
            String rut = log.next();
            System.out.println("Ingrese su clave secreta: ");
            String psw = log.next();
            log.close();


            for (Usuario u : usuarios) {
                if (u.getRut().equals(rut)) {
                    if (u.getPassword().equals(psw)) {
                        usuario = u;
                    }
                }
            }
            if (usuario == null) {
                throw new AccessDeniedException("Rut o clave incorrectos.");
            }
            log.close();


        } catch(AccessDeniedException | InputMismatchException e){
            System.err.println(e.getMessage());
            getUsuario(usuarios);
        } catch(Exception e){
            System.err.println("Error desconocido.");
        }
        return usuario;

    }
}

