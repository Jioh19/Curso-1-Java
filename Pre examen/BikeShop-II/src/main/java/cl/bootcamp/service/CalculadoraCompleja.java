package cl.bootcamp.service;

import java.util.List;

public class CalculadoraCompleja implements CalculadoraBeneficios{
    @Override
    public int calcula(List<Integer> ventas) {
        int resultado = 0;

        for(int venta: ventas) {
            int beneficio = (int) (venta*0.01);
            if(venta > 1000 && venta <= 5000) {
                beneficio += (int)(venta*0.05);
            } else if(venta > 5000) {
                beneficio += 100;
            } else if(venta > 500 && venta <= 1000) {
                beneficio += (int)(venta*0.02);
            }
            resultado += beneficio;
        }

        return resultado;
    }
}
