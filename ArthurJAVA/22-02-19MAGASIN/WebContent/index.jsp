<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MAGASIN</title>
</head>
<body>

	<form action="Serv" method="get">
		<div>
		
			<p>
				0 - Tele Samsung LCD - 100€ <br>
			</p>
			<p>
				1 - Tele Philipse LED - 80€ <br>
			</p>
			<p>
				2 Refrigerateur - ... 400€ <br>
			</p>
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
			<p>a domicile</p>
			<input type="checkbox" name="dom" id="">
			<p>express</p>
			<input type="checkbox" name="express" id="">
			<p>point relais</p>
			<input type="checkbox" name="relay" id="">
			<p>a retirer</p>
			<input type="checkbox" name="takeawy" id="">

		</div>

		<div>
			<p>information de livraion :</p>
			<input type="text" name="info" id="">
		</div>

		<div>
			<p>liste produit</p>
			<input type="text" name="choixproduit" id="">

		</div>
		<button>Envoyer</button>
		



	</form>


</body>
</html>