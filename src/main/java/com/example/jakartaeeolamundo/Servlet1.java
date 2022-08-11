package com.example.jakartaeeolamundo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet1", value = "/Servlet1")
public class Servlet1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("nome");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<h1>Utilizando Formulário<h1>");
        out.println("<html><body>");
        out.println("<h1> Oi, " +nome+ "</h1>");
        out.println("</body></html>");
    }
}
