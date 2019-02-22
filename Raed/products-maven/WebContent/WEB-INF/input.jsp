<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

	#idd{
	color;red;
	background-color:red;
	taille:60px;
	}
	body{
	position:center;
	}
</style>
</head>
<body>

	<div id="di">
		<p>
			<b>HomeShop compagnie
			
			</b><br> Facture à l'attention de 
		</p>



		<form action="Serve/output.jsp" =method="post">
	Nom complete:<input type="text" name="nom" /> 
	<br> address:<input type="text" name="address" /> 
		
			<br><br>
			Livraison:
			<br>
			<form id="livr" action="livraison">
  				a domicile:<input type="radio" name="livraison" value="domicile">
  				<br>
  				express:<input type="radio" name="livraison" value="express">
  				<br>
  				point relais:<input type="radio" name="livraison" value="point">
  				<br>
  				a retirer:<input type="radio" name="livraison" value="retirer">
			</form>
	
				Informations livraison(relay et express):<input id="idd" type="button" name=""/>
			<br>
				list produits (produit:quantite, un produit par ligne):<br>
				<textarea rows="4" cols="50" placeholder="list produits">
				</textarea>
	
	
			<br> <input type="submit" value="submit" />
		

		</form>


	</div>




</body>
</html>