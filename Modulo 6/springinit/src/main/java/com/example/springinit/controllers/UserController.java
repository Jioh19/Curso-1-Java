package com.example.springinit.controllers;

import com.example.springinit.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Dayana", "Carvajal");
        user.setEmail("dayana.carvajal@gmail.com");
        model.addAttribute("title", "Spring Init");
        model.addAttribute("user", user);
        return "detail";
    }
}
