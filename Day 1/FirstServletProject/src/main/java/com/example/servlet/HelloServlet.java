package com.example.servlet;

import jakarta.servlet.http.*;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello from Servlet!</h1>");
    }
}
