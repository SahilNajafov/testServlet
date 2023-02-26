package com.example.test;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello Servlet!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<title>Main</title>");
        out.println("<head>");
        out.println("<link rel='stylesheet' type='text/css' href='csss.css' />");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"sign1\" id=\"log\">\n");
        out.println("<a href=\"signup.jsp\">Sign up</a>");
        out.println("</div>");
        out.println("<div class=\"sign\" id=\"log\">\n");
        out.println("<a href=\"login.jsp\">Log in</a>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
        out.flush();
    }

    public void destroy() {
    }
}