<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<%
			String attribut = (String) request.getAttribute("attribut");
			out.println(attribut + "<br>");

			String nomP = request.getParameter("nom");
			out.println("Je m'appelle " + nomP + " " + request.getAttribute("prenom") + " et je suis un paramètre. <br>");

			String nomA = (String) request.getAttribute("nom");
			out.println("Je m'appelle " + nomA + " " +request.getAttribute("prenom") + " et je suis un attribut. <br>");
		%>
</body>
</html>