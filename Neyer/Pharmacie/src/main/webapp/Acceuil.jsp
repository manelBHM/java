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
<title>Pharmacie</title>
<img src="" alt="logo">
<style type="text/css">
body {
	color: black;
	text-align: center;
	font-family: Arial;
}

.image {
	width: 150px;
	height: 150px;
}

.pro {
	color: black;
}

span {
	color: red;
}

h1 {
	font-family: Arial; font-size 80px;
	text-align: center;
}

.prod1 {
	display: flex;
	flex-direction: row;
	text-align: center;
	justify-content: space-around;
	align-items: center;
}

.prod2 {
	display: flex;
	flex-direction: row;
	text-align: center;
	justify-content: space-around;
	align-items: center;
}

.commande {
	display: flex;
	flex-direction: row;
	text-align: center;
	justify-content: space-around;
	align-items: center;
}

.instruction {
	display: flex;
	flex-direction: column;
	text-align: center;
	justify-content: center;
	align-items: center;
	width: 600px;
	height: 600px;
	border: 2px solid black;
}

.formulaire {
	width: 1000px;
	height: 600px;
	border: 2px solid black;
}

.name {
	text-align: left;
	margin-left: 300px;
}

.name label {
	float: left;
	width: 200px;
}

.name input {
	border: 1px #999 solid;
}

.bouton {
	display: flex;
	margin: 30px;
	display: inline-block;
	width: 60px;
	height: 36px;
	cursor: pointer;
	text-align: top left;
	text-decoration: none;
	outline: none;
	color: white;
	background-color: rgb(43, 136, 179);
	border: none;
	border-radius: 10px;
	box-shadow: 0 5px #999;
	justify-content: flex-end;
	align-items: flex-start;
}

.bouton:hover {
	background-color: rgb(43, 136, 179);
}

.bouton:active {
	background-color: rgb(43, 136, 179);;
	box-shadow: 0 5px #666;
	transform: translateY(4px);
}

textarea {

width:100px;
height : 200px;

}
</style>
</head>
<body>
	<h1>Pharmacie de la pepinère</h1>
	<p class="date"><%=new java.util.Date()%></p>
	<br>

	<h3>Liste des produits disponibles</h3>
	<br>

	<%-- <p>
			<%
				out.println(request.getAttribute("afficherProduit"));
			%>
		</p> --%>

	<form class="shop" action="PharmacieServlet" method="get">

		<div class="prod1">

			<div class="dol">
				<img class="image" src="" alt="image">
				<p class="pro">
					<b>1 - Doliprane</b>
				</p>
				<p>4.0 Euro</p>
			</div>
			<div class="daf">
				<img class="image" src="" alt="image">
				<p class="pro">
					<b>2 - Dafalgan</b>
				</p>
				<p>3.0 Euro</p>
			</div>
			<div class="spa">
				<img class="image" src="" alt="image">
				<p class="pro">
					<b>3 - Spasfon</b>
				</p>
				<p>3.0 Euro</p>
			</div>

		</div>
		<br> <br> <br>
		<div class="prod2">

			<div class="siro">
				<img class="image" src="" alt="image">
				<p class="pro">
					<b>4 - Siro</b>
				</p>
				<p>6.0</p>
			</div>
			<div class="osilo">
				<img class="image" src="" alt="image">
				<p class="pro">
					<b>5 - Osilo</b>
				</p>
				<p>5.0 Euro</p>
			</div>
			<div class="col">
				<img class="image" src="" alt="image">
				<p class="pro">
					<b>6 - Coludol</b>
				</p>
				<p>5.0 Euro</p>
			</div>

		</div>
		<br> <br> <br>
		<h3>Commande</h3>
		<br> <br> <br>
		<div class="commande">
			<div class="instruction">
				<h3>
					<span>Instruction:</span>
				</h3>
				<br>
				<p>Afin de passer commande, il vous suffit de saisir le numéro
					du produit que vous souhaitez ansi que le nombre d'unité voulue.
					Exemple: 1:1</p>
			</div>

			<div class="formulaire">
				<h3>Veuillez saisir vos coordonner</h3>
				<div class="name">
					<label for="nom">Nom: <span class="requis">*</span></label> <input
						type="text" name="nom" value="" size="20" maxlength="60" /> <br>

					<label for="prenom">Prenom: <span class="requis">*</span></label> <input
						type="text" name="prenom" value="" size="20" maxlength="60" /> <br />
				</div>

				<h3>
					Veuillez indiquer le numero du produit et la quantiter<span
						class="requis">*</span>
				</h3>
				<textarea name="produits"></textarea>
				<br>
				<button class="bouton" action="submit">Valider</button>
			</div>
		</div>

	</form>

</body>
</html>












