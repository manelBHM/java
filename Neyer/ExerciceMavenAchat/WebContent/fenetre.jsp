<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>
		1 - TV <br> 2 - Micro-onde <br> 3 - Four
	</p>

	<form action="FactureServ" method="get">
		Nom : <input type="text" name="nom"><br> 
		Adresse : <input type="text" name="adresse"><br> 
		
	

	<p>Liste produits (produit : quantité, un produit par ligne)</p>

	<textarea rows="" cols="" name="listPro"></textarea>
	<br>
	<input type="submit" value="Envoyer">
	</form>
</body>
</html>