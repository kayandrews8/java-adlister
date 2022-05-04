<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="All Ads"/>
    </jsp:include>
</head>
<body>
    <jsp:include page="../partials/navbar.jsp"/>
    <h1>List of all ads:</h1>
    <c:forEach var="ad" items="${ads}">
        <h2>${ad.title}</h2>
        <p>${ad.description}</p>
    </c:forEach>
</body>
</html>