<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="co.hamza.produits.Produits"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
</head>
<body>
	<h1 align = center>Bienvenue chez Boulanger</h1>
	
	<p>
		TV LG : Ecran OLED 1300.00eur
	</p>

	<p>
		Four Panasonic : Four micro-onde 80.00eur
	</p>

	<p>
		Frigo Samsung : Frigo double compartiment 800.00eur
	</p>
	
	
	<form action="BoulangerServlet" method="get"> 
		 <b>Nom :</b> 
		<input name="nom"/><br/> 
         <b>Adresse :</b> <input name="adresse"/><br/><br/> 
         <b>Livraison :</b> <br/> 
                A domicile : <input type="radio" name="livraison" value="domicile"/><br/> 
                Express : <input type="radio" name="livraison" value="express"/><br/> 
                Point relais : <input type="radio" name="livraison" value="relay"/><br/> 
                A retirer : <input type="radio" name="livraison" value="surPlace"/><br/>
                
                <b>liste produits :</b> (produit:quantité, un produit par ligne) : <br/> 
                <textarea name="products"></textarea><br/> 
                <input type="submit"/> 
     </form>
		

	
</body>
</html>