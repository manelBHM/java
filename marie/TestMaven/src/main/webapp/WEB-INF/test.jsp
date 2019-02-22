<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Web</title>
<style type="text/css">
body{
background-color: rgb(39, 95, 186);
text-align: center;
font-family: Arial;
}
h1{
font-family: Arial;
font-size 80px;
text-align: center;
}
form{
text-align: left;
margin-left: 500px;
}
form label {
float: left;
width: 200px;
}
form input {
border: 1px #999 solid;
}
.bouton{
  display: flex; 
  margin: 30px;
  display: inline-block;
  width: 60px;
  height: 36px;
  cursor: pointer;
  text-align: top left;
  text-decoration: none;
  outline: none;
  color: white;
  background-color: rgb(43, 136, 179);
  border: none;
  border-radius: 10px;
  box-shadow: 0 5px #999;
  justify-content: flex-end;
  align-items: flex-start;
}

.bouton:hover {background-color: rgb(43, 136, 179);
}
.bouton:active {
  background-color: rgb(43, 136, 179);;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
</style>
</head>

<body>

	<h1>Hello World!</h1>

	<p class="date">
		The
		<%=new java.util.Date()%></p>

	<!-- <p>Cesi est une page générée depuis une JSP.</p>

	<p>Je m'appelle 
		<%
			//>String parametre = request.getParameter("nom");
			//out.println(parametre);

			//String attribut = (String)request.getAttribute("test");
			//out.println(attribut);
			
		%>
	</p> -->

		
	
		<%-- <p><%
	
			String nom = (String)request.getAttribute("nom");
			out.println(nom);
			String prenom = (String)request.getAttribute("prenom");
			out.println(prenom);
		%></p> --%>
	<br>
	
	

	<h3 class="form">Formulaire</h3>
	
	<form action = "http://localhost:8080/TestMaven/Hello" method="post">
		<label for="nom">Nom <span class="requis">:</span></label>
                <input type="text" name="nom" value="" size="20" maxlength="60" />
               
                <br>
         <label for="prenom">Prenom <span class="requis">:</span></label>
                <input type="text" name="prenom" value="" size="20" maxlength="60" />
                <br />
                
                <label for="prenom">Age <span class="requis">:</span></label>
                <input type="text" name="age" value="" size="20" maxlength="60" />
                <br />
                
                <label for="prenom">Date<span class="requis">:</span></label>
                <input type="text" name="date" value="" size="20" maxlength="60" />
                <br />
                
                <label for="prenom">Metier <span class="requis">:</span></label>
                <input type="text" name="metier" value="" size="20" maxlength="60" />
                <br />
                
                <label for="prenom">Startup <span class="requis">:</span></label>
                <input type="text" name="startup" value="" size="20" maxlength="60" />
                <br />
                
                <button class="bouton">Valider</button>
	</form>
	
	<h3>confirmation</h3>
		
	
	
		<p><%
			String parametre1 = request.getParameter("nom");
			out.println(parametre1);
			
			String parametre2 = request.getParameter("prenom");
			out.println(parametre2);
		%></p>
		
		<p><%
			String parametre3 = request.getParameter("age");
			out.println(parametre3);
		%></p>
			
		<p><%
			String parametre4 = request.getParameter("date");
			out.println(parametre4);
		%></p>
			
		<p><%
			String parametre5 = request.getParameter("metier");
			out.println(parametre5);
		%></p>
			
		<p><%	
			String parametre6 = request.getParameter("startup");
			out.println(parametre6);
		%></p>
	
	
</body>
</html>























