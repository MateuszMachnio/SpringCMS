<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit author</title>
</head>
<body>
<form:form modelAttribute="author">
    <form:label path="firstName">Imię: </form:label>
    <form:input path="firstName"/>

    <form:label path="lastName">Nazwisko: </form:label>
    <form:input path="lastName"/>
    <input type="submit" value="Edytuj">
</form:form>
</body>
</html>
