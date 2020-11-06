<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add author</title>
</head>
<body>
<h3>Dodaj autora</h3>
<form:form modelAttribute="author">
    <form:label path="firstName">Imię: </form:label>
    <form:input path="firstName"/>

    <form:label path="lastName">Nazwisko: </form:label>
    <form:input path="lastName"/>
    <input type="submit" value="Dodaj">
</form:form>
</body>
</html>
