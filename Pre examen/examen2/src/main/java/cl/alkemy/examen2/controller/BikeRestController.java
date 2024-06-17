package cl.alkemy.examen2.controller;

import cl.alkemy.examen2.model.Inventario;
import cl.alkemy.examen2.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BikeRestController {

    @Autowired
    InventarioService service;

    @RequestMapping(value = "/{tienda}/{categoria}/{marca}", method = RequestMethod.GET)
    public ResponseEntity<List<Inventario>> listInventario(
            @PathVariable("tienda") String tienda,
            @PathVariable("categoria") String categoria,
            @PathVariable("marca") String marca) {


        List<Inventario> inventario = service.getInventario(tienda, categoria, marca);
        if (inventario.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Inventario>>(inventario, HttpStatus.OK);
    }
}
