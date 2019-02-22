<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<p><%String name = (String)request.getAttribute("nom");
out.println(name);

String lastName = (String)request.getAttribute("prenom");
out.println(lastName);%></p>

<p><% 
String parametre1 = request.getParameter("nom");
out.println(parametre1);

String parametre2 = request.getParameter("prenom");
out.println(parametre2);
%>
</p>
</body>
</html>