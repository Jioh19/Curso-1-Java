package org.example.repositorio;

import org.example.modelo.Persona;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class RepositorioPersonaTest {

    private RepositorioPersona repositorioPersona =
            mock(RepositorioPersona.class);
     @Test
    public void testCrearPersona() {
        Persona persona = new Persona("123456789", "Joaquin");
        when(repositorioPersona.crearPersona(persona)).thenReturn(true);
        when(repositorioPersona.crearPersona(null)).thenThrow(new NullPointerException());
        boolean result = repositorioPersona.crearPersona(persona);
        assertTrue(result);
        verify(repositorioPersona).crearPersona(persona);
     }

     @Test
    public void testActualizarPersona() {

     }

     @Test
    public void testListarPersonas() {

     }

     @Test
     public void testBorrarPersona() {

     }

}