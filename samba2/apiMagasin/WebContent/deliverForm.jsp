<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>

 <p><b>O - Phillips HD7866/61 : 79.99 </b></p>
 <p>Phillips Senseo Quarante, Noir - 1 ou 2 Tasses</p>
 
 <p><b>1 - TV Samsung UE49MU6292 : 599.0</b></p>
 <p>Smart TV LED incurvée 49 </p>
 
 <p><b>2 - BEKO TSE 1042 F : 189.0</b></p>
 <p>Refrigérateur BEKO 130L - Classe A+ -Blanc</p>
 
	
	<form action="ShowBill" method="get" >
	First name:<br>
		<input type="text" name="firstname" value="Mickey" />
	<br>
	Last name:<br>
		<input type="text" name="lastname" value="Mouse" />
	<br><br>
	
	<div>
	 Livraison : <br>
	 <label for="domicile"> A domicile </label>
  		<input type="radio" id="domicile" name="domicile" value="direct" />
	</div>

	<div>
	<label for="express">Express</label>
  		<input type="radio" id="express" name="express" value="express" />
	</div>

	<div>
	     <label for="relay">Point relay</label>
 		 <input type="radio" id="relay" name="relay" value="relay" />
	</div>
	
	<div>
		 <label for="retire">A retirer </label>
 		 <input type="radio" id="retir" name="retir" value="takeaway" />
	</div><br>
	
	Info livraison (Relay / express) : <br><textarea rows="4" cols="50"></textarea><br>
	<input type="file" name="file"  value="deliverInfo"  />
		<input type="submit" value="Submit" />
	</form> 
	

    
</body>
</html>