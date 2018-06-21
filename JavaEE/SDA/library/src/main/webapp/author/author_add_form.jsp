<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Dodawanie autora</title>
</head>
<body>
<%@include file="../common/menu.jspf"%>
<fieldset>
<legend>Dodawanie autora</legend>
    <form action="/addAuthor" method="post">
        <input type="text" placeholder="Imie" name="name" id="name">
        <input type="text" placeholder="Nazwisko" name="surname" id="surname">
        <button type="submit">Dodaj</button>
    </form>
</fieldset>
</body>
</html>
