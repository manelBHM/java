<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.HashMap" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>
 <%
 String champ = (String) request.getAttribute("champ");
 out.print(champ);
 
 %>
 
<%--  <% --%>
//  HashMap//<> list = new HashMap<>();
//  String[] idChamp = champ.split("&");
 
//  for(String cham :  idChamp){
// 	 out.print(cham);
// 	 String[] run = cham.split("=");
// 	 list.put(run[0], run[1]);
//  }
 
 
	 
 %>
 </p>
</body>
</html>