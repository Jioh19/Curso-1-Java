package cl.alkemy.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/UsuarioServlet")
public class UsuarioServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entre al servlet");
       // resp.sendRedirect(req.getContextPath() + "/usuario.jsp");
        String nombre = req.getParameter("nombre");
        String password = req.getParameter("password");
        String rut = req.getParameter("rut");
        System.out.println(nombre + " " + password + " " + rut);

//        List<Usuario> usuarios = servicio.leer();
//
//        for(Usuario usuario : usuarios) {
//            if(usuario.getNombre().equals(nombre) || usuario.getPassword().equals(password)) {
//                req.setAttribute("nombre", nombre);
//                req.setAttribute("password", password);
//                req.setAttribute("rut", rut);
//                getServletContext().getRequestDispatcher("/usuario.jsp").forward(req, resp);
//            } else {
//                resp.sendRedirect("error.jsp");
//            }
//        }

        req.setAttribute("nombre", nombre);
        req.setAttribute("password", password);
        req.setAttribute("rut", rut);
        getServletContext().getRequestDispatcher("/usuario.jsp").forward(req, resp);
    }
}
