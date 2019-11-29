package com.gfarkas;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MultiplyServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));
        int k = (int) request.getAttribute("k");

        PrintWriter out = response.getWriter();
        out.println(i + " plus " + j + " = " + k);
        out.println(i + " multiplied by " + j + " = " + i * j);

    }
}
