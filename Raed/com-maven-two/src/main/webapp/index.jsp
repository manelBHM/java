<%@ page pageEncoding="UTF-8" %>
<html>
<body>
<h2>Hello World!</h2>
<p> cest est une page genere depusi une jsp</p>
<p>
	<%
	out.println("affichage Attribut \n");
	String attribute = (String)request.getAttribute("test");
	out.println(attribute.toUpperCase());
	out.println("affichage param \n");
	String parametre = request.getParameter("auteur");
	out.println(parametre);
	%>

</p>
</body>
</html>
