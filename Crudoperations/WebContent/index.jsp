<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.mongodb.*" %>
<%@ page import="connection.mongo.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="ShowDetails">
<table>
	<tr><td>Name</td><td><input type="text" name="name"></td></tr>
	<tr><td>Age</td><td><input type="text" name="age"></td></tr>
	<tr><td>Designation</td><td><input type="text" name="designation"><td></tr>
	<tr><td><input type="submit" value="submit"></td></tr>
</table>
</form>
<table>
	<tr><td>
	<%
				
	%>
	</td><td></td><td></td><td></td></tr>
</table>
</body>
</html>