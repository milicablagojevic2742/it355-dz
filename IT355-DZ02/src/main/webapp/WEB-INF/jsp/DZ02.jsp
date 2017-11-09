<%-- 
    Document   : DZ02
    Created on : Oct 16, 2017, 5:45:49 PM
    Author     : Blagojevic Milica
--%>

<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="header.jsp" %>

<sec:authorize access="hasRole('ROLE_USER')">
    <h3 align="center"><img src="pic/working.png"/><br/>U procesu izrade...</h3>
</sec:authorize>
<%@ include file="footer.jsp" %>