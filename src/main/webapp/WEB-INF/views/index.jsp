<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${personaList}" var="item">
    ${item.nombre}<br>
    ${item.apellido}<br>
</c:forEach>
</body>
</html>
