package com.example.learnjspwithsass;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    String user, email, password1, password2;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        user = request.getParameter("username");
        email = request.getParameter("uemail");
        password1 = request.getParameter("pass1");
        password2 = request.getParameter("pass2");

        PrintWriter out = response.getWriter();
        out.println(user);
    }
}
