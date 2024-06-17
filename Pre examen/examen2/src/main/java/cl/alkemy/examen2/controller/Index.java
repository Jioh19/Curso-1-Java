package cl.alkemy.examen2.controller;

import cl.alkemy.examen2.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import cl.alkemy.examen2.service.StoreService;

@Controller
@RequestMapping("/")
public class Index {

    @Autowired
    StoreService service;

    @GetMapping("/")
    public String index(Model model) {

        System.out.println("Entre al api/inventario " + service.getNombre());
        model.addAttribute("stores", service.getNombre());
        return "index";
    }
}
