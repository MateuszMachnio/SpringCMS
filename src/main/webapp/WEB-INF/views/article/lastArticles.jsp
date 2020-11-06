<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Last articles</title>
</head>
<body>
<h3>Ostatnie 5 artykułów:</h3>
<table>
    <tr>
        <th>Tytuł</th>
        <th>Data dodania</th>
        <th>Zawartość</th>
    </tr>
    <c:forEach items="${articles}" var="article">
        <tr>
            <td>${article.title}</td>
            <td>${article.created}</td>
            <td>${article.content}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
