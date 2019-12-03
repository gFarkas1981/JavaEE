package com.gfarkas;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyOtherServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();


        ServletConfig config = getServletConfig();
        String name = config.getInitParameter("name");
        String phone = config.getInitParameter("phone");
        out.print("Hi " + name + ". You have a " + phone + ".");

    }


}
