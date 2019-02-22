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
<title>Facture</title>
<style>
body{
color: black;
text-align: center;
font-family: Arial;
background-color: #d3d6d6;
}
p{
text-align: center;
justify-content: center;
align-items: center;
}
</style>
</head>
<body>

	<p>
		<%
			out.println(request.getAttribute("afficher") + "<br>");
		%>
	</p>
	
</body>
</html>