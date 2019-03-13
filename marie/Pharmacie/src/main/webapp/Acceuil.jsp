<%@page import="co.simplon.Produit"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="co.simplon.Client"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pharmacie</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
<style type="text/css">
body{
color: black;
text-align: center;
font-family: Arial;
}
.logo img{

width:50px;
height: 50px;
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
.prod1 .Doliprane{
width:200px;
}
.prod1 .Dafalgan{
width:200px;
}
.prod1 .Spasfon{
width:200px;
}

 .prod2{
display:flex;
flex-direction:row;
text-align:center;
justify-content:space-around;
align-items:center;
padding: 15px;


} 
.prod2 .Siro{
width:200px;
}
.prod2 .sir{

}
.prod2 .Osilo{
width:200px;

}
.prod2 .Coludol{
width:200px;
}
.sir{
margin-left: 150px;
}
.osi{
margin-left: 300PX;
}
.col{
margin-left: 150px;
}

</style>
</head>
<body>
<header>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#"><i class="fas fa-home"></i>home</a>
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


	<h1>Pharmacie</h1>
			<p class="date"><%=new java.util.Date()%></p>
			<br>
			
			<h3>Liste des produits disponibles</h3>
			<br>
		
	

	
		<div class="prod1">
		
			<div class="dol">
			<form class="shop" action="PharmacieServlet" method="post">
				<img class="Doliprane" src="doliprane.jpg" alt="">
				<p class="pro"><b>Doliprane</b></p>
				<p>4.0 €</p>
				<br>
					 <button  class="btn btn-success pull-right" type="submit" name="produit" value="0">add to shopping cart</button>
					 	</form>	
			</div>
			
			<div class="daf">
			<form class="shop" action="PharmacieServlet" method="post">
				<img class="Dafalgan" src="dafalgan.jpg" alt="">
				<p class="pro"><b>Dafalgan</b></p>
				<p>3.0 €</p>
				<br>
					  <button  class="btn btn-success pull-right" type="submit" name="produit" value="1">add to shopping cart</button>
					  </form>
			</div>
			<div class="spa">
			<form class="shop" action="PharmacieServlet" method="post">
			<img class="Spasfon" src="spasfon.png" alt="">
				<p class="pro"><b>Spasfon</b></p>
				<p>3.0 €</p>
				<br>
					  <button  class="btn btn-success pull-right" type="submit" name="produit" value="2">add to shopping cart</button>
					  </form>
			</div>
			
		</div>
		<br/>
		<br/>
		<br/>
		
		
	
		<div class="prod2">
		
		<div class="sir">
		<form class="shop" action="PharmacieServlet" method="post">
			<img class=" Siro" src="sirop.jpg" alt="">
				<p class="pro"><b>Sirop</b></p>
				<p>6.0 €</p>
				<br>
					   <button  class="btn btn-success pull-right" type="submit" name="produit" value="3">add to shopping cart</button>
					   </form>
			</div>
			
			<div class="osi">
			<form class="shop" action="PharmacieServlet" method="post">
			<img class="Osilo" src="oscillo.jpg" alt="">
				<p class="pro"><b>Oscillo</b></p>
				<p>5.0 €</p>
				<br>
				  <button  class="btn btn-success pull-right" type="submit" name="produit" value="4">add to shopping cart</button>
				  </form>
			</div>
			<div class="col">
			<form class="shop" action="PharmacieServlet" method="post">
			<img class="Coludol" src="colludol.jpg" alt="">
				<p class="pro"><b>Colludol</b></p>
				<p>5.0 €</p>
				<br>
					  <button  class="btn btn-success pull-right" type="submit" name="produit" value="5">add to shopping cart</button>
					  </form>
			</div>
			
			
			
	</div>
	<br/>
	<br/>
	<hr>

</body>
</html>












