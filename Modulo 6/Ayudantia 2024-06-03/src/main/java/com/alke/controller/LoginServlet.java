package com.alke.controller;

import com.alke.dao.UsuarioRepositorio;
import com.alke.model.Usuario;
import com.alke.service.UsuarioService;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entre al servlet do get");
        String nombre = req.getParameter("nombre");
        String password = req.getParameter("password");

        UsuarioService service = new UsuarioService();
        List<Usuario> usuarios = service.obtenerUsuarios();


        for(Usuario usuario: usuarios) {
            if(usuario.getNombre().equals(nombre)) {
                if(usuario.getPassword().equals(password)) {
                    System.out.println("Login exitoso!!! " + usuario);
                    req.setAttribute("usuario", usuario);
                    getServletContext().getRequestDispatcher("/home.jsp").forward(req, resp);
                }
            }
        }



    }
}
