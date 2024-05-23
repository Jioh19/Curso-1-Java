package org.example.service;

import org.example.model.Usuario;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceUsuarioTest {
    ServiceUsuario serviceUsuario = new ServiceUsuario();

    Usuario usuario = new Usuario("Pedro","Perez","12345678-9","12345");

    @Test
    public void crearUsuario() {
        int inicio = serviceUsuario.leerUsuarios().size();
        String resultado = ServiceUsuario.crearUsuario(usuario);
        int fin = serviceUsuario.leerUsuarios().size();
        assertEquals(inicio+1,fin);
        assertEquals(resultado,"El usuario fue creado correctamente.");
    }

    @Test
    public void leerUsuarios() {
        var resultado = serviceUsuario.leerUsuarios();
        assertNotNull(resultado);
    }

    @Test
    public void actualizarUsuario() {
        int inicio = serviceUsuario.leerUsuarios().size();
        String resultado = ServiceUsuario.actualizarUsuario(usuario);
        int fin = serviceUsuario.leerUsuarios().size();
        assertEquals(resultado,"El usuario fue actualizado correctamente.");
    }

    @Test
    public void eliminarUsuario() {
        String resultado = serviceUsuario.eliminarUsuario(null);
        assertEquals(resultado,"El usuario no pude ser eliminado.");
    }
}