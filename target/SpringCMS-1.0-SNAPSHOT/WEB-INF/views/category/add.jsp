<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add category</title>
</head>
<body>
<h3>Dodaj kategorię</h3>
<form:form modelAttribute="category">
    <form:label path="name">Imię: </form:label>
    <form:input path="name"/>

    <form:label path="description">Opis: </form:label>
    <form:input path="description"/>
    <input type="submit" value="Dodaj">
</form:form>
</body>
</html>
