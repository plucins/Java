<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Książka</title>
</head>
<body>

<c:choose>
    <c:when test="${param.view eq 'list'}">
        <jsp:forward page="book/book_list.jsp"></jsp:forward>
    </c:when>
    <c:when test="${param.view eq 'add_form'}">
        <jsp:forward page="book/book_add_form.jsp"></jsp:forward>
    </c:when>
    <c:when test="${param.view eq 'edit_form'}">
        <jsp:forward page="book/book_edit_form.jsp"></jsp:forward>
    </c:when>
    <c:otherwise>
        <jsp:forward page="book/book_list.jsp"></jsp:forward>
    </c:otherwise>
</c:choose>


</body>
</html>