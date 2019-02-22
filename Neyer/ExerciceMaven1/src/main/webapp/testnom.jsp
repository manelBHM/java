<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test</title>
</head>
<body>

	
	<P>Je m'appelle 
		<%
			String parametre = request.getParameter("nom");
			out.print(parametre);
			
			
		%>
	</P>
	
	<br>
	
	<P> 
		<%
			String attribut = (String)request.getAttribute("lenom");
			out.print(attribut.toUpperCase());
		%>
	</P>
	
</body>
</html>