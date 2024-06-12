package Fase2.main.clientes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaInicialTest {

    ICategoria persona = new PersonaInicial("15335679-3");
    @Test
    void getCategoria() {
        String resultado = persona.getCategoria();
        assertEquals(resultado, "Inicial");
    }

    @Test
    void checkRut() {
    }
}