package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Categoria;
import repository.CategoriaRepository;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/Categoria")
public class CategoriaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Categoria categoria = new Categoria();
        CategoriaRepository repo = new CategoriaRepository();

        categoria.setNombre(req.getParameter("nombre"));

        try {
            repo.guardar(categoria);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
