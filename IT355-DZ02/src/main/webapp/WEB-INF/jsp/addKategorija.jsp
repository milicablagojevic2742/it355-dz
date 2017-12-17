<%-- 
    Document   : addKategorija
    Created on : Dec 17, 2017, 4:22:31 PM
    Author     : Milica Blagojevic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="header.jsp" %>
<br>
<form:form method="POST" modelAttribute="kategorija" align="center"> 
    <div class="container">
        <div class="col-xs-4">

        </div>
        <div class="col-xs-5">
            <form:label path="imeKategorije">Ime: </form:label>
            <form:input id="imeKategorije" placeholder="Ime" path="imeKategorije" class="form-control"/>
        </div>
        <div class="col-xs-4">

        </div>
        <div class="col-xs-5">
            <button type="submit" class="btn btn-primary">Add Kategorija</button>
        </div>
    </div>
</form:form>
<%@include file="footer.jsp" %>

