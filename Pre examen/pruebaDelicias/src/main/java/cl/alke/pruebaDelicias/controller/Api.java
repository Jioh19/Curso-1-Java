package cl.alke.pruebaDelicias.controller;

import cl.alke.pruebaDelicias.model.Categoria;
import cl.alke.pruebaDelicias.model.Consulta;
import cl.alke.pruebaDelicias.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Api {

    @Autowired
    ConsultaService consultaService;

    @GetMapping("/{sucursal}/{categoria}")
    public ResponseEntity<List<Consulta>> listConsulta(
            @PathVariable("sucursal") String sucursal,
            @PathVariable("categoria") String categoria
    ) {
        List<Consulta> resultados = consultaService.getConsulta(sucursal, categoria);
        return new ResponseEntity<List<Consulta>>(resultados, HttpStatus.OK);
    }
}
