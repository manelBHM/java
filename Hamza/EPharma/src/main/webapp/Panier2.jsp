<%@page import="co.epharma.produit.Produit"%>
<%@page import="java.util.Map"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="co.epharma.client.Client"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EPharma / Panier</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link type="text/css" rel="stylesheet" href="NewFile.css">
</head>
<body>


	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="/EPharma/EPharmaServlet"> <img
			src="https://upload.wikimedia.org/wikipedia/commons/3/3b/Pharmacie_de_Juilly.gif"
			width="30" height="30" alt="">
		</a> <a class="navbar-brand" href="/EPharma/EPharmaServlet">EPharma</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link"
					href="/EPharma/Accueil2.jsp"><button type="button"
							class="btn btn-outline-success">Accueil</button>
						<span class="sr-only">(current)</span></a></li>
				<li class="nav-item"><a class="nav-link"
					href="/EPharma/APropos.jsp"><button type="button"
							class="btn btn-outline-success">A Propos</button></a></li>
				<li class="nav-item"><a class="nav-link"
					href="/EPharma/Connexion.jsp"><button type="button"
							class="btn btn-outline-success">Connexion</button></a></li>
				<li class="nav-item"><a class="nav-link"
					href="/EPharma/Panier2.jsp"><button type="button"
							class="btn btn-outline-success">Panier</button></a></li>
			</ul>
		</div>
	</nav>

	<h1 align="center">Votre Panier</h1>

	<div class="box-facture">
		<p align=center>


			<b>EPharma de Montreuil <br> 25 Rue des Gilets Jaunes, 75013
				Paris <br> <br></b>

		</p>
		<p align="center">

			<%
				out.println(request.getAttribute("afficher") + "<br>");
			%>
		</p>


		<p align="center">

			<b>VOTRE HISTORIQUE D'ACHAT <br></b>

		</p>



		<p align="center">

			<%
				out.println(request.getAttribute("afficherHistor") + "<br>");
			%>
		</p>
</body>
</html>