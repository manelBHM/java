<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>Ceci est une page généré par une JSP,</p>
<p> nom du Personnage : <%
String param1 = request.getParameter("nom");
out.print(param1);
%></p>

<p>

Voici le perso 2 venu par attribu du bean : <%

String perso2 = (String)request.getAttribute("nom2");

out.print(perso2);

%>
<%= request.getAttribute("adjectif1") %>
</p>





<!-- alternative si on crée pas de String, (si plusieur fois il faut appeler mieux

Récupérer du bean : 



com.simplon.NomCartoon.Cartoon notreBean = (co.simplon.NomCartoon.Cartoon) request.getAttribut("nom2");
out.println(notreBean.getPrenom() );
out.println(notreBean.getNom());



 -->



</body>
</html>