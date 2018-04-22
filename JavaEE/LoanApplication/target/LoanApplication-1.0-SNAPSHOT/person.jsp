<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title of the document</title>
</head>
<body>

<jsp:useBean id="parameters" class="model.LoanParameters" scope="session"/>
<jsp:useBean id="loan" class="model.LoanApplication" scope="session"/>

<jsp:setProperty name="parameters" property="amount" param="amount"/>
<jsp:setProperty name="parameters" property="installmentCount" param="installmentCount"/>

Numer wniosku: ${loan.number}<br/>
Wnioskowana kwota: ${parameters.amount}

<%

    session.setAttribute("step", "2");
    System.out.println(request.getSession().getAttribute("step"));
%>

<form action="adress.jsp">
    <label>Imie: <input type="text" id="firstName" name="firstName"/></label><br/>
    <label>Nazwisko: <input type="text" id="lastName" name="lastName"/></label><br/>
    <label>Pesel: <input type="text" id="pesel" name="pesel"/></label><br/>
    <input type="submit" value="nastepny krok"/>
</form>
</body>
</html>
