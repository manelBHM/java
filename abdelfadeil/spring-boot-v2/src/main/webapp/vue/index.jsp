<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>Mon Application !</title>
</head>
<body>
<style>
table, th, td {
  border: 1px solid black;
}
table, h2 {
margin: auto;
text-align: center;
}

</style>

<h2>Person List</h2>
 <table>
  <tr>
    <th>First Name</th>
    <th>Last Name </th>
  </tr>
  <tr>
   <td>${p1.firstName}</td>
      <td>${p1.lastName}</td>
  </tr>
   <tr>
   <td>${p2.firstName}</td>
      <td >${p2.lastName}</td>
  </tr>
 
 </table>

</body>
</html>