package cl.alke.bike69.controller;

import cl.alke.bike69.model.Info;
import cl.alke.bike69.model.Inventario;
import cl.alke.bike69.service.BrandService;
import cl.alke.bike69.service.Categoryservice;
import cl.alke.bike69.service.StoreService;
import cl.alke.bike69.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class Inicio {

    @Autowired
    StoreService storeService;
    @Autowired
    Categoryservice categoryservice;
    @Autowired
    BrandService brandService;
    @Autowired
    InventarioService inventario;

    @GetMapping("/")
    public String index(Model model) {

        List<String> stores = storeService.getTienda();
        List<String> categories = categoryservice.getCategoria();
        List<String> brands = brandService.getBrand();
        model.addAttribute("stores", stores);
        model.addAttribute("categories", categories);
        model.addAttribute("brands", brands);
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
