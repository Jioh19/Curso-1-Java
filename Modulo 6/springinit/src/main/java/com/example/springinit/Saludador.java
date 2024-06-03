package com.example.springinit;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludador {

    @RequestMapping("/")
    public String saludar() {
        return "Hola mundo";
    }
}
