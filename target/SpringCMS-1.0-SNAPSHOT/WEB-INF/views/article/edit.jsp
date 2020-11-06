<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit article</title>
</head>
<body>
<form:form modelAttribute="article">
    <form:hidden path="created" />
    <form:label path="title">Tytuł: </form:label>
    <form:input path="title"/><br />

    <form:label path="content">Zawartość: </form:label>
    <form:input path="content"/><br />

    <form:label path="author">Autor: </form:label><br />
    <form:select path="author">
        <form:option value="0" label="--select option--"/>
        <form:options items="${authors}" itemValue="id" itemLabel="firstName"/>
    </form:select><br />

    <form:label path="categories">Kategorie: </form:label><br />
    <form:select path="categories" multiple="true">
        <form:option value="0" label="--select option--"/>
        <form:options items="${categories}" itemLabel="name" itemValue="id"/>
    </form:select><br />
    <input type="submit" value="Edytuj">
</form:form>
</body>
</html>
