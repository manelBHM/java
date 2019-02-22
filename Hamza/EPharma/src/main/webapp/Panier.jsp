<%@page import="co.epharma.produit.Produit"%>
<%@page import="java.util.Map"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="co.epharma.client.Client"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css" />

<title>Panier</title>
</head>

<body align=center>


	<p align=center>
		
		<b>VOTRE FACTURE SUR EPHARMA <br></b>

	</p>
	<p>

		<%
			out.println(request.getAttribute("afficher") + "<br>");
		%>

	</p>
	
	<p align=center>
		
		<b>VOTRE HISTORIQUE D'ACHAT <br></b>

	</p>
	
	
	
	<p>
	
		<%
			out.println(request.getAttribute("afficherHistor") + "<br>");
		%>
	</p>
	
	

	
	
</body>
</html>