<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>

<title>person form</title>
</head>

<body>
 
	
<form:form action="processForm" modelAttribute="person">
	
		First name: <form:input path="firstName" />
		
		<br><br>
	
		Last name: <form:input path="lastName" />
		
		<br><br>
	
		<input type="submit" value="Submit" />
	
	</form:form>
 



</body>



</html>