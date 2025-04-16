<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<div class="login-box">
    <h2>Login</h2>
    <form action="login" method="post">
        <label for="username">Username</label>
        <input type="text" name="username" required>

        <label for="password">Password</label>
        <input type="password" name="password" required>

        <input type="submit" value="Login">
    </form>
</div>
</body>
</html>
