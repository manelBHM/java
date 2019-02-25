<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*"%>
    <%@ page import="test.mybdd.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h1>Products List</h1>


		<%
			List<Apprenant> listApprenant = (ArrayList) request.getAttribute("list");

			for (Apprenant p : listApprenant) {
	                 out.println("List apprenant " + p);
			}
		%>
</body>
</html>