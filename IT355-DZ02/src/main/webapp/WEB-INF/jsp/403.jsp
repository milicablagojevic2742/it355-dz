<%-- 
    Document   : 403
    Created on : Nov 8, 2017, 9:19:55 PM
    Author     : Blagojevic Milica
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="header.jsp" %>
<body>
<center>
    <h1>Pristup ovoj stranici nije dozvoljen!</h1>
    <c:choose>
        <c:when test="${empty username}">
            <h2>Login</h2>
        </c:when>
        <c:otherwise>
            <h2>User ${username} pristup ovoj stranici Vam nije dozvoljen!</h2>
        </c:otherwise>
    </c:choose>
</center>
</body>
</html>
