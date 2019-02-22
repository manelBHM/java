<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		<link type="text/css" rel="stylesheet" href="NewFile.css">
		
<title>Accueil</title>
</head>
<body>
	
	
<!-- 	 tout en haut -->


	<div class="jumbotron jumbotron-fluid tony">
  <div class="container">
    <h1 class="display-4">PharmHamza</h1>
    <p class="lead">La Pharmacie en ligne</p>
    <button type="button" class="btn btn-outline-success">Liste Produit</button>
    <button type="button" class="btn btn-outline-success">Contact</button>
    <button type="button" class="btn btn-outline-success">Deconnexion</button>
    
<!--  les trois cartes -->
  </div>
</div>
<div class="card-deck">
  <div class="card">
    <img src="https://www.pharma-gdd.com/images/catalog/pictures/thumbnails/400/doliprane-1000-mg-douleurs-et-fievre-8-gelules-face.jpg" class="card-img-top" alt="doliprane">
    <div class="card-body">
      <h5 class="card-title">Doliprane 1000g</h5>
      <p class="card-text">Medicament pour les maux de têtes, douleurs.</p>
    </div>
    <div class="card-footer">
      <button>Ajouter dans Panier</button>
    </div>
  </div>
  <div class="card">
    <img src="https://www.pharma-gdd.com/images/catalog/pictures/thumbnails/400/smecta-orange-vanille-30-sachets-face-1.jpg" class="card-img-top" alt="...">
    <div class="card-body">
      <h5 class="card-title">Smecta 30 Sachets 3g</h5>
      <p class="card-text">Contre la diarrhée.</p>
    </div>
    <div class="card-footer">
      <a href="/EPharma/ParaMedoc.jsp"><button>Ajouter dans Panier</button></a>
    </div>
  </div>
  <div class="card">
    <img src="https://www.nutrisante.ca/DATA/PRODUITIMAGE/340~v~rhumex-rhume-et-toux.jpg" class="card-img-top" alt="...">
    <div class="card-body">
      <h5 class="card-title">Rhumex 42 Gellules</h5>
      <p class="card-text">Pour le nez.</p>
    </div>
    <div class="card-footer">
      <button>Ajouter dans Panier</button>
    </div>
  </div>
</div>

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