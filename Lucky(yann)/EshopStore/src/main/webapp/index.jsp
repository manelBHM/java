<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="eshop.store.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ECommerce Shop</title>
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:100,200,400,700"
	rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/app.css">
</head>
<body>
	<div class="main">
		<h1>The E-commerce Shop</h1>
		<h2>Products List</h2>


		<form action="EshopServlet" method="post">

			<div class="products">
				<ul>

					<li>
						<h4>
							<input type="checkbox" name="prod" value="Phillips HD7866/61">1
							- Phillips HD7866/61 : 79.99
						</h4>

						<p>Phillips SENSEO Quadrante, Noir - 1 ou 2 tesses</p>
					</li>
					<li>
						<h4>
							<input type="checkbox" name="prod" value="TV Samsung UE49MU6292">2
							- TV Samsung UE49MU6292 : 579.99
						</h4>
						<p>Smart TV LED incurvé 49"</p>
						<p>
							<%
								String p1n = (String) request.getParameter("p1n");
								out.println(p1n);
							%>
						</p>
					</li>
					<li>
						<h4>3 - BEKO TSE 1042 F : 189.0</h4>
						<p>Réfrigérateur BEKO 130L - Classe A+ - blanc</p>
					</li>
				</ul>
			</div>

			<div class="form">
				<h3>Livraison</h3>

				<label for="fullName">Full Name : </label> <input class="first_inp"
					type="text" name="fullName" placeholder="Full name"><br>
				<label class="address" for="address">Address : </label> <input
					class="sec_inp" type="text" name="address" placeholder="Address"><br>
				<label for="address">Code postale : </label> <input
					class="third_inp" type="text" name="code"
					placeholder="Code postale"><br>
				<div class="radio">
					<h4>Mode de livraison</h4>
					<div>
						<label for="domicile">A domicile</label> <input type="radio"
							id="domicile" name="livraison" value="A domicile">
					</div>
					<div>
						<label for="express">Express</label> <input type="radio"
							id="express" name="livraison" value="Express Delivery">
					</div>
					<div>
						<label for="relais">Point de relais</label> <input type="radio"
							id="relais" name="livraison" value="Point Relais">
					</div>
					<div>
						<label for="retire">Sur place</label> <input type="radio"
							id="retire" name="livraison" value="Retire au magasin">
					</div>
				</div>
				<button>Submit</button>
				<div></div>
			</div>
		</form>



		<div class="prodList">
			<h3>The E-Commerce Shop, Paris</h3>
			<h4>Receipt / Facture</h4>
			<div class="cusDetails">
				<p>
					<%
						String fullName = request.getParameter("fullName");
						out.println("Name : " + fullName);
					%>
				</p>
				<p>
					<%
						String address = request.getParameter("address");
						out.println("Addrss : " + address);
					%>

				</p>

				<p>
					<%
						String code = request.getParameter("code");
						out.println("Postal Code : " + code);
					%>

				</p>
			</div>
			<div class="prodDetails">

				<h5>Mode de livraison</h5>
				<p>
					<%
		
		String livraisonSelected = (String)request.getAttribute("livraison");
		out.println("Mode de livraison : " + livraisonSelected);
		
		
		%>

		</p>
			
		
<p>
				<%
	      List<Product> prod = (ArrayList)request.getAttribute("produit");
				
				for(Product p : prod)
				{
					out.print("<input type=checkbox>"+"nom: "+p.getName() + "; description: "+p.getDescription()+ "; Price: " + p.getPrice()+"<br>");
				}
				%>

					</p>

			</div>
		</div>
	</div>
</body>
</html>
