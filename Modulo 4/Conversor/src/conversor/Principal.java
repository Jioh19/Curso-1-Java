package conversor;

import java.util.*;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {
        Moneda peso = new Moneda("Peso Chileno", 1, "CLP");
        Moneda dolar = new Moneda("Dolar Americano", 0.001059, "USD");
        Moneda euro = new Moneda("Euro", 0.00098474, "EUR");
        Moneda yen = new Moneda("Yen Japones", 0.1622, "JPY");
        List<Moneda> monedas = new ArrayList<>();
        monedas.add(peso);
        monedas.add(dolar);
        monedas.add(euro);
        monedas.add(yen);


        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese moneda base");
            String base = sc.next().toUpperCase();
            System.out.println("Ingrese monto");
            double monto = sc.nextDouble();
            System.out.println("Ingrese moneda destino");
            String destino = sc.next().toUpperCase();


            Moneda monedaBase = null;

            for (Moneda moneda : monedas) {
                if (moneda.getCode().equals(base)) {
                    monedaBase = moneda;
                    break;
                }
            }
            var monedaB = monedas.stream().filter(m -> m.getCode().equals(base))
                    .collect(Collectors.toList()).getFirst();

            System.out.println(monedaB);
            System.out.println(monto * dolar.getConversion() / peso.getConversion());

        }catch (InputMismatchException e) {
            System.err.println("Ingrese valor válido");
        }catch (NoSuchElementException e) {
            System.err.println("Moneda no encontrada");
        }




    }
}
