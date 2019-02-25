<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <h3>Using GET Method to Read Form Data</h3>
       <ul>
       <%
  		String att = (String)request.getAttribute("test1");
       out.println(att);
       String att1 = (String)request.getAttribute("test2");
       out.println(att1);
    
       
 
       %>
            </ul>
	

</body>
</html>