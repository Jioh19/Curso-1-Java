package org.example.conversor;

import org.example.menu.Menu;
import org.example.model.Usuario;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;




public class Conversor {
    public static void convertir() {

        Moneda peso = new Moneda("Peso Chileno", 1, "CLP");
        Moneda dolar = new Moneda("American Dolar", 0.0011, "USD");
        Moneda euro = new Moneda("Euro", 0.001, "EUR");
        Moneda yen = new Moneda("Yen", 0.1622, "JPY");

        List<Moneda> monedas = new ArrayList<>();
        monedas.add(peso);
        monedas.add(dolar);
        monedas.add(euro);
        monedas.add(yen);

        try {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese la sigla de la moneda base: (CLP, USD, EUR o JPY)");
            String base = leer.next().toUpperCase();
            System.out.println("Ingrese monto a convertir:");
            double monto = leer.nextDouble();
            System.out.println("Ingrese la sigla de la moneda destino:  (CLP, USD, EUR o JPY)");
            String destino = leer.next().toUpperCase();

            Moneda monedaBase = null;
            Moneda monedaDestino = null;

            for (Moneda moneda : monedas) {
                if (moneda.getSigla().equals(base)) {
                    monedaBase = moneda;
                }
                if (destino.equals(moneda.getSigla())) {
                    monedaDestino = moneda;
                }
            }
            if (monedaBase == null || monedaDestino == null) {
                throw new RuntimeException("Ingresa una moneda válida.");
            }
            //cálculo de la conversión de monedas
            double conversion = (monto * monedaDestino.getTasa()/monedaBase.getTasa());
            System.out.println(monto+" " + monedaBase + " corresponden a: "+conversion+" "+monedaDestino);

            //opción para volver al menú

            /*System.out.println("Presione m para volver al menú.");
            String m = leer.next().toUpperCase();
            if (m.equals("M")){
                menu.menu(usuarios);
            } else {
                System.exit(0);
            }*/


        } catch (InputMismatchException e){
            System.err.println("Ingresa un monto válido.");
            convertir();
        } catch (RuntimeException e){
            System.err.println(e.getMessage());
            convertir();
        }


    }
}
