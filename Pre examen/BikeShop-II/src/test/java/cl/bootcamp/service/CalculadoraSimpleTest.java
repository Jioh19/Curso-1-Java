package cl.bootcamp.service;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraSimpleTest {
    List<Integer> ventas = new ArrayList<>();
    CalculadoraSimple calcu = new CalculadoraSimple();
    @Test
    void calcula() {
        ventas.add(136);
        ventas.add(460);
        ventas.add(395);
        ventas.add(122);
        ventas.add(441);
        ventas.add(256);
        ventas.add(1690);
        ventas.add(699);
        ventas.add(525);
        ventas.add(654);

        int resultado = calcu.calcula(ventas);
        assertEquals(resultado, 161);
    }
}