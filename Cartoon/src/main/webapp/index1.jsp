<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p><%
String name = (String)request.getAttribute("nom");
out.println(name);

String parameter = request.getParameter("nom");
out.println(parameter);
%></p>

<p><%
String prenom =(String)request.getAttribute("attribute");
out.println(prenom);
%></p>

</body>
</html>