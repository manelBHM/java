<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<P>
		<%
// 			String lenom = request.getParameter("nom");
// 			out.print(lenom.toUpperCase());
// 			String ladresse = request.getParameter("adresse");
// 			out.print(ladresse);

			String allInf = (String) request.getAttribute("info");
			out.print(allInf);
		%>
	</P>

</body>
</html>