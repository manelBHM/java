<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

body{
background-color: silver;

}
#head{
text-align:  center;
box-shadow: 3px 2px 2px 2px black;
color: black;
width:30%;
margin: 70px 0 20px 500px;
}

</style>
</head>
<body>
<div id="head">
<h2>votre factuer et<hr></h2>



<p><%

String parametre1 = (String)request.getAttribute("name");
out.println("<b>full name<b> : "+parametre1+ "<hr>");

%></p> 

<p><% 
String parametre2 = (String)request.getAttribute("adress");
out.println("adress :"+parametre2+ "<hr>");
%></p>


<p><% 
String parametre4 = (String)request.getAttribute("Liveresion");
out.println("mode de liverison :"+parametre4+ "<hr>");
%></p>

<h2>the produtc and the price:</h2>
   
 
 <%
			out.println(request.getAttribute("resum") + "<hr>");

		%>
 
 </div>


</body>
</html>