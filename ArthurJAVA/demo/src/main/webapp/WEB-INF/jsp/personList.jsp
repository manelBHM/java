<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>

<html>

<title>


</title>
<head>

</head>


<body>

 
    <h1>Person List</h1>
    
    <br/><br/>
    <div>
      <table>
        <tr>
          <th>First Name</th>
          <th>Last Name</th>
        </tr>
        <c:forEach  items="${list}" var ="element">
        <tr>
          <td>${element.name}</td>
          <td>${element.lastname}</td>
        </tr>
        </c:forEach>
      </table>
    </div>
 


</body>

</html>