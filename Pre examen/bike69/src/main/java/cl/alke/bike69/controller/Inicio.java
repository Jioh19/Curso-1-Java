package cl.alke.bike69.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import cl.alke.bike69.model.Info;
import cl.alke.bike69.model.Inventario;
import cl.alke.bike69.service.InventarioService;


@Controller
public class Inicio {

    @Autowired
    InventarioService inventario;

    @GetMapping("/")
    public String index(Model model) {

        return "index";
    }

    @PostMapping("/")
    public String getIndex(@ModelAttribute("info") Info info, Model model){

        List<Inventario> resultado = inventario.getInventario(info.getStore(), info.getCategory(), info.getBrand());
        model.addAttribute("inventario", resultado);
        System.out.println(resultado);
        return "index";
    }


}
