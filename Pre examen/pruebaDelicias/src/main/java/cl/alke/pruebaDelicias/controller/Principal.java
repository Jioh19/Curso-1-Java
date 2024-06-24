package cl.alke.pruebaDelicias.controller;

import cl.alke.pruebaDelicias.niveles.Nivel;
import cl.alke.pruebaDelicias.niveles.usuarioGold;
import cl.alke.pruebaDelicias.niveles.usuarioInicial;
import cl.alke.pruebaDelicias.niveles.usuarioSilver;
import cl.alke.pruebaDelicias.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class Principal {

    @Autowired
    StockService service;
    @Autowired
    UsuarioService usuarioService;

    public void controlador() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese sucursal, luego Id Prodcuto");
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        int idSucursal = Integer.parseInt(inputs[0]);
        int idProducto = Integer.parseInt(inputs[1]);

        AlertaStock alerta = null;
        int stock = service.getStock(idProducto, idSucursal);
        if(stock < 13) {
            alerta = new StockBajo();
        } else if(stock >= 13) {
            alerta = new StockNormal();
        }

        alerta.alertar();
        System.out.println("El stock es de: " +stock);

        System.out.println("Ingrese rut");
        String rut = sc.next();

        int puntaje = usuarioService.getPuntaje(rut);
        System.out.println(puntaje);
        Nivel usuario = null;
        if(puntaje > 500 && puntaje <= 3000) {
            usuario = new usuarioInicial();
        } else if(puntaje > 3000 && puntaje <= 6000) {
            usuario = new usuarioSilver();

        } else if(puntaje > 6000) {
            usuario = new usuarioGold();
        }

        System.out.println(usuario.categoria());
        System.out.println(usuario.beneficio());
    }
}
