<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EPharma / Sans Ordonnance</title>

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
	<h1 align="center">Médicament sans ordonnance</h1>

	<p align="center">
		<%
			out.println(request.getAttribute("afficherProduits"));
		%>
	</p>
	<div class = "truc" align="center">

		<form action="EPharmaServlet" method="get">
			<b>Nom :</b> <input name="nom" /><br /> <b>Adresse :</b> <input
				name="adresse" /><br /> <br /> <b>Livraison :</b> <br /> A
			domicile : <input type="radio" name="livraison" value="domicile" /><br />
			Express : <input type="radio" name="livraison" value="express" /><br />
			Point relais : <input type="radio" name="livraison" value="relais" /><br />
			<b>liste produits :</b> (produit:quantité, un produit par ligne) : <br />
			<textarea name="produits"></textarea>
			<br />
			<button>Valider</button>
		</form>
	</div>


	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>