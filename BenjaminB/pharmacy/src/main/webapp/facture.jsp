<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Facture</title>
<style>
body {
	text-align: center;
}
</style>
</head>
<body>
<form action="PharmacieServlet" method="get">
	<%
		out.println(request.getAttribute("afficher") + "<br>");
	%>
	<br>
</form>
</body>
</html>