<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista kategorii</title>
</head>
<body>
<%@include file="../common/menu.jspf" %>
<fieldset>
    <legend>Lista kategorii</legend>
    <c:choose>
        <c:when test="${empty books}">
            <b style="color: red"><c:out value="Brak Książek"/></b>
        </c:when>
        <c:otherwise>
            <table border="0">
                <tr>
                    <th>id</th>
                    <th>tytuł</th>
                    <th>
                        <form name="selectCategory" action="/selectCategory" method="post">
                            <select name="categoryToSelect" onchange="javascript:document.selectCategory.submit();">
                                <option>kategoria</option>
                                <option value="wszystkie">wszystkie</option>
                                <c:forEach var="cat" items="${categories}">
                                    <option value="${cat.id}">${cat.name}</option>
                                </c:forEach>
                            </select>
                        </form>
                    </th>
                    <th>
                        <form name="selectAuthor" action="/selectAuthor" method="post">
                            <select name="actorToSelect" onchange="javascript:document.selectAuthor.submit();">
                                <option>autor</option>
                                <option value="wszyscy">wszyscy</option>
                                <c:forEach var="author" items="${allAuthors}">
                                    <option value="${author.id}">${author.name} ${author.surname}</option>
                                </c:forEach>
                            </select>
                        </form>
                    </th>
                    <th>rok wydania</th>
                    <th>akcja</th>
                </tr>
                <c:forEach var="book" items="${books}">
                    <tr> <!-- Map<Integer, Category> -->
                        <td><c:out value="${book.id}"></c:out></td>
                        <td><c:out value="${book.title}"></c:out></td>
                        <td><c:out value="${book.category.name}"></c:out></td>
                        <td><c:out value="${book.authors.name} ${book.authors.surname}"></c:out></td>
                        <td><c:out value="${book.year}"></c:out></td>
                        <td>
                            <a href="<c:url value="../book.jsp"><c:param name="id" value="${book.id}" /><c:param name="view" value="edit_form"/></c:url>">edytuj</a>
                            <a href="<c:url value="/modifyBook"><c:param name="id" value="${book.id}" /><c:param name="action" value="remove"/></c:url>">usuń</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </c:otherwise>
    </c:choose>
    <p>
        <a href="<c:url value="../book.jsp"><c:param name="view" value="add_form"/></c:url>">Dodaj Książkę</a>
    </p>
</fieldset>
</body>
</html>
