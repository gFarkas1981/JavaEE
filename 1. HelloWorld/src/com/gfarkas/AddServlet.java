package com.gfarkas;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // GET or POST method
        PrintWriter out = response.getWriter();
        out.println("FROM service");
        add(request, response);

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // POST method only
        PrintWriter out = response.getWriter();
        out.println("FROM doPost");
        add(request, response);

    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // GET method only
        PrintWriter out = response.getWriter();
        out.println("FROM doGet");
        add(request, response);

    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));

        int k = i + j;

        request.setAttribute("k", k);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("square");
        requestDispatcher.forward(request,response);

    }

}
