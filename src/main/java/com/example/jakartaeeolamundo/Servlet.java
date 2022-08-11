package com.example.jakartaeeolamundo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<h1>Dando Continuidade em Servlet<h1>");
        out.println("<html><body>");
        out.println("<h1> Testando outro servlet   " + request.getContextPath() + "</h1>");
        out.println("informaçoes de nome:  " + request.getLocalName() + "<br>");
        out.println("informaçoes de endereço:  " + request.getLocalAddr() + "<br>");
        out.println("informaçoes de porta:  " + request.getLocalPort() + "<br>");
        out.println("informaçoes de metodo:  " + request.getMethod() + "<br>");
        out.println("informaçoes de protocolo:  " + request.getProtocol() + "<br>");
        out.println("</body></html>");

    }
}
