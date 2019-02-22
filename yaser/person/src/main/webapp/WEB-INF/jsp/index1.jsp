<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Persone</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
 
</head>
<body>

<h1>Persone List</h1>



    
    <br/><br/>
    <div>
      <table  border="4">
        <tr>
          <th>First Name</th>
          <th>Last Name</th>
        </tr>
      <c:forEach  items="$ {persons}" var ="person">
        <tr>
          <td>${person.nom}</td>
          <td>${person.prenom}</td>
        </tr>
        </c:forEach>
      
      </table>
    </div> 

</body>
</html>