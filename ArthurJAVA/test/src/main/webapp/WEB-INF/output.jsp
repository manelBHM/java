<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="java.util.*"%>

	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>HELLO</h1>
	
	
	
	
<!-- 	<div> -->
			
			
<%-- 			<%out.println("Bienvenue au MAGASIN");%> <br> --%>
<%-- 			<%out.println("66 friedireschain strasse, Berlin");%><br> --%>
<%-- 			<%out.println(request.getParameter("fullname"));%><br> --%>
<%-- 			<%out.println(request.getParameter("adress"));%><br> --%>
<%-- 	        <%out.println(request.getParameter("ID"));%><br>			 --%>
<%-- 			<%out.println("");%><br> --%>
<%-- 			<%out.println("Mode de livraison : " + request.getAttribute("livraison"));%><br> --%>
<%-- 			<%out.println("Info livraison : " + request.getParameter("info"));%> --%>
<%-- 			<%out.println("-------------------------");%><br> --%>
<%-- 			<%out.println("Produits :");%><br> --%>
<!-- 			<br> -->
<%-- 			<%out.println(request.getAttribute("test"));%><br> --%>
<%-- 			<% --%>
// 			String[] tableau = (String[])request.getAttribute("tab");
// 			for(String str : tableau){
// 				out.println(str);
<%-- 			}%><br> --%>
<%-- 			<%out.println(request.getAttribute("tab"));%><br> --%>
<%-- 			<%out.println("");%><br> --%>
<%-- 			<%out.println(request.getAttribute("total"));%> --%>
<%-- 			<%out.println((String)request.getParameter("choixproduit"));%> --%>
<%-- 			<%out.println("");%> --%>
<%-- 			<%out.println("");%> --%>
<%-- 			<%out.println("");%> --%>
			
			

<!-- 		</div> -->

<p>

		<%
			out.println(request.getAttribute("afficher") + "<br>");
		%>




	</p>


</body>
</html>