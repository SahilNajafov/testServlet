<%--
  Created by IntelliJ IDEA.
  User: Notebook
  Date: 26.02.2023
  Time: 0:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign up</title>
    <link rel='stylesheet' type='text/css' href='csss.css' />
</head>
<body>
<div class="part2">
    <div class="login_box">
        <div class="login_box_head">
            <h1>Sign up</h1>
            <form method="POST" action="sign-up">
                <div class="email_">
                    <label class="label">Email</label>
                    <input type="email" class="input-email" required name="email">
                </div>
                <div class="firstname_">
                    <label  class="label">Firstname</label>
                    <input type="text" class="input-firstname" required name="firstname">
                </div>
                <div class="lastname_">
                    <label  class="label">Lastname</label>
                    <input type="text" class="input-lastname" required name="lastname">
                </div>
                <div class="pass">
                    <label  class="label">Password</label>
                    <input type="password" class="input-pass" required name="password">
                </div>
                <div class="repass">
                    <label  class="label">Password confirmation</label>
                    <input type="password" class="input-repass" required name="repassword">
                </div>
                <div class="empty"></div>
                <input type="submit" value="Sign up" class="signup-button" required>
            </form>
            <div class=”text”>
                <p class="p">Have an account already? <a href="log-in">Log in</a></p>
            </div>
        </div>
    </div>
</div>
</body>
</html>
