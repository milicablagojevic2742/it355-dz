<%-- 
    Document   : listaDelova
    Created on : Nov 9, 2017, 8:18:11 PM
    Author     : Blagojevic Milica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="header.jsp" %>
<sec:authorize access="hasRole('ROLE_USER')">
    <h3 align="center"><img src="pic/working.png"/><br/>Stranica je u izradi...</h3>
</sec:authorize>
<%@ include file="footer.jsp" %>

