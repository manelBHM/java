<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
   
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Person List</h1>
	

		
		<div>
      <table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
		</tr><c:forEach items="${personnes}" var ="person">
        <tr>
		<td>${person.firstname}</td>
		<td>${person.lastname}</td>
		</tr>
        </c:forEach>
	  </table>
    </div>
		
		
		

</body>
</html>