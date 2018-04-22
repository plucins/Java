<%@ page import="java.util.Random" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title of the document</title>
</head>
<body>

<%
    session.setAttribute("step", "1");
%>

<%!
   private Random r = new Random();
%>
<%
    String number = ""+ r.nextInt((Integer.MAX_VALUE - 1));
%>
<jsp:useBean id="loan" class="model.LoanApplication" scope="session"/>
<jsp:setProperty name="loan" property="number" value="<%= number%>"/>
<jsp:setProperty name="loan" property="date" value="<%= new Date()%>"/>

Wygenerowany numer wniosku <%= loan.getNumber()%>
</br>
Data wygenerowania <%= loan.getDate()%>

<form action="person.jsp">
    <label>Wnioskowana kwota: <input type="number" id="amount" name="amount"/></label><br/>
    <label>Ilosc rat: <input type="number" id="installmentCount" name="installmentCount"/></label><br/>
    <input type="submit" value="następny krok"/>
</form>

</body>
</html>
