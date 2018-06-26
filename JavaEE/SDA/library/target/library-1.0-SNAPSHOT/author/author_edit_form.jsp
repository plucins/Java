<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Edycja autora</title>
</head>
<body>
<%@include file="../common/menu.jspf" %>
<fieldset>
    <legend>Edycja autora</legend>
    <form action="<c:url value="/modifyAuthor"/>" method="post">
        <input type="hidden" name="action" value="edit"/>
        <input type="hidden" name="id" value="${param.id}"/>
        Imie: <input type="text" name="name" value=""/>
        Nazwisko: <input type="text" name="surname" value=""/>
        <input type="submit" name="submit" value="edytuj"/>
    </form>
</fieldset>
</body>
</html>
