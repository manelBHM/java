<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <html>
<head>
<meta charset="UTF-8">
<title>EPharma / Accueil</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link type="text/css" rel="stylesheet" href="NewFile.css">
</head>
<body>

    
<nav class="navbar navbar-expand-lg navbar-light bg-light ">
   <a class="navbar-brand" href="#">
    <img src="https://upload.wikimedia.org/wikipedia/commons/3/3b/Pharmacie_de_Juilly.gif" width="30" height="30" alt="">
  </a>
  <a class="navbar-brand" href="/EPharma/EPharmaServlet">EPharma</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="/EPharma/EPharmaServlet"><button type="button" class="btn btn-outline-success">Accueil </button><span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/EPharma/APropos.jsp"><button type="button" class="btn btn-outline-success">A Propos</button></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/EPharma/Connexion.jsp"><button type="button" class="btn btn-outline-success">Connexion</button></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/EPharma/Panier.jsp"><button type="button" class="btn btn-outline-success">Panier</button></a></a>
      </li>
    </ul>
  </div>
</nav>

<h1 align="center"> Nos Rayons </h1>
<div class="bd-example">
  <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
      <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
      <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
      <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner">
      <div class="carousel-item active">
       <a href="/EPharma/EPharmaServlet"> <img src="http://pharmacie-aspres-binetruy.fr/wp-content/uploads/2013/04/bann6-630x250.jpg" class="d-block w-100" alt="image"></a>
        <div class="carousel-caption d-none d-md-block">
          <h5>Medicament Sans Ordonnance</h5>
          <p>Choisissez vos medicament sans ordonnance !</p>
       
        </div>
      </div>
      <div class="carousel-item">
       <a href="/EPharma/ParaMedocOrdonnance.jsp"> <img src="http://pharmacie-delabbaye-cormery.com/wp-content/uploads/2013/11/bann3-630x250.jpg" class="d-block w-100" alt="image"></a>
        <div class="carousel-caption d-none d-md-block">
          <h5>Medicament Avec Ordonnance</h5>
          <p>Scanner votre ordonnance pour pouvoir acheter vos medicaments !</p>
        </div>
      </div>
      <div class="carousel-item">
       <a href="/EPharma/ParaMedocSoin.jsp"> <img src="http://pharmacie-gap-saintroch.fr/wp-content/uploads/2013/04/bann5-630x250.jpg" class="d-block w-100" alt="image"></a>
        <div class="carousel-caption d-none d-md-block">
          <h5>Soin Pharmaceutique</h5>
          <p>Large choix de produits Soin Pharmaceutique !</p>
        </div>
      </div>
    </div>
    <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
   
   
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>   
</body>
</html>
