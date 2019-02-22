<%@page import="com.apps.myServlet" %>
 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simplon.com promo java</title>
<link rel="stylesheet" type="text/css" href="WEB-INF/css/style.css"/>
</head>
<body>

<h1>Hello dans mon projet jee </h1>
<p>page index2.jsp</p>

<p>Page redirigée par la méthode doPost</p>



<%
     String nom = request.getParameter("nom");
  out.print(nom);%>
<%
     String prenom = request.getParameter("prenom");

      out.print(prenom); 
%>
<br>

<form action="" method="post">
<p>   Nom: <%  String lastName = (String)request.getAttribute("lastName");
out.print(lastName);
%> </p>
<p>Prenom: <%  String firstName = (String)request.getAttribute("firstName");
out.print(firstName);
%></p>
</form>
</body>
</html>