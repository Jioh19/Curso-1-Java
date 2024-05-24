import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import java.io.IOException;

@WebServlet("/registro")
public class FormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String pais = req.getParameter("pais");

        Map<String, String> errores = new HashMap<String, String>();
        if(username == null || username.isEmpty()) {
            errores.put("username", "debe ingresar un usuario válido");
        }
        if(password == null || password.isEmpty()) {
            errores.put("password", "debe ingresar un password válido");
        }
        if(email == null || !email.contains("@")) {
            errores.put("email", "debe ingresar un email válido");
        }
        if(pais == null || pais.isEmpty()) {
            errores.put("pais", "debe ingresar un pais válido");
        }
        if(errores.isEmpty()) {
            try (PrintWriter out = resp.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html lang=\"es\">");
                out.println("<head>");
                out.println("<meta charset=\"UTF-8\">");
                out.println("<title>Registro</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Registro</h1>");
                out.println("<ul>");
                out.println("<li>Usuario: " + username + "</li>");
                out.println("<li>Password: " + password + "</li>");
                out.println("<li>Email: " + email + "</li>");
                out.println("<li>Pais: " + pais + "</li>");
                out.println("</ul>");
                out.println("</body>");
                out.println("</html>");
            }
        }else {
            req.setAttribute("errores", errores);
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }
    }
}
