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
		String s1 = (String)request.getAttribute("firstn");
		out.println(s1+"<br>");
		String s2 = (String)request.getAttribute("lastn");
		out.println(s2+"<br>");
		String s3 = (String)request.getAttribute("message");
		out.println(s3+"<br>");
		
		String c1 = (String)request.getAttribute("cart");
		out.println("my best hobby is "+c1+"<br>");
		
		String s4 = request.getParameter("fname");
		out.println(s4+"<br>");
		
		String s5 = request.getParameter("lname");
		out.println(s5+"<br>");
		
		%>
	</p>
 
 

</body>
</html>