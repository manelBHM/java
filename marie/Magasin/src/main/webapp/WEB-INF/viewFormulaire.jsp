<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Passer commande</title>
<style type="text/css">

body{
  text-align: center;
  font-family: Arial;
  font-size: 15px;
  background-color: #DFDEDE;
}

table, th, tr {
  border: 2px solid black;
  border-collapse: collapse;
  width: 100%;
  padding: 5px;
}

img {
  position: absolute;
  left: 15px;
  top: 15px;
  max-width: 8%;
  height: auto;
}

footer {
   background-color: red;
   color: white;
   height: 40px;
   font-size: 15px;
}

a {
  text-decoration: none;
}

</style>
</head>
<body>
<form action="ServletMagasin" method="get">
<img src="boulanger.png" align="left" alt="logo Boulanger">
  <div id="produits">
	<p><b style="color:red;">1 - TELEVISEUR</b> : 499.99<br><i>Panasonic - UHDWOW. Avec ce téléviseur vous pourrez regarder les plus belles émissions tel que 'TPMP' ou 'Les Anges de la Téléralité' ...</i></p>
    <p><b style="color:red;">2 - ASPIRATEUR</b> : 299.99<br><i>Dyson - Typhon. Ce model aspire comme jaja ! Il parait même qu'il aspire les âmes.</i></p>
    <p><b style="color:red;">3 - MICRO ONDES</b> : 149.95<br><i>LG - TheAtomicOne. Parfait pour votre cuisine, ce micro onde cuit de tout à la perfection, il suffit de choisir le bon mode !</i></p>
    <p><b style="color:red;">4 - ORDINATEUR</b> : 2999.95<br><i>MacBook Pro. WOW ! C'est l'ultime ordinateur par Apple ! (Jusqu'à ce qu'ils en sortent un nouveau dans 6 mois ...)</i></p>
    <p><b style="color:red;">5 - TELEPHONE</b> : 1300.99<br><i>iPhone. WOW ! C'est l'ultime téléphone par Apple ! (Jusqu'à ce qu'ils en sortent un nouveau dans 6 mois ...)</i></p>
    <p><b style="color:red;">6 - LAVE LINGE</b> : 390.90<br><i>Whirlpool. Ce lave linge, lave plus blanc que blanc !</i></p>
    <p><b style="color:red;">7 - REFRIGERATEUR</b> : 149.90<br><i>LG - Groenland. Economique et efficace, le frigo qu'il vous faut.</i></p>
  </div>
  <table>
  <tr>
  <div id="instructions">
  <th style="width:50%;">
  	<p style="font-size: 30px; color: red;"><b><u>INSTRUCTIONS</u></b></p>
  	<p>Afin de passer commande, il vous suffit de saisir le numéro du produit que vous souhaitez ansi que le nombre d'unité voulue. 
  	Si vous voulez autre chose, passez à la ligne et recommencez la manipulation. Vous avez terminez ? Cliquez sur le bouton "Envoyer".</p>
  	<p><b style="color: red;"><u>EXEMPLE</u></b> : Dans le cas ou vous souhaiteriez commander 2 Téléviseurs il vous faudra saisir "1:2" dans l'input prévu à cet effet.</p>
  	<p><i>Toute l'équipe vous souhaite un bon shopping ! :)</i></p>
  </th>
  </div>
  <th>
    <p><b>Nom Complet : </b><input id="prenomNom" name="prenomNom"></p>
    <p><b>Adresse : </b><input id="adresse" name="adresse"></p>
        <div>
          <b><u>Livraison</u> : </b>
             <label for="scales">A domicile</label>
             <input type="radio" id="domicile" name="livraison" value="domicile"> /
       
             <label for="scales">Express</label>
             <input type="radio" id="express" name="livraison" value="express"> /
        
             <label for="scales">Point Relais</label>
             <input type="radio" id="ptrelais" name="livraison" value="ptrelais"> /
        
             <label for="scales">A Retirer</label>
             <input type="radio" id="aretirer" name="livraison" value="aretirer">
        </div>
        <p><b>Informations livraison </b>(interphone, code, etage ?) : <input name="infosL"></p>
        <p><b>Votre panier </b>("produit:quantité" / Un produit par ligne.) :</p>
        <textarea name="panier" rows="4" cols="50"></textarea><br>
        <button>Envoyer</button>
   </th>
   </tr>
   </table>
   <footer>
     <p>Tous droits réservés à Keke, suis moi sur les réseaux : <a href="https://twitter.com/Keuh_vin"><i class="fab fa-twitter-square"></i></a>
     <a href="https://www.facebook.com/kvn.mslwsk"><i class="fab fa-facebook-square"></i></a></p>
   </footer>
   </form>
</body>
</html>