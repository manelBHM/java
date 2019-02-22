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
 	String s = (String)request.getAttribute("nom");
 	out.println(s);
	String s1 = (String)request.getAttribute("address");
 	out.println(s1);
 
 	String n1 = (String)request.getParameter("nom");
 	out.println(n1);
	String n2 = (String)request.getParameter("address");
 	out.println(n2);
 
 
 %>
 </p>

</body>
</html>