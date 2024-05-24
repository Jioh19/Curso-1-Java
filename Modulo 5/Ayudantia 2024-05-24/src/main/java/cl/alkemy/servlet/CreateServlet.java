package cl.alkemy.servlet;

import cl.alkemy.model.Cliente;
import cl.alkemy.repositorio.ClienteRepo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/CrearCliente")
public class CreateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String rut = req.getParameter("rut");
        ClienteRepo clienteRep = new ClienteRepo();
        Map<String, String> errores = new HashMap<String, String>();

        if(nombre == null || nombre.trim().isEmpty()) {
            errores.put("nombre", "debe ingresar un nombre válido");
        }
        if(apellido == null || apellido.trim().isEmpty()) {
            errores.put("apellido", "debe ingresar un apellido válido");
        }
        if(rut == null || rut.trim().isEmpty()) {
            errores.put("rut", "debe ingresar un rut válido");
        }
        if(errores.isEmpty()) {
            try (PrintWriter out = resp.getWriter()) {
                ClienteRepo clienteRepo = new ClienteRepo();
                Cliente cliente = new Cliente(nombre, apellido, rut);
                try {
                    clienteRepo.crear(cliente);
                    resp.sendRedirect("exito.jsp");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

            }
        }else {
            req.setAttribute("errores", errores);
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }
    }
}
