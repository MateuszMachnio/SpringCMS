<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit category</title>
</head>
<body>
<form:form modelAttribute="category">
    <form:label path="name">Imię: </form:label>
    <form:input path="name"/>

    <form:label path="description">Opis: </form:label>
    <form:input path="description"/>
    <input type="submit" value="Edytuj">
</form:form>
</body>
</html>
