<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Author list</title>
</head>
<body>
<table>
    <tr>
        <th>Imię autora</th>
        <th>Nazwisko autora</th>
        <th>Edytuj</th>
        <th>Usuń</th>
    </tr>
    <c:forEach items="${authors}" var="author">
        <tr>
            <td>${author.firstName}</td>
            <td>${author.lastName}</td>
            <td><a href="<c:url value="/author/edit/${author.id}"/>">Edytuj</a></td>
            <td><a href="<c:url value="/author/delete/${author.id}"/>">Usuń</a></td>
        </tr>
    </c:forEach>
</table>
<a href="<c:url value="/author/add"/>"><button>Dodaj autora</button></a>
</body>
</html>
