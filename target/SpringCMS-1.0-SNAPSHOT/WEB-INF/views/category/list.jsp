<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Categories list</title>
</head>
<body>
<table>
    <tr>
        <th>Nazwa kategorii</th>
        <th>Opis kategorii</th>
        <th>Edytuj</th>
        <th>Usuń</th>
    </tr>
    <c:forEach items="${categories}" var="category">
        <tr>
            <td>${category.name}</td>
            <td>${category.description}</td>
            <td><a href="<c:url value="/category/edit/${category.id}"/>">Edytuj</a></td>
            <td><a href="<c:url value="/category/delete/${category.id}"/>">Usuń</a></td>
        </tr>
    </c:forEach>
</table>
<a href="<c:url value="/category/add"/>"><button>Dodaj kategorię</button></a>
</body>
</html>
