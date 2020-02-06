
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
  <title>Email List application</title>
</head>
<body>

<%@ page import="user.*" %>

<%
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String emailAddress = request.getParameter("emailAddress");

    User user = new User(firstName, lastName, emailAddress);
    UserIO.addRecord(user, "C:\\Users\\vamsi_000\\Downloads\\apache-tomcat-9.0.30\\webapps\\UserEmail.txt");
%>

<h1>Thanks for joining our email list</h1>

<p>Here is the information that you entered:</p>

  <table cellspacing="5" cellpadding="5" border="1">
    <tr>
      <td align="right">First name:</td>
      <td><%= user.getFirstName () %></td>
    </tr>
    <tr>
      <td align="right">Last name:</td>
      <td><%= user.getLastName ()%></td>
    </tr>
    <tr>
      <td align="right">Email address:</td>
      <td><%= user.getEmailAddress () %></td>
    </tr>
  </table>

<p>To enter another email address, click on the Back <br>
button in your browser or the Return button shown <br>
below.</p>

<form action="join_email.html" method="post">
  <input type="submit" value="Return">
</form>


</body>
</html>
    