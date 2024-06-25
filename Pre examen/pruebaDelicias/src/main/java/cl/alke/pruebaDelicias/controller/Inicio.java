package cl.alke.pruebaDelicias.controller;

import cl.alke.pruebaDelicias.model.Categoria;
import cl.alke.pruebaDelicias.model.Consulta;
import cl.alke.pruebaDelicias.model.Seleccion;
import cl.alke.pruebaDelicias.service.CategoriaService;
import cl.alke.pruebaDelicias.service.ConsultaService;
import cl.alke.pruebaDelicias.service.SucursalService;
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
    SucursalService sucursalService;
    @Autowired
    CategoriaService categoriaService;
    @Autowired
    ConsultaService consultaService;

    @GetMapping("/")
    public String inicio(Model model) {

        List<String> sucursales = sucursalService.getNombres();
        List<Categoria> categorias = categoriaService.getCategorias();

        model.addAttribute("sucursales", sucursales);
        model.addAttribute("categorias", categorias);
        return "inicio";
    }

    @PostMapping("/")
    public String getInicio(@ModelAttribute("seleccion") Seleccion seleccion, Model model) {


        List<Consulta> resultado = consultaService.getConsulta(seleccion.getSucursal(), seleccion.getCategoria());
        model.addAttribute("resultados", resultado);

        return "inicio";
    }
}
