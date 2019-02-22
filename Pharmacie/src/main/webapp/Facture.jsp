<%@page import="co.simplon.Produit"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="co.simplon.Client"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Facture</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
<style>
.tet{
color: black;
text-align: center;
font-family: Arial;
box-shadow: 2px 2px 2px 2px green;
width: 25%;
margin: 200px 200px 0px 600px;
}
p{
text-align: center;
justify-content: center;
align-items: center;
}
.logo img{
width: 50px;
height: 50px;
}
</style>
</head>
<body>

<header>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="http://localhost:8080/Pharmacie/PharmacieServlet#"><i class="fas fa-home"></i>home</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
     
     
    </ul>
  </div>
   <div class="logo" class="form-inline my-2 my-lg-0  pull-right"><img src="Pharmacy.png" alt=""></div>
</nav>
</header>


<div class="tet">
 <div class="logo" class="form-inline my-2 my-lg-0  pull-right"><img src="Pharmacy.png" alt=""></div>


	<p>
		<%
			out.println(request.getAttribute("afficher") + "<br>");
		%>
	</p>
	</div>
</body>
</html>