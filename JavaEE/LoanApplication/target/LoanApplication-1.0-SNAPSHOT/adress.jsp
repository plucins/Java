<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title of the document</title>
</head>
<body>


<jsp:useBean id="person" class="model.Person" scope="session"/>
<jsp:useBean id="adress" class="model.Adress" scope="session"/>

<jsp:setProperty name="person" property="*"/>
Dla osoby ${person.firstName} ${person.lastName} podaj adres
<br/>

<%
    if(request.getSession().getAttribute("step") != null) {
        session.setAttribute("step", "3");
    } else {
        session.setAttribute("step", "0");
    }
    System.out.println(request.getSession().getAttribute("step"));
%>

<form action="success.jsp">

    <label>Miasto: <input type="text" id="city" name="city"/></label><br/>
    <label>Kod pocztowy: <input type="text" id="zipCode" name="zipCode"/> </label><br/>
    <label>Ulica <input type="text" id="street" name="street"/> </label><br/>
    <label>Numer domu: <input type="text" id="houseNumber" name="houseNumber"/> </label><br/>
    <label>Numer mieszkania: <input type="text" id="localNumber" name="localNumber"/> </label><br/>
    <input type="submit" value="kolejny krok">
</form>

</body>
</html>
