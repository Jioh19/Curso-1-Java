package Fase2.main;

import Fase2.main.clientes.ICategoria;
import Fase2.main.clientes.Persona;
import Fase2.main.clientes.PersonaInicial;
import Fase2.main.fabrica.FabricaPersona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<ICategoria> personas = new ArrayList<>();

        ICategoria p1 = FabricaPersona.crearPersona("15335679-3", 7000);
        ICategoria p2 = FabricaPersona.crearPersona("123456789-3", 1000);
        ICategoria p3 = FabricaPersona.crearPersona("46565413-9", 4000);

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese sucural y luego id de producto");
        String linea = sc.nextLine();
        String[] lineas = linea.split(" ");
        int sucursal = Integer.parseInt(lineas[0]);
        int producto = Integer.parseInt(lineas[1]);
        System.out.println(sucursal);
        System.out.println(producto);

        System.out.println("Ingrese rut de la persona");
        String consulta = sc.next();
        ICategoria resultado = null;
        for(ICategoria persona: personas) {
            if(persona.checkRut(consulta)) {
                resultado = persona;
            }
        }
        if(resultado != null) {
            System.out.println("La categoria es : " + resultado.getCategoria());
            System.out.println("Los beneficios son: " + resultado.getBeneficios());

        }
    }
}
