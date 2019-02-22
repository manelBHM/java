<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
   <title>Person List</title>
</head>
<body>

    <h1>Person List</h1>
    
    <br/><br/>
    <div>
      <table border="1">
        <tr>
          <th>First Name</th>
          <th>Last Name</th>
        </tr>
        <c:forEach  items="${persons}" var ="element">
        <tr>
          <td>${element.firstName}</td>
          <td>${element.lastName}</td>
        </tr>
        </c:forEach>
      </table>
    </div>
</body>
</html>