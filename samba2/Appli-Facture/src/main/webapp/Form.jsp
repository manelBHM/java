<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!--  <p><b>O - Phillips HD7866/61 : 79.99 </b></p> -->
<!--  <p>Phillips Senseo Quarante, Noir - 1 ou 2 Tasses</p> -->
 
<!--  <p><b>1 - TV Samsung UE49MU6292 : 599.0</b></p> -->
<!--  <p>Smart TV LED incurvée 49 </p> -->
 
<!--  <p><b>2 - BEKO TSE 1042 F : 189.0</b></p> -->
<!--  <p>Refrigérateur BEKO 130L - Classe A+ -Blanc</p> -->

<p><b><%out.println(request.getAttribute("showDataBase")); %></b></p><br>
 	
	<form action="Shopping" method="get" >
	<div>
	First name:<br>
		<input type="text" name="nom" value="Mickey" />
	<br>
	Last Address:<br>
		<input type="text" name="address" value="1 rue de la republic 75001 Paris" size="30" maxlength="30" />
	<br><br>
 	</div>
	
	 Livraison : <br>
		Domicile: <input type="radio" name="modeLivrason" value="direct" ><br>
		Express : <input type="radio" name="modeLivrason" value="exppress"><br>
		Relay   : <input type="radio" name="modeLivrason" value="relay"> <br>
		Retirer : <input type="radio" name="modeLivrason" value="takeway"> <br>
	Info livraison (Relay / express) : <br><textarea name="product" rows="4" cols="50"></textarea><br>
		<input type="submit" value="Submit" />
	</form> 
	

</body>
</html>