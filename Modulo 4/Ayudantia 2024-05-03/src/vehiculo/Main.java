package vehiculo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Vehiculo aeronave = new Avion(20, 1000, 100);
        Vehiculo auto = new Automovil(4, 200, 100);
        Vehiculo barquito = new Barco(10, 30, 100, 2000);
        Vehiculo autoMili = new AutoMilitar(4, 150, 100);
        Vehiculo jet = new AvionMilitar(1, 2000, 100);

        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(aeronave);
        vehiculos.add(auto);
        vehiculos.add(barquito);
        vehiculos.add(autoMili);
        vehiculos.add(jet);

        int personas = 50;

        for(Vehiculo veh : vehiculos) {
            personas -= veh.getPasajeros();
        }

        List<Disparar> disparadores = new LinkedList<>();

        for(Vehiculo veh : vehiculos) {
            if(veh instanceof Disparar) {
                disparadores.add((Disparar)veh);
            }
        }

        System.out.println(disparadores);

        List<Avion> aviones = new ArrayList<>();

        for(Vehiculo veh : vehiculos) {
            if(veh instanceof Avion) {
                aviones.add((Avion)veh);
            }
        }

        System.out.println(aviones);

        System.out.println("La cantidad de personas sin transporte son " + personas);

    }
}
