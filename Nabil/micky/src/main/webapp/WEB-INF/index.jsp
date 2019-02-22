<html>
<body>

<p> Parametre Transmis : OK! <%= request.getParameter("nom")
	%>
	
<br>

	<%
	String prs = (String)request.getAttribute("test2");
	out.println(prs);
	%>

</body>



</html>
