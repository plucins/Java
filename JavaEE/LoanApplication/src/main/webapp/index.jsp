<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title of the document</title>
</head>
<body>
Witaj na stronie wniosków kredytowych
<br/>

<% String step = "0";  session.setAttribute("step",step); %>
<a href="/loanParameters.jsp">Złóż wniosek online</a>
</body>
</html>
