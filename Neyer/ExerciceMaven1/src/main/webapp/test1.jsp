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
		<%
			String paraNom = request.getParameter("nom");
			out.print(paraNom);
			String paraPre = request.getParameter("prenom");
			out.print(paraPre);
		%>
	</p>

	

</body>
</html>