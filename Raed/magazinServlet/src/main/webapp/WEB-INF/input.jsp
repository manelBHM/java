<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<form action="MagazinServlet" method="get">
		<b>Nom :</b> <input name="name" /><br /> 
		<b>Adresse :</b> <input name="addresse" /><br /> <br /> 
		<b>Livraison :</b> <br /> 
			A domicile : <input type="radio" name="livraison" value="domicile" /><br /> 
			Express : <input type="radio" name="livraison" value="express" /><br /> 
			Point relais : <input type="radio" name="livraison" value="relais" /><br /> 
			A retirer : <input type="radio" name="livraison" value="retirer" /><br /> 
		<b>liste produits :</b> (produit:quantité, un produit par ligne) : <br />
		<textarea name="products"></textarea>
		<br /> <button>Valider</button>
	</form>

</body>
</html>