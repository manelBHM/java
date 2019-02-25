<%@page import="simplon.co.Cartoon"%>
<html>
<body>
	<h2>Hello World!</h2>

	<p>
		<%=request.getParameter("param1")%>
		<%=request.getParameter("param2")%>
	<p>
	<p>


		<%
			String att = (String)request.getAttribute("nomToon");
		
		    
		out.println(att);
		
		
		
		%>
	
	<p>
</body>
</html>
