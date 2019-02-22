<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List de personnes</title>
</head>
<body>
	<h1>Liste de Personnes</h1>
    
    <br/><br/>
    <div>
      <table border="1">
        <tr>
          <th>Prénom</th>
          <th>Nom</th>
        </tr>
        <c:forEach  items="${personnes}" var ="personne">
        <tr>
          <td>${personne.firstName}</td>
          <td>${personne.lastName}</td>
        </tr>
        </c:forEach>
      </table>
    </div>
</body>
</html>