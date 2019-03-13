<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*, maven_projet1.mvn_test1.*" %>   
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
 <%@ page import="java.util.Map" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

</style>
</head>
<body>
	<div>
	
	
		 	<form action="HelloWorldServlet" method="post">
		
		 <%-- <%
		 
		 Map<Product, Integer> ls = ((HashMap<Product,Integer>)request.getAttribute("map"));
		 
		 for(Map.Entry<Product, Integer> p: ls.entrySet())
		 {
			 %>
			 
			<p><% out.print(p.getKey().toString()); %> </p>
			<p><%out.print(p.getValue()); %> </p>
		
		<% 
		
		 }
		 
		 
		 
		 
		 
		 %>
		 --%>
		 
		 
		 
		 
		 
		 <p>
		 
		 	<%
		 	
		 	String st = (String)request.getAttribute("name");
		 	out.println(st);
			request.getAttribute("description");
			request.getAttribute("price");
		 	
		 	
		 	%>
		 
		 
		 
		 </p>
	 
			Nom complet:<input type="text" name="fname"/><br>
				address:<input type="text" name = "faddress"/><br>
				<br><br>
				<form action="">
				<h5>Livraison:</h5>
					à domicile :<input type="radio" name="value" value="domicile"/><br>
					express :<input type="radio" name="value" value="express"/><br>
					point relais :<input type="radio" name="value" value="pointRelais"/><br>
					à retirer :<input type="radio" name="value" value="retirer"/><br>
				</form>
				<strong>informations livraison</strong>(relay et express):
				<input type="text" value=""/>
				<br><br>
				
				<strong>List produits</strong> (produit: quantity, un produit par ligne): <br>
				<textarea rows="5" cols="50" value="textArea"></textarea>
				
				<br>
				<input type="submit" value="Submit"/>
		
		</form>
		 

		
	 
		
	
	</div>
</body>
</html>