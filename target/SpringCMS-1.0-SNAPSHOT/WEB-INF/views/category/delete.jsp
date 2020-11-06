<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete category</title>
</head>
<body>
<h3>Czy na pewno chcesz usunąć tą kategorię?</h3>
Nazwa kategorii: ${category.name}<br />
Opis kategorii: ${category.description}
<form method="post">
    <input type="submit" value="Potwierdź">
</form>
<a href="<c:url value="/category/list"/>"><button>Anuluj</button></a>
</body>
</html>
