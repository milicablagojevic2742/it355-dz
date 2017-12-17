<%-- 
    Document   : addDeo
    Created on : Dec 17, 2017, 2:45:33 PM
    Author     : Milica Blagojevic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="header.jsp" %>
<br>
<form:form method="POST" modelAttribute="deo" align="center">
    <div class="container">
         <div class="col-xs-4">

        </div>
        <div class="col-xs-5">
            <form:label path="ime">Ime: </form:label>
            <form:input id="ime" placeholder="Ime" path="ime" class="form-control"/>
        </div>
        <div class="col-xs-4">

        </div>
        <div class="col-xs-5">
            <form:label path="cena">Cena: </form:label>
            <form:input id="cena" placeholder="Cena" path="cena" class="form-control"/>
        </div>
        <div class="col-xs-4">

        </div>
        <div class="col-xs-5">
            <form:label path="proizvodjac">Proizvodjac: </form:label>
            <form:input id="proizvodjac" placeholder="Proizvodjac" path="proizvodjac" class="form-control"/>
        </div>
        <div class="col-xs-4">

        </div>
        <div class="col-xs-5">
            <form:label path="kategorija_id">Kategorija: </form:label>
            <form:select id="kategorija_id" class="form-control" path="kategorija_id">
                <c:forEach items="${kategorije}" var="k">
                    <form:option value="${k.kategorija_id}">${k.imeKategorije}</form:option>
                </c:forEach>
            </form:select>
        </div>
        <div class="col-xs-4">

        </div>
        <div class="col-xs-5">
            <button type="submit" class="btn btn-primary">Add Deo</button>
        </div>
    </div>

</form:form>
<%@include file="footer.jsp" %>
