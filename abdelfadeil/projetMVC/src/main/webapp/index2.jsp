<%@page import="metier.Carton" %>
<% Carton model = (Carton)request.getAttribute("model");


%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
<title>deuxième page</title>
</head>
<body>

<header class="header">
<nav class="nav"></nav>
</header>

<div class="container mybody">
  <h>Ceci une page index2.jsp redirégée</h2>



  <h6>Espace personnel</h6>
  <p>Infos personnelle: </p>
  <p>Last name: <%= model.getNom() %> </p>
    <p>Firest name: <%= model.getPrenom() %></p>
  <p>Emait: <%= model.getEmail() %></p>
  <p>Mot de passe <%= model.getPassword() %></p>
  <br>
    <p>Modifier vos informations</p>

</div>
</body>
</html>