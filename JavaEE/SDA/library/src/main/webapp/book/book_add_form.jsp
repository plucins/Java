<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Dodawanie książki</title>
</head>
<body>
<%@include file="../common/menu.jspf" %>
<fieldset>
    <legend>Dodawanie książki</legend>
    <form action="<c:url value="/addBook"/>" method="post">
        Tytuł: <input type="text" name="title"/>

        Kategoria:
        <select name="category">
            <c:forEach items="${categories}" var="category">
                <option value="${category.id}">${category.name}</option>
            </c:forEach>
        </select>
        Autor:
        <select name="author">
            <c:forEach items="${allAuthors}" var="author">
                <option value="${author.id}">${author.name} ${author.surname}</option>
            </c:forEach>
        </select>

        Rok wydania:
        <input type="text" name="year">

        <input type="submit" name="submit" value="dodaj"/>
    </form>
</fieldset>
</body>
</html>
