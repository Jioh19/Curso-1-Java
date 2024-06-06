package com.example.springinit.controllers;

import com.example.springinit.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public User details() {
        User user = new User("Jovanka", "Ramos", "jovank.ramos@mail.com");
        return user;
    }

    @GetMapping("/list")
    public List<User> list() {
        var user1 = new User("Dayana", "Carvajal");
        var user2 = new User("Victoria", "Escudero", "victoria.escudero@mundofeliz.com");
        var user3 = new User("Joaquien", "Gallardo", "joaquin.gallardo@mundofeliz.com");
        var user4 = new User("Juan", "Oh", "juan.oh@mundofeliz.com");
        var user5 = new User("Camila", "Cerda", "camila.cerda@mundofeliz.com");
        return List.of(user1, user2, user3, user4, user5);
    }
}
