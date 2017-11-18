<%-- 
    Document   : success
    Created on : Nov 17, 2017, 12:42:08 PM
    Author     : Blagojevic Milica
--%>

<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ page isELIgnored ="false" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/header.css" />
        <title>Pogodak</title>
    </head>
    <body>
        <div class="alert alert-success" role="alert">
            <b>Upravu ste</b>, marka je ${markaBean.marka}!!
        </div>
        <div class="text">
            <a href="http://localhost:8084/IT355-DZ04/"><span class="label label-primary">Početna</span></a>
        </div>
    </body>
</html>
