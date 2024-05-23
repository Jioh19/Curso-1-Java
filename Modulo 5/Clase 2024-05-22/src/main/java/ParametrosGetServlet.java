import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/parametros/get")
public class ParametrosGetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        String saludo = req.getParameter("saludo");
        String nombre = req.getParameter("nombre");
        String html = """
        <DOCTYPE html>
        <html>
            <head>
                <meta charset=\"UTF-8\">
                <title>Hola mundo!</title>
            </head>
            <body>
                <h3>Saludo:""" +
                saludo + " " + nombre + """ 
            </h3>
            </body>
        </html>
        """;
        out.println(html);
        out.close();

    }
}
