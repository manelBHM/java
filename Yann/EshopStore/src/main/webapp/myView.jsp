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


		<%
			List<Product> prod = (ArrayList) request.getAttribute("produit");

			for (Product p : prod) {
	out.println(p);
			}
		%>


		<br> <label for="home">Home Delivery</label>
		<input type="radio" id="home" name="delivery" value="domicile"><br> 
			
			<label for="relay">Relay Delivery</label>
			 <input type="radio" id="relay" name="delivery" value="relais"><br>
			 
	<label for="express">Express Delivery</label> 
	<input type="radio" id="express" name="delivery" value="express"><br>

		<button>Send</button>
	</form>
	<br>



	<h2>All Product Selected</h2>
	<p>
		<%
			String nom = (String) request.getAttribute("nom");
			String adress = (String) request.getAttribute("adress");
			String postalcode = (String) request.getAttribute("postalcode");
			String test = (String) request.getAttribute("test");
			
	//List<Product> test = (ArrayList) request.getAttribute("test");
			out.println("allQueryString ==> " + test+"<br>");
				
			out.println("fullname: " + nom + " adress: "+ adress + " postalcode " + postalcode);
		%>

	</p>

</body>
</html>