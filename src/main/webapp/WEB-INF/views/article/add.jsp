<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add article</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
<h3>Dodaj artykół</h3>
<form:form modelAttribute="article">
    <form:label path="title">Tytuł: </form:label>
    <form:input path="title"/>
    <form:errors path="title" cssClass="error" element="div"/>
    <br />

    <form:label path="content">Zawartość: </form:label>
    <form:input path="content"/>
    <form:errors path="content" cssClass="error" element="div"/>
    <br />

    <form:label path="author">Autor: </form:label><br />
    <form:select path="author">
        <form:option value="0" label="--select option--"/>
        <form:options items="${authors}" itemValue="id" itemLabel="firstName"/>
    </form:select>
    <form:errors path="author" cssClass="error" element="div"/>
    <br />

    <form:label path="categories">Kategorie: </form:label><br />
    <form:select path="categories" multiple="true">
        <form:option value="0" label="--select option--" disabled="true"/>
        <form:options items="${categories}" itemLabel="name" itemValue="id"/>
    </form:select>
    <form:errors path="categories" cssClass="error" element="div"/>
    <br />

    <input type="submit" value="Dodaj">
</form:form>
</body>
</html>
