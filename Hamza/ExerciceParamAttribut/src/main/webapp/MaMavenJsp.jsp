<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Application</title>
</head>
<body>
	<h1 align=center>Exercice sur les paramètres et les attributs</h1>
	<p align=center>Ceci est une page générée depuis un JSP</p>

	<p>
		<%
			String message = (String) request.getAttribute("message");
			out.println(message + "<br>");

			String nomP = request.getParameter("nom");
			out.println(
					"Je m'appelle " + nomP + " " + request.getParameter("prenom") + " et je suis un paramètre. <br>");

			String nomA = (String) request.getAttribute("nom");
			out.println(
					"Je m'appelle " + nomA + " " + request.getAttribute("prenom") + " et je suis un attribut. <br>");
		%>
	</p>
</body>
</html>