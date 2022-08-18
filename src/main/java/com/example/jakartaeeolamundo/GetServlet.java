package com.example.jakartaeeolamundo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "getServlet", value = "/getServlet")
public class GetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<h2>Estamos estudando servlet<h2>");

        out.println("<html><body>");
        out.println("<h1> verificando tipo do método " + request.getMethod()+"</h1>");
        out.println("<h1> verificando tipo do protocolo " + request.getProtocol()+"</h1>");
        out.println("<h1> verificando tipo do path " + request.getContextPath()+"</h1>");
        out.println("<h1> verificando tipo do nome local " + request.getLocalName()+"</h1>");
        out.println("<h1> verificando tipo do endereco " + request.getLocalName()+"</h1>");
        out.println("</body></html>");

    }
}
