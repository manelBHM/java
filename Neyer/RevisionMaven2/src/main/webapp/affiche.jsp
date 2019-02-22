<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p><%= request.getAttribute("prenomAtt")%></p>
<p><%= request.getAttribute("nomAtt")%></p>

<form action="PrenomNom" method="post">
		Prenom: <input type="text" name="prenom"><br>
		Nom : <input type="text" name="nom"><br> <input
			type="submit" value="Submit">
	</form>

</body>
</html>