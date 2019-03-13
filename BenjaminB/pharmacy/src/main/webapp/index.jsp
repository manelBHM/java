<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
	integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Passer commande</title>
<style type="text/css">
body {
	text-align: center;
	font-family: Arial;
	font-size: 15px;
	background-color: #DFDEDE;
}

table, th, tr {
	border: 2px solid black;
	border-collapse: collapse;
	width: 100%;
	padding: 5px;
}

img {
	position: absolute;
	left: 15px;
	top: 15px;
	max-width: 8%;
	height: auto;
}

footer {
	background-color: #018759;
	color: white;
	height: 40px;
	font-size: 15px;
}

a {
	text-decoration: none;
}
</style>
</head>
<body>
	<form action="PharmacieServlet" method="get">
		<img src="pharma.png" align="left" alt="logo Darty">
		<div id="produits">
		<p style="font-size: 15px;">
			<%
				out.println(request.getAttribute("afficherProduits"));
			%>
	</p>
		</div>
		<table>
			<tr>
				<div id="instructions">
					<th style="width: 50%;">
						<p style="font-size: 30px; color: #018759;">
							<b><u>INSTRUCTIONS</u></b>
						</p>
						<p>Afin de passer commande, il vous suffit de saisir le numéro
							du produit que vous souhaitez ansi que le nombre d'unité voulue.
							Si vous voulez autre chose, passez à la ligne et recommencez la
							manipulation. Vous avez terminé ? Cliquez sur le bouton
							"Envoyer".</p>
						<p>
							<b style="color: #018759;"><u>EXEMPLE</u></b> : Dans le cas ou vous
							souhaiteriez commander 2 TRAMADOLS il vous faudra saisir "1:2"
							dans l'input prévu à cet effet.
						</p>
						<p>
							<i>Toute l'équipe vous souhaite un bon shopping ! :)</i>
						</p>
					</th>
				</div>
				<th>
					<p>
						<b>Nom : </b><input id="nom" name="nom">
					</p>
					<p>
						<b>Prenom : </b><input id="prenom" name="prenom">
					
						
					<p>
						<b>Votre panier </b>("produit:quantité" / Un produit par ligne.) :
					</p> <textarea name="panier" rows="4" cols="50"></textarea><br>
					<button>Envoyer</button>
				</th>
			</tr>
		</table>
		<footer>
			<p>
				Nous rappellons à notre aimable clientèle que nos produits sont uniquement à usage médical, et non récréatif. <a
					href="https://twitter.com/Keuh_vin"><i
					class="fab fa-twitter-square"></i></a> <a
					href="https://www.facebook.com/kvn.mslwsk"><i
					class="fab fa-facebook-square"></i></a>
			</p>
		</footer>
	</form>
</body>
</html>
