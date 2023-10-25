<%@ page import="javax.servlet.*"%>
<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<%@ page import="javax.servlet.*" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
    Boolean userExists = (Boolean)request.getAttribute("userExists");
%>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="style.css">
    <title>Registration</title>
</head>
<body>

    <h2>Register</h2>
    <% if (userExists != null && userExists) { %>
        <div style="color: red;">User Already Exists</div>
    <% } %>
    <form action="RegisterServlet" method="post">
        Username: <input type="text" name="username"><br>
        Password: <input type="password" name="password"><br>
        <input type="submit" value="Register">
    </form>
</body>
</html>
