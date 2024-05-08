package org.example.service;

import org.example.model.Persona;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ServicioPersonaTest {

    private final ServicioPersona servicioPersona = new ServicioPersona();

    @Test
    public void crearPersona() {
        Persona persona = new Persona("123456789-0", "Joaquin");
        String respuestaServicio = servicioPersona.crearPersona(persona);
        assertEquals("Persona creada", respuestaServicio);

        assertEquals("Persona no creada, verifique los datos",
                servicioPersona.crearPersona(persona));
    }

    @Test
    public void actualizarPersona() {
    }

    @Test
    public void listarPersonas() {

        Map<String, String> listaPersonas = servicioPersona.listarPersonas();
        assertNotNull(listaPersonas);
    }

    @Test
    public void eliminarPersona() {
    }
}