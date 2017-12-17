<%-- 
    Document   : 403
    Created on : Nov 8, 2017, 9:19:55 PM
    Author     : Blagojevic Milica
--%>

<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
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
    <a href="http://localhost:8084/IT355-DZ07/"><span class="label label-primary">Početna</span></a>
</center>
</body>
</html>
