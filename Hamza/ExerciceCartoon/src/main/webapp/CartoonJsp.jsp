<%@page import="co.hamza.CartoonClass"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cartoon</title>
</head>
<body>

	<h1 align=center>Les Cartoons</h1>

	<p>
		
		<%
			String nomP = request.getParameter("nom");
			out.println("Nom : " + nomP + " - " + " Type : paramètre. <br>");

			String nomA = (String) request.getAttribute("nom");
			out.println("Nom : " + nomA + " - " + " Type : attribut. <br>");
		%>

	</p>

</body>
</html>