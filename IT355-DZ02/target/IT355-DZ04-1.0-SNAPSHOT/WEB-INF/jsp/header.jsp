<%-- 
    Document   : header
    Created on : Oct 23, 2017, 6:04:24 PM
    Author     : Blagojevic Milica
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><spring:message code="title"/></title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="http://localhost:8084/IT355-DZ07/css/header.css" />
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="http://localhost:8084/IT355-DZ07/"><img src="http://localhost:8084/IT355-DZ07/pic/Audi.png"/></a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a href="http://localhost:8084/IT355-DZ07/"><spring:message code="linkkapoc"/></a></li>
                        <li><a href="http://localhost:8084/IT355-DZ07/listaDelova"><spring:message code="listaDelova"/></a></li>
                        <li><a href="http://localhost:8084/IT355-DZ07/markaFlow"><spring:message code="flow"/></a></li>
                        <sec:authorize access="hasRole('ROLE_ADMIN')">
                            <c:if test="${pageContext.request.userPrincipal.name != null}">
                                <li class="dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Unos
                                        <span class="caret"></span></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="http://localhost:8084/IT355-DZ07/addDeo"><spring:message code="unos"/></a></li>
                                        <li><a href="http://localhost:8084/IT355-DZ07/addKategorija"><spring:message code="unos1"/></a></li>
                                        <li><a href="http://localhost:8084/IT355-DZ07/addUser">Unos korisnika</a></li>
                                    </ul>
                                </li>
                            </c:if>
                            <c:if test="${pageContext.request.userPrincipal.name != null}">
                                <li class="dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Prikaz
                                        <span class="caret"></span></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="http://localhost:8084/IT355-DZ07/listaKategorija">Lista kategorija</a></li>
                                        <li><a href="http://localhost:8084/IT355-DZ07/listaUsera">Lista korisnika</a></li>
                                    </ul>
                                </li>
                            </c:if>
                        </sec:authorize>
                        <li><a href="http://localhost:8084/IT355-DZ07/kontakt"><spring:message code="kontakt"/></a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                        <c:if test="${pageContext.request.userPrincipal.name == null}">
                            <a href="http://localhost:8084/IT355-DZ07/login"><span class="glyphicon glyphicon-log-in"></span> <spring:message code="login"/></a>
                        </c:if>
                        </li>
                        <li>
                        <c:if test="${pageContext.request.userPrincipal.name != null}">
                            <c:url value="/j_spring_security_logout" var="logoutUrl" />
                            <form action="${logoutUrl}" method="post" id="logoutForm">
                                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                            </form>
                            <script>
                                function formSubmit() {
                                    document.getElementById("logoutForm").submit();
                                }
                            </script>
                            ${pageContext.request.userPrincipal.name} <a href="javascript:formSubmit()"> <spring:message code="logout"/></a>
                        </c:if>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <h2 style="text-align: center; color: #cc0000;">${message}</h2>
        <img src="http://localhost:8084/IT355-DZ07/pic/jnn.png"/>
        <br/>