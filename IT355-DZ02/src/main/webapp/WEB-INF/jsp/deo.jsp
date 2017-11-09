<%-- 
    Document   : deo
    Created on : Oct 23, 2017, 6:05:15 PM
    Author     : Blagojevic Milica
--%>

<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@page session="true"%>
<%@ include file="header.jsp" %>
<html>
    <body align="center">
        <h1> ${message}</h1>
        <h2><spring:message code="naslov.unos"/></h2>
        <form:form method="POST" action="/IT355-DZ04/addDeo">
            <table align="center">
                <tr>
                    <td><form:label path="sifra">
                            <spring:message code="sifra"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="sifra" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="ime">
                            <spring:message code="ime"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="ime"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="cena">
                            <spring:message code="cena"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="cena"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Pošalji"/>
                    </td>
                </tr>
            </table>
        </form:form>
        <%@include file="footer.jsp" %>