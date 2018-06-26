<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Edycja kategorii</title>
</head>
<body>
<%@include file="../common/menu.jspf" %>
<fieldset>
    <legend>Edycja kategorii</legend>
    <form action="<c:url value="/modifyCategory"/>" method="post">
        <input type="hidden" name="action" value="edit"/>
        <input type="hidden" name="id" value="${param.id}"/>
        Nazwa: <input type="text" name="name" value=""/>
        <input type="submit" name="submit" value="edytuj"/>
    </form>
</fieldset>
</body>
</html>
