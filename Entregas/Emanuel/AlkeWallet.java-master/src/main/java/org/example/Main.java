package org.example;


import org.example.menu.Menu;
import org.example.menu.MenuLogin;
import org.example.model.Cuenta;
import org.example.model.Usuario;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Pedro","Perez","12345678-9","abc123");
        Usuario usuario2 = new Usuario("José","López","8765432-1","12345");

        Cuenta cuentaCorriente1 = new Cuenta(123456,0);
        Cuenta cuentaAhorro = new Cuenta(987654,0);
        Cuenta cuentaCorriente2 = new Cuenta(456123,0);


        List<Usuario> usuarios = new LinkedList<>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);

        usuario1.getCuentas().add(cuentaCorriente1);
        usuario1.getCuentas().add(cuentaAhorro);
        usuario2.getCuentas().add(cuentaCorriente2);

        MenuLogin.menuLogin(usuarios);
        //Menu.menu(usuarios);
    }


}