<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MAGASIN</title>
</head>
<body>

	<p><%=request.getParameter("fullname")%>
		<%=request.getParameter("adress")%>
	<p />
	
	<p><% String att = (String)request.getAttribute("query");
	  out.println(att);%>
		
	<p />



</body>
</html>