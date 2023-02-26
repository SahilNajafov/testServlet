<%--
  Created by IntelliJ IDEA.
  User: Notebook
  Date: 26.02.2023
  Time: 0:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel='stylesheet' type='text/css' href='cslogin.css' />
</head>
<body>
<div class="part2">
    <div class="login_box">
        <div class="login_box_head">
            <h1>Log in</h1>
            <form method="get" action="log-in">
                <div class="username_">
                    <label class="label">Email</label>
                    <input type="text" required class="input-email" name="email">
                </div>
                <div class="pass">
                    <label class="label">Password</label>
                    <input type="password" required class="input-pass" name="password">
                </div>
                <div class="empty"></div>
                <input type="submit" value="Log in" class="login-button">
            </form>
            <div class=”text”>
                <p class="p">Don't have an account? <a href="{% url 'register' %}">Sign up</a></p>
            </div>
        </div>
    </div>
</div>
</body>
</html>
