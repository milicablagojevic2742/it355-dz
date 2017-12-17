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
<h1 align="center">Delovi: </h1>
<c:if test="${!empty delovi}">
    <table class="table table-striped" style="width: 50%;" align="center">
        <tr>
            <th width="350"> Sifra </th>
            <th width="200"> Ime </th>
            <th width="200"> Cena </th>
            <th width="200"> </th>
            <th width="200"> </th>
        </tr>
        <c:forEach items="${delovi}" var="deo">
            <tr>
                <td>${deo.sifra}</td>
                <td>${deo.ime}</td>
                <td>${deo.cena}</td>
                <td><a href="http://localhost:8084/IT355-DZ07/editDeo/${deo.sifra}"><button type="button" class="btn btn-primary">EDIT</button></a></td>
                <td><a href="http://localhost:8084/IT355-DZ07/deleteDeo/${deo.sifra}"><button type="button" class="btn btn-danger">DELETE</button></a></td>
            </tr>
        </c:forEach>
    </c:if>
</table>
<%@include file="footer.jsp" %>

