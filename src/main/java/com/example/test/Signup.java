package com.example.test;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(name = "signup", value = "/sign-up")
public class Signup extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {



        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();



        String email = String.valueOf(request.getParameter("email"));
        String firstname = String.valueOf(request.getParameter("firstname"));
        String lastname = String.valueOf(request.getParameter("lastname"));
        String password = String.valueOf(request.getParameter("password"));


//        String regexForMail = "^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
//        String regexForPassword = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
//
//        Pattern pattern = Pattern.compile(regexForMail);
//        Matcher matcher = pattern.matcher(email);
//
//        Pattern pattern2 = Pattern.compile(regexForPassword);
//        Matcher matcher2 = pattern2.matcher(password);
//
//
//        if(matcher.matches() && matcher2.matches()){
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            String url = "jdbc:postgresql://localhost:5432/registration";
            try {
                Connection connection = DriverManager.getConnection(url, "postgres", "123SsAaBgcd00!");
                PreparedStatement preparedStatement = connection.prepareStatement(
                        "insert into public.users values" +
                                "(nextval('user_id'),'" + firstname + "','" + lastname + "','" + email + "','" + password + "')"
                );


                out.println("done!");
                preparedStatement.executeUpdate();
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
//    }

    public void destroy() {
    }
}