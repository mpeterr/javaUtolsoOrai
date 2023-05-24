<%@ page import="hu.oe.javautolsooraifeladat.model.User" %><%--
  Created by IntelliJ IDEA.
  User: Péter
  Date: 2023. 05. 24.
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Page</title>
</head>
<body>
<%
    User user = (User) request.getSession().getAttribute("user");
%>
<h1>Hello <%=user.getUsername()%>!</h1>
</body>
</html>
