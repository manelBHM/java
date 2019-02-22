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

String parametre1 = (String)request.getAttribute("name");
out.println(parametre1);

%></p> 

<p><% 
String parametre2 = (String)request.getAttribute("adress");
out.println(parametre2);
%></p>



<p><% 
String parametre3 = (String)request.getAttribute("pro");
out.println(parametre3);


%></p>


<p><% 
String parametre5 = (String)request.getAttribute("message");
out.println(parametre5);


%></p>



</body>
</html>

