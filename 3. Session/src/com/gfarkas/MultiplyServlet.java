package com.gfarkas;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class MultiplyServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

        HttpSession session = request.getSession();

        int i = (int) session.getAttribute("i");
        int j = (int) session.getAttribute("j");
        int k = (int) session.getAttribute("k");

        PrintWriter out = response.getWriter();
        out.println(i + " plus " + j + " = " + k);
        out.println(i + " multiplied by " + j + " = " + i * j);

    }
}
