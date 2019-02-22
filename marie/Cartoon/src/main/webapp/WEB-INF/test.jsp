<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Web</title>
</head>
<body>
<p><%
String nom = (String)request.getAttribute("nom");
out.println(nom);

String parameter = request.getParameter("nom");
out.println(parameter);
%></p>

<p><%
String prenom =(String)request.getAttribute("attribute");
out.println(prenom);
%></p>

</body>
</html>