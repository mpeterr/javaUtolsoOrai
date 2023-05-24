<%--
  Created by IntelliJ IDEA.
  User: Péter
  Date: 2023. 05. 24.
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<%
  String username = (String) request.getAttribute("username");
  String password = (String) request.getAttribute("password");
%>
<h1>Registration</h1>
<form action="RegisterServlet" method="post">
  <table>
    <tr>
      <td>Username:</td><td><input type="text" name="username" value="<%=username%>"></td>
    </tr>
    <tr>
      <td>Password:</td><td><input type="password" name="password" value="<%=password%>"></td>
    </tr>
    <tr>
      <td>Full name:</td><td><input type="text" name="fullname"></td>
    </tr>
    <tr>
      <td>Address:</td><td><input type="text" name="address"></td>
    </tr>
  </table><br>
  <input type="submit" value="Submit">
</form>
</body>
</html>
