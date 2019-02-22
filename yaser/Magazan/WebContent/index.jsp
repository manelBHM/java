<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p><b>1-télévision:</b>599 € <br> hd Samsong  </p>
<p><b>2-frigo:</b> 600 € <br>americain côte-à-côte   </p>

<form action = "TestMagazen" method="get">
		<label for="Name">Name <span class="requis">*</span></label>
                <input type="text" name="nom" value="" size="20" maxlength="60" />
                <br />
                
         <label for="adresse">adresse<span class="requis">*</span></label>
                <input type="text" name="adresse" value="" size="20" maxlength="60" />
                <br />
                
a domicile :  <input type="radio" > <br>
 Express : <input type="radio" > <br>
 point relais : <input type="radio"> <br>
a retirer :   <input type="radio"> <br>
 Information livraison (relay et exress)    <input type="text"> <br>

<br>
                <label for="list product">list product <span class="requis">*</span></label>
                <input type="text" name="listProduct" value="" size="50" maxlength="160" />
                <br />
                
                <button>Envoyer</button>
	</form>
	
	
	
	

</body>

</html>

