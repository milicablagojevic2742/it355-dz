<%-- 
    Document   : viewDeo
    Created on : Oct 23, 2017, 6:04:58 PM
    Author     : Blagojevic Milica
--%>

<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="header.jsp" %>
<html>
    <head>
        <title><spring:message code="naslov.prikaz"/></title>
    </head>
    <body>
        <h2><spring:message code="podnaslov.prikaz"/></h2>
        <table>
            <tr>
                <td><spring:message code="sifra"/></td>
                <td>${sifra}</td>
            </tr>
            <tr>
                <td><spring:message code="ime"/></td>
                <td>${ime}</td>
            </tr>
            <tr>
                <td><spring:message code="cena"/></td>
                <td>${cena}</td>
            </tr>
        </table>
    </body>
</html>
<%@ include file="footer.jsp" %>
