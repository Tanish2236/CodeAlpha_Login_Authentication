<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
    Boolean registrationSuccess = (Boolean)request.getAttribute("registrationSuccess");
	Boolean invalidCredentials = (Boolean)request.getAttribute("invalidCredentials");
%>

<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h2>Login</h2>
    <% if (registrationSuccess != null && registrationSuccess) { %>
        <div style="color: green;">Registration Successful. Please Login</div>
    <% } %>
    
    <% if (invalidCredentials != null && invalidCredentials) { %>
        <div style="color: red;">Invalid Username or Password</div>
    <% } %>
    
    <form action="LoginServlet" method="post">
        Username: <input type="text" name="username"><br>
        Password: <input type="password" name="password"><br>
        <input type="submit" value="Login">
    </form>
</body>
</html>
