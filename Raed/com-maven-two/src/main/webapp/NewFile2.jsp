<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>
		<%=request.getParameter("prenom") %>
		<%=request.getParameter("nom") %>
	</p>
	<p>
		<%=request.getAttribute("premon") %>
		<%=request.getAttribute("nom") %>
	</p>
</body>
</html>