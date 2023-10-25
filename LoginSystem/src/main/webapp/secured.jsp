<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Secured Page</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h2>Welcome, <%= session.getAttribute("username") %>! It is a Secured Page.</h2>
    <a href="LogoutServlet" class="button">Logout</a>
</body>
</html>
