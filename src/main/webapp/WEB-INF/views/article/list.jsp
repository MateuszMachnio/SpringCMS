<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Article list</title>
</head>
<body>
<table>
    <tr>
        <th>Tytuł artykółu</th>
        <th>Zawartość artykółu</th>
        <th>Data dodania</th>
        <th>Autor artykółu</th>
        <th>Edytuj</th>
        <th>Usuń</th>
    </tr>
    <c:forEach items="${articles}" var="article">
        <tr>
            <td>${article.title}</td>
            <td>${article.content}</td>
            <td>${article.created}</td>
            <td>${article.author}</td>
            <td><a href="<c:url value="/article/edit/${article.id}"/>">Edytuj</a></td>
            <td><a href="<c:url value="/article/delete/${article.id}"/>">Usuń</a></td>
        </tr>
    </c:forEach>
</table>
<a href="<c:url value="/article/add"/>"><button>Dodaj autora</button></a>
</body>
</html>
