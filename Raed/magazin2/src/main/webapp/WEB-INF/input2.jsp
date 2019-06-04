<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
 
 <%@ page import="java.util.Map" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>							
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<style>
#are{
	height: 100px;
}
.container{
	    background-color: darkgray;
}
.form-control {
	width:330px;
}
</style>
</head>
<body>
	
	





	<div class="container" style="margin-top: 30px;padding: 30px;">


<ul class="list-unstyled">
  <li class="media">
    
    <div class="media-body">
      <h5 class="mt-0 mb-1">0 - Philips HD7866/61: 79.99</h5>
       <span>Philips SENSEO Quandrante, Noir -1 ou 2 tasses</span>
    </div>
  </li>
  <li class="media my-4">
    
    <div class="media-body">
     
     <h5 class="mt-0 mb-1">1 - TV Samsung UF49MU6292: 599.0</h5>
     <span>Smart Tv LED incurvee 49</span>
     </div>
  </li>
  <li class="media">
    
    <div class="media-body">
      <h5 class="mt-0 mb-1">2 - BEKO TSE 1042: 189.0</h5>
      Refrigerateur BEKO 130L - Class A+- blanc
     </div>
  </li>
</ul>	

 <form action="MagazinServlet" method="get" style="margin-top: 40px;" id="myForm">
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Full name:</label>
    <div class="col-sm-10">
      <input type="text" name="name" class="form-control" id="inputEmail3" placeholder="fullname">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label">Full address:</label>
    <div class="col-sm-10">
      <input type="text" name="address" class="form-control" id="inputPassword3" placeholder="address">
    </div>
  </div>
  
    <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">city:</label>
    <div class="col-sm-10">
      <input type="text" name="city" class="form-control" id="inputEmail3" placeholder="city">
    </div>
  </div>
  
  <fieldset class="form-group">
    <div class="row">
      <legend class="col-form-label col-sm-2 pt-0">Livraison:</legend>
      <div class="col-sm-10">
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="express" checked>
          <label class="form-check-label" for="gridRadios1">
            Express
          </label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="domicile">
          <label class="form-check-label" for="gridRadios2">
            A domicile
          </label>
        </div>
        <div class="form-check ">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios3" value="point">
          <label class="form-check-label" for="gridRadios3">
            Point retirer
          </label>
        </div>
               <div class="form-check ">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios4" value="retirer">
          <label class="form-check-label" for="gridRadios4">
            a retirer
          </label>
        </div>
      </div>
    </div>
  </fieldset>
  <b>Information livrasion </b>(Relais  Express    )    : </b></b><input type="text" name="info" id="myVal" style="width:240px;"/><br><br>
  
  list products  <br>
  <p>
  available products : cafe, tv, and tele.<br>
  to choos a product you have to add the product<br> name : followed by the number of quantity <strong>e.g(tele:1)</strong>
  </p>
  <textarea  name="area" id="are" row="10" cols="40">
  
  </textarea>
  <br><br>

  <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary">submit</button>
    </div>
  </div>
</form>
		 

		
	 
		
	
	</div>
	
	<script>
	$(document).ready(function(){
	    $('#myForm input').on('change', function() {
	        var myVal = $('input[name=gridRadios]:checked', '#myForm').val();
 
	        $("#myVal").val("You have chosen : "+myVal);
	        });
	 });
	</script>
	
	
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>


</body>
</html>