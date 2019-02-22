<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
</head>
<body>
	<h1 align=center>Bienvenue chez EPharma</h1>



	<p>
		<%
			out.println(request.getAttribute("afficherProduits"));
		%>
	</p>


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

</body>
</html>