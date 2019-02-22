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
	
		Country:
		<form:select path="country">
			<form:options items="${person.countryOptions}"/>
	 
		
		</form:select>
			<br><br>
		
		Your Favarite langauge: <br>
		PYTHON: <form:radiobutton path="favariteLanguage" value="Python"/>
		JAVA: <form:radiobutton path="favariteLanguage" value="Java"/>
		C#: <form:radiobutton path="favariteLanguage" value="C#"/>
	 <br><br>
	 
	 	Your Operatying System:<br>
	 	MAC:<form:checkbox path="operatyingSystem" value="MAC"/>
	 	MS WINDOWS:<form:checkbox path="operatyingSystem" value="Windows"/>
	 	LINUX:<form:checkbox path="operatyingSystem" value="Linux"/>
	 	<br>
		<input type="submit" value="Submit" />
	
	</form:form>
 



</body>



</html>