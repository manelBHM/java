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
			String fullname = (String)request.getAttribute("name");
			out.println(fullname);
			String fulladdress = (String)request.getAttribute("address");
			out.println(fulladdress);
		
		
		%>

</p>

</body>
</html>