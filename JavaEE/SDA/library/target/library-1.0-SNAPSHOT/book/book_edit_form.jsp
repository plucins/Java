<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Edycja książki</title>
</head>
<body>
<%@include file="../common/menu.jspf" %>
<fieldset>
    <legend>Edycja Ksiązki</legend>
    <form action="<c:url value="/modifyBook"/>" method="post">
        <input type="hidden" name="action" value="edit"/>
        <input type="hidden" name="id" value="${param.id}"/>

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

            <input type="submit" name="submit" value="edytuj"/>

    </form>
</fieldset>
</body>
</html>
