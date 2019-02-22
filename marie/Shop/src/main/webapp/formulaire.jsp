<%@page import="simplon.Produit"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="simplon.Client"%>
<%@page import="simplon.* , controller.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import = "simplon.*" %>
<html>
<head>
<meta charset="UTF-8">
<title>Boulanger</title>
<img src="http://www.lessensdecapucine.com/charlemagne25/grand-media/image/BOULANGER.png" alt="logo">
<style type="text/css">
body{
color: black;
text-align: center;
font-family: Arial;
background-color: #d3d6d6;
}
.image{
width: 150px;
height: 150px;
}
.pro{
color: black;
}
span{
color: red;
}
h1{
font-family: Arial;
font-size 80px;
text-align: center;
}
.prod1{
display: flex;
flex-direction: row;
text-align: center;
justify-content: space-around;
align-items: center;
}
.prod2{
display: flex;
flex-direction: row;
text-align: center;
justify-content: space-around;
align-items: center;
}
.commande{
display: flex;
flex-direction: row;
text-align: center;
justify-content: space-around;
align-items: center;
}
.instruction{
display: flex;
flex-direction: column;
text-align: center;
justify-content: center;
align-items: center;
width: 600px;
height: 600px;
border: 2px solid black;
}
.formulaire{
width: 1000px;
height: 600px;
border: 2px solid black;
}
.radio{
text-align: left;
margin-left: 300px;
}

.name{
text-align: left;
margin-left: 300px;
}
.name label {
float: left;
width: 200px;
}
.name input {
border: 1px #999 solid;
}
.bouton{
  display: flex; 
  margin: 30px;
  display: inline-block;
  width: 60px;
  height: 36px;
  cursor: pointer;
  text-align: top left;
  text-decoration: none;
  outline: none;
  color: white;
  background-color: rgb(43, 136, 179);
  border: none;
  border-radius: 10px;
  box-shadow: 0 5px #999;
  justify-content: flex-end;
  align-items: flex-start;
}

.bouton:hover {background-color: rgb(43, 136, 179);
}
.bouton:active {
  background-color: rgb(43, 136, 179);;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
</style>
</head>
<body>
		<h1>Bienvenue dans votre magasin Boulanger</h1>
			<p class="date"><%=new java.util.Date()%></p>
			<br>
			
			<h3>Liste des articles disponibles</h3>
			<br>
			
		<%-- <p>
			<%
				out.println(request.getAttribute("afficherProduit"));
			%>
		</p> --%>
		
<form class="shop" action="shopServlet" method="get">
	
		<div class="prod1">
		
			<div class="tv">
				<img class="image" src="https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/image/AppleInc/aos/published/images/a/pp/apple/tv/apple-tv-hero-select-201709_FMT_WHH?wid=518&amp;hei=446&amp;fmt=jpeg&amp;qlt=95&amp;op_usm=0.5,0.5&amp;.v=1504731332280" alt="image">
				<p class="pro"><b>1 - Televiseur</b></p>
				<p>AppleTV, 4k, full HD, Ecran incurvé, 32 Pouce</p>
				<p>600.0 Euro</p>
			</div>
			<div class="tel">
				<img class="image" src="http://www.quickfileupload.com/wp-content/uploads/2018/09/pics-of-iphone-8-apple-iphone-8-64-go-or-pas-cher-achat-vente-smartphone-hd-themes-for-windows-10.jpg" alt="image">
				<p class="pro"><b>2 - Telephone</b></p>
				<p>Iphone 8 Plus, 7 Pouce, 200Go ,10MP</p>
				<p>700.0 Euro</p>
			</div>
			<div class="ordi">
			<img class="image" src="https://dyw7ncnq1en5l.cloudfront.net/optim/produits/150/22105/asus-rog-g551jk_264807f1990aade1__450_400.jpg" alt="image">
				<p class="pro"><b>3 - Ordinateur</b></p>
				<p>Asus, Windows 10, 17 Pouce, NVIDIA GFORCE</p>
				<p>800.0 Euro</p>
			</div>
			
		</div>
		<br>
		<br>
		<br>
		<div class="prod2">
		
			<div class="tab">
			<img class="image" src="https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/image/AppleInc/aos/published/images/i/pa/ipad/wifi/ipad-wifi-select-spacegray-201803_GEO_US?wid=470&hei=556&fmt=png-alpha&.v=1538434015990" alt="image">
				<p class="pro"><b>4 - Tablette</b></p>
				<p>Ipad, Full HD, 9 Pouce, 32 Go</p>
				<p>500.0</p>
			</div>
			<div class="cons">
			<img class="image" src="https://i2.cdscdn.com/pdt2/8/8/0/2/1200x1200/son6889284395880/rw/ps4-slim-1to-playstation-4-manette-dualshock-4-n.jpg" alt="image">
				<p class="pro"><b>5 - Console</b></p>
				<p>Plastation 4, 1T, 8 Coeur, Manette dualschoc</p>
				<p>300.0 Euro</p>
			</div>
			<div class="jeux">
			<img class="image" src="https://images-na.ssl-images-amazon.com/images/I/71vMMnIlVBL._SX342_.jpg" alt="image">
				<p class="pro"><b>6 - Jeux</b></p>
				<p>Red Dead Redemption II, Jeux PS4, Mode Online, 1 Joueur</p>
				<p>70.0 Euro</p>
			</div>
			
		</div>
	<br>
	<br>
	<br>
	<h3>Commande</h3>
	<br>
	<br>
	<br>
	<div class="commande">
		<div class="instruction">
				<h3><span>Instruction:</span></h3>
				<br>
				<p>Afin de passer commande, il vous suffit de saisir le numéro
				du produit que vous souhaitez ansi que le nombre d'unité voulue.
				Exemple: 1:1</p>
		</div>
	
		<div class="formulaire">
			<h3>Veuillez saisir vos coordonner</h3>
			<div class="name">
				<label for="nom">Nom: <span class="requis">*</span></label>
	        	<input type="text" name="nom" value="" size="20" maxlength="60" />
				<br>
				
	         	<label for="prenom">Prenom: <span class="requis">*</span></label>
	            <input type="text" name="prenom" value="" size="20" maxlength="60" />
	            <br />
	            
	            <label for="adress">Adress: <span class="requis">*</span></label>
	            <input type="text" name="adress" value="" size="20" maxlength="60" />
	            <br />
	        </div> 
	        <br>
	        <h3>Quel est votre mode de livraison?</h3>
		
			<div class="radio">
				<div>
				  	<input type="radio" id="express" name="livraison" value="express">
				  	<label for="express">Domicile Express<span class="requis">*</span></label>
				</div>
				
				<div>
				  	<input type="radio" id="standar" name="livraison" value="standar">
				  	<label for="scales">Domicile Standar<span class="requis">*</span></label>
				</div>
				
				<div>
				  	<input type="radio" id="retrait" name="livraison" value="retrait">
				  	<label for="scales">Retrait en magasin<span class="requis">*</span></label>
				</div>
				
				<div>
				  	<input type="radio" id="relay" name="livraison" value="relay">
				  	<label for="scales">Point relay<span class="requis">*</span></label>
				</div>
			</div>
			<br>
					<h3>Veuillez indiquer le numero du produit et la quantiter<span class="requis">*</span></h3>
					<textarea name="produits"></textarea>
				<br>
					 <button class="bouton" action="submit">Valider</button>
	     </div>
     </div>
     
	</form>
	
			
		
	
</body>
</html>














