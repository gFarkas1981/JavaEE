package com.gfarkas;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MultiplyServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int i = 0;
        int j = 0;
        int k = 0;

        Cookie[] cookies = request.getCookies();

        for (Cookie cookie : cookies) {

            if (cookie.getName().equals("i")) i = Integer.parseInt(cookie.getValue());
            if (cookie.getName().equals("j")) j = Integer.parseInt(cookie.getValue());
            if (cookie.getName().equals("k")) k = Integer.parseInt(cookie.getValue());

        }

        PrintWriter out = response.getWriter();
        out.println(i + " plus " + j + " = " + k);
        out.println(i + " multiplied by " + j + " = " + i * j);

    }
}
