package cl.alke.bike69.controller;

import cl.alke.bike69.model.Info;
import cl.alke.bike69.model.Inventario;
import cl.alke.bike69.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Api {

    @Autowired
    InventarioService service;

    @GetMapping("/{tienda}/{categoria}/{marca}")
    public ResponseEntity<List<Inventario>> listInventario(
            @PathVariable("tienda") String tienda,
            @PathVariable("categoria") String categoria,
            @PathVariable("marca") String marca) {

        List<Inventario> resultados = service.getInventario(tienda, categoria, marca);
        return new ResponseEntity<List<Inventario>>(resultados, HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<List<Inventario>> getIndex(@ModelAttribute("info") Info info){

        List<Inventario> resultados = service.getInventario(info.getStore(), info.getCategory(), info.getBrand());
        return new ResponseEntity<List<Inventario>>(resultados, HttpStatus.OK);
    }
}
