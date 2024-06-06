package com.example.springinit.controllers;

import com.example.springinit.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Dayana", "Carvajal");
        user.setEmail("dayana.carvajal@gmail.com");
        model.addAttribute("title", "Spring Init");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/user/list")
    public String list(ModelMap model) {
        model.addAttribute("title", "Listado de usuario");
        model.addAttribute("users", userModel());
        return "list";
    }

    @ModelAttribute("users")
    public List<User> userModel() {
        return Arrays.asList(
                new User("Dayana", "Carvajal"),
                new User("Victoria", "Escudero", "victoria.escudero@mundofeliz.com"),
                new User("Joaquien", "Gallardo", "joaquin.gallardo@mundofeliz.com"),
                new User("Juan", "Oh", "juan.oh@mundofeliz.com"),
                new User("Camila", "Cerda", "camila.cerda@mundofeliz.com")
        );
    }
}
