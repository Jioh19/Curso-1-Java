package cl.alke.ayudantia.controller;

import cl.alke.ayudantia.model.Usuario;
import cl.alke.ayudantia.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public String usuario() {
        Usuario usuario = new Usuario("Victoria", "Escudero", "123456", 0);


        List<Usuario> usuarios = usuarioService.getAll();
        System.out.println(usuarios);
        return "index";
    }

    @GetMapping("/eliminar")
    public String eliminar() {
        usuarioService.delete(5);
        return "index";
    }

    @GetMapping("/apellido")
    public String buscar() {
        System.out.println(usuarioService.encontrarApellido("Llancapan"));
        return "index";
    }
}
