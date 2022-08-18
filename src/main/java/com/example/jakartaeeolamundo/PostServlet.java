package com.example.jakartaeeolamundo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "postServlet", value = "/postServlet")
public class PostServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();

        String nome;
        String senha;
        String endereco;
        String telefone;

        out.println("<h2>------<h2>");
        out.println("<html><body>");
        out.println("<h1> Ola, " + request.getParameter("nome") + "</h1>");
        out.println("<h1> Sua senha é: " + request.getParameter("senha") + "</h1>");
        out.println("<h1> Seu endereco é:  " + request.getParameter("endereco") + "</h1>");
        out.println("<h1> Seu telefone é: " + request.getParameter("telefone") + "</h1>");
        out.println("</body></html>");
    }
}
