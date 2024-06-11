package cl.bootcamp.main;

import cl.bootcamp.service.CalculadoraBeneficios;
import cl.bootcamp.service.CalculadoraCompleja;
import cl.bootcamp.service.CalculadoraSimple;

import java.util.ArrayList;
import java.util.List;

public class DemoConsola {
    public static void main(String[] args) {
        List<Integer> ventas = new ArrayList<>();

        System.out.println("Tomando 10 valores de montos de venta aleatorios...");
        for(int i = 0; i < 10; i++) {
            int venta = (int) (Math.random() * 1900 + 100);
            System.out.print(venta);
            System.out.print(" ");
            ventas.add(venta);
        }
        System.out.println();
//        ventas.add(136);
//        ventas.add(460);
//        ventas.add(395);
//        ventas.add(122);
//        ventas.add(441);
//        ventas.add(256);
//        ventas.add(1690);
//        ventas.add(699);
//        ventas.add(525);
//        ventas.add(654);

        CalculadoraBeneficios vendedor1 = new CalculadoraSimple();
        System.out.println("La comision simple es de : " + vendedor1.calcula(ventas));

        CalculadoraBeneficios vendedor2 = new CalculadoraCompleja();
        System.out.println("La comision compleja es de : " + vendedor2.calcula(ventas));
    }
}
