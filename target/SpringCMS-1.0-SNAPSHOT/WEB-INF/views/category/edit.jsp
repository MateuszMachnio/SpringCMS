<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit category</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
<form:form modelAttribute="category">
    <form:hidden path="id"/>
    <form:label path="name">Imię: </form:label>
    <form:input path="name"/>
    <form:errors path="name" cssClass="error" element="div" />
    <br />

    <form:label path="description">Opis: </form:label>
    <form:input path="description"/>
    <form:errors path="description" cssClass="error"/>
    <input type="submit" value="Edytuj">
</form:form>
</body>
</html>
