<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Panier</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
<style type="text/css">
body{
color: black;
text-align: center;
font-family: Arial;
background-color: green;
}
.logo img{

width:50px;
height: 50px;
}
.commande{
display: flex;
flex-direction: column;
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
.tet{
background-color:white;
box-shadow: 2px 2px 2px 2px green;
width: 40%;
height: 10%;
margin: 100px 0 50px 450px;

}
span{
color: red;
}
</style>
</head>
<body>
<header>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="http://localhost:8080/Pharmacie/PharmacieServlet"><i class="fas fa-home"></i>home</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
     
      <li class="nav-item">
        <a class="nav-link" href="http://localhost:8080/Pharmacie/Panier.jsp"><i class="fas fa-shopping-cart"></i> shopping cart</a>
      </li>
    </ul>
  </div>
   <div class="logo" class="form-inline my-2 my-lg-0  pull-right"><img src="Pharmacy.png" alt=""></div>
</nav>
</header>


<div class="tet">


	<form class="shop" action="PharmacieServlet" method="get">
		<br>
	<br>
	<br>
	<h3>Commande</h3>
	<br>
	<br>
	<br>
	<div class="commande">
		
		<p><%
    StringBuilder produit = (StringBuilder) request.getAttribute("listduPanier");
    out.println(produit); %></p>
    
    
	<form class="shop" action="PharmacieServlet" method="get">
	<label for="nom">Nom: <span class="requis">*</span></label>
	        	<input type="text" name="nom" value="" size="20" maxlength="60" />
				<br>
				
	         	<label for="prenom">Prenom: <span class="requis">*</span></label>
	            <input type="text" name="prenom" value="" size="20" maxlength="60" />
	            <br />
	<button class="bouton" action="submit">Valider</button>
	</form>
	<br/>
	<br/>
	<br/>
	<br/>
	
		
     
	</form>
</div>
	
</body>
</html>