<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit author</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
<form:form modelAttribute="author">
    <form:hidden path="id"/>
    <form:label path="firstName">Imię: </form:label>
    <form:input path="firstName"/>
    <form:errors path="firstName" element="div" cssClass="error"/>
    <br />

    <form:label path="lastName">Nazwisko: </form:label>
    <form:input path="lastName"/>
    <form:errors path="lastName" element="div" cssClass="error"/>

    <input type="submit" value="Edytuj">
</form:form>
</body>
</html>
