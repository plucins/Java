<%@ page import="model.LoanApplication" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title of the document</title>
</head>
<body>

<%
    session.setAttribute("step", session.getAttribute("step") + "4");
%>

<jsp:useBean id="loanService" class="services.LoanService" scope="application"/>
<jsp:useBean id="loan" class="model.LoanApplication" scope="session"/>
<jsp:useBean id="parameters" class="model.LoanParameters" scope="session"/>
<jsp:useBean id="person" class="model.Person" scope="session"/>
<jsp:useBean id="adress" class="model.Adress" scope="session"/>

<jsp:setProperty name="adress" property="*"/>

<%
    loan.setParameters(parameters);
    loan.setPerson(person);
    loanService.add(loan);
%>

<ul>
    <%
        for(LoanApplication l: loanService.getAll()){
    %>
    <li>Wniosek: <%=l.getNumber()
                            +" Osoba: " + l.getPerson().getLastName()
                            +" Kwota: " + l.getParameters().getAmount()%></li>
    <%
        }
    %>

</ul>

</body>
</html>
