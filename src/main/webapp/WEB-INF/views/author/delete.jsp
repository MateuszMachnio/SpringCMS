<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete author</title>
</head>
<body>
<h3>Czy na pewno chcesz usunąć tego autora?</h3>
Nazwa kategorii: ${author.firstName}<br />
Opis kategorii: ${author.lastName}
<form method="post">
    <input type="submit" value="Potwierdź">
</form>
<a href="<c:url value="/author/list"/>"><button>Anuluj</button></a>
</body>
</html>
