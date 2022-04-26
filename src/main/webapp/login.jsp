<%--
  Created by IntelliJ IDEA.
  User: kaylah_a
  Date: 4/26/22
  Time: 1:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%
    if(request.getMethod().equalsIgnoreCase("post")){
    String pw = request.getParameter("password");
    String user = request.getParameter("username");
    if(user.equals("admin") && pw.equals("password")){
        response.sendRedirect("profile.jsp");
    } else {
        response.sendRedirect("login.jsp");
    }

    }
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form method="post">
    <label for="username">Username:</label>
    <input id="username" name="username" placeholder="Enter username">
    <label for="password">Password:</label>
    <input id="password" name="password" placeholder="Enter password">
    <button>Submit</button>
</form>
</body>
</html>
