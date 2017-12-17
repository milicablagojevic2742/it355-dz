<%-- 
    Document   : listaUsera
    Created on : Dec 17, 2017, 4:43:20 PM
    Author     : Milica Blagojevic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="header.jsp" %>
<h1 align="center">Korisnici: </h1>
<c:if test="${!empty users}">
    <table class="table table-striped" style="width: 50%;" align="center">
        <tr>
            <th width="200"> ID </th>
            <th width="200"> Username </th>
            <th width="200"> </th>
            <th width="200"> </th>
        </tr>
        <c:forEach items="${users}" var="u">
            <tr>
                <td>${u.user_id}</td>
                <td>${u.username}</td>
                <td><a href="http://localhost:8084/IT355-DZ07/editUser/${u.user_id}"><button type="button" class="btn btn-primary">EDIT</button></a></td>
                <td><a href="http://localhost:8084/IT355-DZ07/deleteUser/${u.user_id}"><button type="button" class="btn btn-danger">DELETE</button></a></td>
            </tr>
        </c:forEach>
    </c:if>
</table>
<%@include file="footer.jsp" %>
