package com.gfarkas;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MultiplyServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int i = Integer.parseInt(request.getParameter("i"));
        int j = Integer.parseInt(request.getParameter("j"));
        int k = Integer.parseInt(request.getParameter("k"));

        PrintWriter out = response.getWriter();
        out.println(i + " plus " + j + " = " + k);
        out.println(i + " multiplied by " + j + " = " + i * j);

    }
}
