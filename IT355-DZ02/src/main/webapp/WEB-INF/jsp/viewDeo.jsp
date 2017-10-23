<%-- 
    Document   : viewDeo
    Created on : Oct 23, 2017, 6:04:58 PM
    Author     : Blagojevic Milica
--%>

<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<html>
    <head>
        <title>Prikaz delova</title>
    </head>
    <body>
        <h2>Podaci o delu</h2>
        <table>
            <tr>
                <td>Sifra: </td>
                <td>${sifra}</td>
            </tr>
            <tr>
                <td>Naziv: </td>
                <td>${ime}</td>
            </tr>
            <tr>
                <td>Cena: </td>
                <td>${cena}</td>
            </tr>
        </table>
    </body>
</html>
<%@ include file="footer.jsp" %>
