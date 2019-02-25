<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MAGASIN</title>
</head>
<body>

	<form action="MaServ" method="get">


		<div>
			<%
				ArrayList liste = (ArrayList) request.getAttribute("liste");
				for (int i = 0; i < liste.size(); i++) {
					out.println(liste.get(i) + "<br>");
				}
			%>

		</div>

		<div>
			<p>nom complet</p>
			<input type="text" placeholder="fullname" name="fullname" id="">
		</div>
		<div>
			<p>adresse</p>
			<input type="text" placeholder="adress" name="adress" id="">
		</div>
		
		<div>
			<p>ID</p>
			<input type="number" placeholder="ID" name="ID" id="">
		</div>

		<div>
			A domicile : <input type="radio" name="livraison" value="domicile" /><br /> 
			Express : <input type="radio" name="livraison" value="express" /><br /> 
			Point relais : <input type="radio" name="livraison" value="relais" /><br /> 
			A retirer : <input type="radio" name="livraison" value="surPlace" /><br /> 

		</div>

		<div>
			<p>information de livraion :</p>
			<input type="text" name="info" id="">
		</div>

		<div>
			<p>liste produit</p>
			<TEXTAREA name="choixproduit"></TEXTAREA>

		</div>
		<button>Envoyer</button>




	</form>


</body>
</html>