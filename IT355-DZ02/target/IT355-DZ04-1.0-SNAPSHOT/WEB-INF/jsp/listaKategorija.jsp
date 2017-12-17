<%-- 
    Document   : listaKategorija
    Created on : Dec 17, 2017, 4:22:45 PM
    Author     : Milica Blagojevic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="header.jsp" %>
<h1 align="center">Kategorije: </h1>
<c:if test="${!empty kategorije}">
    <table class="table table-striped" style="width: 50%;" align="center">
        <tr>
            <th width="350"> ID </th>
            <th width="200"> Ime </th>
            <th width="200"> </th>
            <th width="200"> </th>
        </tr>
        <c:forEach items="${kategorije}" var="kategorija">
            <tr>
                <td>${kategorija.kategorija_id}</td>
                <td>${kategorija.imeKategorije}</td>
                <td><a href="http://localhost:8084/IT355-DZ07/editKategorija/${kategorija.kategorija_id}"><button type="button" class="btn btn-primary">EDIT</button></a></td>
                <td><a href="http://localhost:8084/IT355-DZ07/deleteKategorija/${kategorija.kategorija_id}"><button type="button" class="btn btn-danger">DELETE</button></a></td>
            </tr>
        </c:forEach>
    </c:if>
</table>
<%@include file="footer.jsp" %>