<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="RecuperNom" method="post">
		First name: <input type="text" name="nom" value="Mickey"><br>
		Last name: <input type="text" name="prenom" value="Mouse"><br>
		<input type="submit" value="Submit">
	</form>

<!-- 	<p> -->
<%-- 		<% --%>
// 			String paraNom = request.getParameter("nom");
// 			out.print(paraNom);
// 			String paraPre = request.getParameter("prenom");
// 			out.print(paraPre);
<%-- 		%> --%>
<!-- 	</p> -->

<!-- 	<p> -->
<%-- 		<% --%>
// 			String attriNom = (String) request.getAttribute("nom1");
// 			out.print(attriNom);
// 			String attriPre = (String) request.getAttribute("prenom1");
// 			out.print(attriPre);
<%-- 		%> --%>
<!-- 	</p> -->


</body>
</html>