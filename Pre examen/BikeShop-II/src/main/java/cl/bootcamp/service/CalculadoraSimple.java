package cl.bootcamp.service;

import java.util.List;

public class CalculadoraSimple implements CalculadoraBeneficios{
    @Override
    public int calcula(List<Integer> ventas) {
        int resultado = 0;
        for(int venta: ventas) {
            resultado += venta;
        }
        resultado = resultado *3/100;

        return resultado;
    }
}
