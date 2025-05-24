package com.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        if ("admin".equals(username) && "password".equals(password)) {
            response.getWriter().println("<h1>Login Successful</h1>");
        } else {
            response.getWriter().println("<h1>Login Failed</h1>");
        }
    }
}
