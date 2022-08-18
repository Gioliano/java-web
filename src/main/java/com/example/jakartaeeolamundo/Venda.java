package com.example.jakartaeeolamundo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "venda", value = "/venda")
public class Venda extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String produto = request.getParameter("produto");
        float valor = Float.parseFloat(request.getParameter("valor"));
        int quantidade = Integer.parseInt(request.getParameter("quantidade"));
        float total = valor * quantidade;

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<h1>Apresentação de vendas<h1>");
        out.println("<html><body>");
        out.println("<h1> O produto" + produto + " teve um total de vendas de R$:" + total + "</h1>");
        out.println("</body></html>");
    }
}
