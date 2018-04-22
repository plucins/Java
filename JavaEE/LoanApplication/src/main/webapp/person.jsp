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


<form action="adress.jsp">
    <label>Imie: <input pattern="^[ĄĆĘŁŃÓŚŹŻąćęłńóśźżA-Za-z]{3,}$" required type="text" id="firstName" name="firstName"/></label><br/>
    <label>Nazwisko: <input pattern="^[ĄĆĘŁŃÓŚŹŻąćęłńóśźżA-Za-z]{3,}$" required type="text" id="lastName" name="lastName"/></label><br/>
    <label>Pesel: <input pattern="^\d{11}$" required type="text" id="pesel" name="pesel"/></label><br/>
    <input type="submit" value="nastepny krok"/>
</form>

<%
    session.setAttribute("step", session.getAttribute("step") + "2");
%>
</body>
</html>
