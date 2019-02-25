<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*"%>
<%@ page import="eshop.store.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form action="ShopServlet" method="get">
		<label for="fullname">Fullname</label> <input type="text"
			id="fullname" name="fullname"><br> <label for="address">addresse</label>
		<input type="text" id="address" name="address"><br> <label
			for="postalcode">Code Postal</label> <input type="number"
			id="postalcode" name="postalcode"><br> <br>

		<h1>Products List</h1>

		<% List<Product>prod = (ArrayList)request.getAttribute("produit"); 
		       
			for(Product p : prod)
			{
			 out.println("<input type=checkbox name=products value="+p.getName()+">"+p.getName() + " -- "+ p.getDescription() + " -- " + p.getPrice()+"<input type=text name=quantity placeholder=QTS size=5><br>");
			}
			
			%>
			
			
		<br> 
		<label for="home">Home Delivery</label> 
		<input type="radio" id="home" name="delivery" value="Home"><br> 
			<label for="Relay">Relay Delivery</label>
			 <input type="radio" id="relay" name="delivery" value="Relay"><br> 
			 <label for="express">Express Delivery</label> 
			 <input type="radio" id="express" name="delivery" value="Express"><br>

		<button>Send</button>
	</form>

</body>
</html>