<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
		<p align=center>
		<b>DARTY belleville <br> 25 Boulevard de Belleville, 75011
			Paris <br> <br></b>

	</p>
	<p>

		<%
			out.println(request.getAttribute("show") + "<br>");
		%>




	</p>
</body>
</html>