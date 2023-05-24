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
  Username: <input type="text" name="username" value="<%=username%>"><br>
  Password: <input type="password" name="password" value="<%=password%>"><br>
  Full name: <input type="text" name="fullname"><br>
  Address: <input type="text" name="address"><br>
  <input type="submit" value="Submit">
</form>
</body>
</html>
