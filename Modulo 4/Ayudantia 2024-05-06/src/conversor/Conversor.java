package conversor;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Conversor {

    public static void convertir() {
        Moneda peso = new Moneda("Chilean Peso", 1, "CLP");
        Moneda dolar = new Moneda("American Dollar", 0.001059, "USD");
        Moneda euro = new Moneda("Euro", 0.00098474, "EUR");
        Moneda yen = new Moneda("Japanese Yen", 0.1622, "JPY");
        List<Moneda> monedas = new ArrayList<>();
        monedas.add(peso);
        monedas.add(dolar);
        monedas.add(euro);
        monedas.add(yen);

//        double monto = 100000;
//        System.out.printf("%.2f", (monto * peso.getTasa() / yen.getTasa()));
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese moneda base");
            String base = sc.next().toUpperCase();
            System.out.println("Ingrese monto");
            double monto = sc.nextDouble();
            System.out.println("Ingrese moneda destino");
            String destino = sc.next().toUpperCase();

            Moneda monedaBase = null;
            Moneda monedaDestino = null;
            for(Moneda moneda : monedas) {
                if(moneda.getCode().equals(base)) {
                    monedaBase = moneda;
                }
                if(destino.equals(moneda.getCode())) {
                    monedaDestino = moneda;
                }
            }
            if(monedaBase == null || monedaDestino == null) {
                throw new MiException("Ingresa una moneda válida");
            }
            System.out.println("Moneda base " + monedaBase.getCode());
            System.out.println("Moneda destino " + monedaDestino.getCode());
            System.out.printf("Monto base: %.2f\nMonto destino: %.2f", monto,
                    (monto * monedaDestino.getTasa() / monedaBase.getTasa()));

        } catch (InputMismatchException e) {
            System.err.println("Ingresa un número válido");
            convertir();
        } catch (MiException e) {
            System.err.println(e.getMessage());
            convertir();
        } catch (Exception e) {
            System.err.println(e.getCause());
        }

//        Moneda monedaBase = monedas.stream()
//                        .filter(moneda -> moneda.getCode().equals(base))
//                                .collect(Collectors.toList()).get(0);
//
//        var monedaDestino = monedas.stream()
//                        .filter(m -> m.getCode().equals(destino))
//                                .collect(Collectors.toList()).get(0);
    }
}
