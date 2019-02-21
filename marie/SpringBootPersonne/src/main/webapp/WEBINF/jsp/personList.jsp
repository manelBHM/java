<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List de personnes</title>
</head>
	<body>
		<h1>List de personnes</h1>
		<br>
		
			<div>
				<table border="1">
					<tr>
						<th>Firt name</th>
						<th>Last name</th>
					</tr>
					<c:forEach  items="${personne}" var ="personne">
					<tr>
						<td>${personne.firtName}</td>
						<td>${personne.lastName}</td>
					</tr>
					</c:forEach>
				</table>
			</div>
	</body>
</html>