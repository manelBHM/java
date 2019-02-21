<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Amazon</title>
</head>
<body>
	<p>Données Personnels</p>
	
	<p>
	
	
	<%
// 	List<Produit> test = (ArrayList)request.getAttribute("myProduct");
	
// 	for(Produit p : test)
// 	{
// 		out.println(p);
		
// 	}

	%>
	
	<%
	
	StringBuilder bdList = (StringBuilder)request.getAttribute("listBase");
	
	
	
	out.println(bdList);
	
	%>

	
	</p>
	
	<form action="ShopServelet" method="get">
		
			<input type="checkbox" name="0" value="produit"> TV<br>
			<input type="checkbox" name="1" value="produit">Four<br>
			<input type="checkbox" name="2" value="produit">Cafetière<br>
		

		<br> NOM : <input type="text" name="nom"><br>
		ADRESSE : <input type="text" name="adresse"><br>

		<p>Choisissez votre mode de livraison</p>

		<input type="radio" name="choixLib" value="EX"> Express<br>
		<input type="radio" name="choixLib" value="DO" checked> Domicile<br>
		<input type="radio" name="choixLib" value="PR"> Point Relay<br>
		<input type="radio" name="choixLib" value="RM"> Retirer en
		magasin<br>

		<!-- 		<p>Votre panier</p> -->
		<!-- 		<textarea rows="" cols="" name="listproduit"></textarea> -->
		<br> <input type="submit" value="Submit">
	</form>

</body>
</html>