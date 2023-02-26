package com.example.test;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(name = "login", value = "/log-in")
public class Login extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {


        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();


        String email = String.valueOf(request.getParameter("email"));
        String password = String.valueOf(request.getParameter("password"));
//        out.println(password);

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            String url = "jdbc:postgresql://localhost:5432/registration";
            Connection connection = DriverManager.getConnection(url, "postgres", "123SsAaBgcd00!");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from public.users where email='" + email + "'");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (!resultSet.next()) {
                out.println("Try again!");
            } else {
                ResultSet resultSet2 = preparedStatement.executeQuery();
                while (resultSet2.next()) {
                    if (password.equals(resultSet2.getString("password"))) {
                        out.println("Welcome to site!");
                        break;
                    } else {
                        out.println("Try again!");
                    }
                }
            }


            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }





    }
}