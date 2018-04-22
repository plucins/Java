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
    session.setAttribute("step", session.getAttribute("step") + "3");
%>

<form action="success.jsp">

    <label>Miasto: <input pattern="^[ĄĆĘŁŃÓŚŹŻąćęłńóśźżA-Za-z]{3,}$" required type="text" id="city" name="city"/></label><br/>
    <label>Kod pocztowy: <input pattern="\d{2}-\d{3}" required type="text" id="zipCode" name="zipCode"/> </label><br/>
    <label>Ulica <input pattern="^[ĄĆĘŁŃÓŚŹŻąćęłńóśźżA-Za-z]{3,}$" required type="text" id="street" name="street"/> </label><br/>
    <label>Numer domu: <input pattern="[0-9]" required type="text" id="houseNumber" name="houseNumber"/> </label><br/>
    <label>Numer mieszkania: <input pattern="[0-9]{1,4}" required type="text" id="localNumber" name="localNumber"/> </label><br/>
    <input type="submit" value="kolejny krok">
</form>

</body>
</html>
