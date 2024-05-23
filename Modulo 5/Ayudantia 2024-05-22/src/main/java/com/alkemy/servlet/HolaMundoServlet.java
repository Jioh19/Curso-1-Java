package com.alkemy.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hola")
public class HolaMundoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        String saludo = req.getParameter("saludo");
        String nombre = req.getParameter("nombre");
        String html = """ 
                <!doctype html>
                <html lang="es">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport"
                          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
                    <meta http-equiv="X-UA-Compatible" content="ie=edge">
                    <title>Mi Servlet</title>
                </head>
                <body>
                <h1 style="border: red 2px solid">Este es mi titulo</h1>
                <p class="miParrafo" style="border: blue 2px solid">Este es mi atajo para escribir en el servlet!</p>
                <h4>Saludo:""" + saludo + " Nombre: " + nombre + """
                </h4>
                </body>
                </html>
                """;
        out.println(html);
        out.close();

    }
}
