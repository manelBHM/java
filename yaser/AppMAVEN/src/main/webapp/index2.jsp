<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action = "TestHello" method="post">
		<label for="nom">lastName <span class="requis">*</span></label>
                <input type="text" name="nom" value="" size="20" maxlength="60" />
                <br />
                
         <label for="prenom">name <span class="requis">*</span></label>
                <input type="text" name="prenom" value="" size="20" maxlength="60" />
                <br />
                <button>Valider</button>
	</form>

</body>
</html>