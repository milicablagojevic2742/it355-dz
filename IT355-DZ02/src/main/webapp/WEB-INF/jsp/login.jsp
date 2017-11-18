<%-- 
    Document   : login
    Created on : Nov 8, 2017, 11:22:44 PM
    Author     : Blagojevic Milica
--%>

<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<%@include file="header.jsp" %>
<body onload='document.loginForm.username.focus();' align="center">
    <h1>Login here:</h1>
    <c:if test="${not empty error}">
        <div class="error">${error}</div>
    </c:if>
    <c:if test="${not empty msg}">
        <div class="msg">${msg}</div>
    </c:if>
    <div class="text-login">
        <form name='loginForm' align="center" action="<c:url value='/j_spring_security_check' />" method='POST'>
            <div>
                <div class="form-group">
                    <label>User:</label>
                    <input type="text" class="form-control" name="username" placeholder="Enter username">
                </div>
                <div class="form-group">
                    <label>Password:</label>
                    <input type="password" class="form-control" name="password" placeholder="Enter password">
                </div>
                <input name="submit" type="submit" class="btn btn-default" value="Submit" />
            </div>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        </form>
    </div>
    <%@ include file="footer.jsp" %>