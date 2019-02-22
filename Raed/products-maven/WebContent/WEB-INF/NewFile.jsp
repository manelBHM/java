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

 
	

  <%String something =  (String)request.getAttribute("nom");
  out.println(something);
  %>
	
	<input type="text" name="someName" value="<%= something %>" />
	<input type="submit" value="submint">
	
 
</p>
</body>
</html>