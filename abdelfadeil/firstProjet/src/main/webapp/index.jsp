<%@page import="com.apps.myServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simplon.com promo java</title>
<link rel="stylesheet" type="text/css" href="WEB-INF/css/style.css" />
</head>
<body>

	<h1>Hello dans mon projet jee</h1>
	<p>page index.jsp</p>





	<%
		String nom = request.getParameter("nom");
		out.print(nom);
	%>
	<%
		String prenom = request.getParameter("prenom");

		out.print(prenom);
	%>
	<br>
	<p>
		<%
			String lName = (String) request.getAttribute("lName");
			out.print(lName);
		%>
		<%
			String fName = (String) request.getAttribute("fName");
			out.print(fName);
		%>
	</p>



	<%
		String auteur = (String) request.getAttribute("textNom");

		out.println(auteur);
	%>
	

	<form action="" method="post">
		<p>
			Nom:<input type="text" name="firstName">
		</p>
		<p>
			Prenom: <input type="text" name="lastName">
		</p>
		<input type="submit">
	</form>
</body>
</html>