<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete article</title>
</head>
<body>
<h3>Czy na pewno chcesz usunąć ten artykół?</h3>
Tytuł artykółu: ${article.title}<br />
Zawartość artykółu: ${article.content}
Autor artykółu: ${article.author}
Kategorie artykółu: ${article.categories}
<form method="post">
    <input type="submit" value="Potwierdź">
</form>
<a href="<c:url value="/article/list"/>"><button>Anuluj</button></a>
</body>
</html>
