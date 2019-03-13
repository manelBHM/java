<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Map" %>
    <%@ page import="java.util.HashMap"%>
        <%@ page import= "maven_projet1.mvn_test1.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
 
 
 <style>
 #out{
    
    background: chartreuse;
    padding: 20px;
    margin-left: 20px;
    margin-top: 50px;
        width: 500px;
    
 }
 #out p{
 	font-size: 28px;
 	background: cornsilk;
 	padding-left:10px;
 	font-family: unset;
 }
 </style>
</head>
<body>



<div id="out">
	<p>fullname : <%= request.getAttribute("name")     %></p>
<p>address : <%= request.getAttribute("address")     %></p>


<p>city : <%= request.getAttribute("city")     %></p>
<p>price : <%= request.getAttribute("price")     %></p>

<p>Products    : <%= request.getParameter("area")     %></p>

<p>Products    : <%= request.getAttribute("var")     %></p>


<%-- <% --%>
// 	if((Map<Product,Integer>)request.getAttribute("lspro")!= null){
		
// 		Map<Product , Integer > pro = (Map<Product,Integer>)request.getAttribute("ls");

// 			for(Map.Entry<Product,Integer> prod :pro.entrySet()){
				
<%-- 	%> --%>
<!-- 		<ol> -->
<%-- 			<li><%prod.getKey().toString() ;%></li> --%>
			
<%-- 			<li><%prod.getKey().getDescription() ;%></li> --%>
<!-- 		</ol> -->

<%-- 	 <%} --%>
		
<%-- 	} %> --%>
	


</div>






 <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
</body>
</html>