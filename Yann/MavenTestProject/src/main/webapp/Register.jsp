<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>

<style>
body {
	font-family: tahoma;
	text-align: center;
	padding-top: 50px;
}

main h2 {
    background: #006080;
    color: white;
    height: 120px;
    width: 50%;
    line-height: 120px;
    margin-bottom: 20px;
    border-radius: 10px
}


form {
	height: auto;
	width: 50%;
	background: #40E0D0;
	text-align: center;
	padding: 30px;
	color: white;
	margin: 0 auto;
}

label {
	font-size: 22px;
	font-weight: bold;
	color: black;
}

div {
	color: white;
	height: 50px;
	width: 354px;
	line-height: 50px;
	margin: 5px auto;
	border: 2px solid black;
	font-size: 20px;
}

.btn{
	height: 40px;
	margin-top: 10px;
	width: 180px;
	font-size: 14px;
	background: #008080;
	color: white;
	transition: .5s;
	border: 2px solid black;
}

.btn:hover {
	background: black;
}
</style>
</head>
<body>

	<main>
<h2>
 Mon Formulaire généré depuis une JSP.
</h2>
	<section>

		<form method="post" action="Testmaven">
			<div>

				<label for="nom">Nom : </label> <input type="text" name="nom"
					id="nom" />
			</div>




			<div>
				<label for="prenom">Prénom : </label> <input type="text"
					name="prenom" id="prenom" />
			</div>



			<div>
				<label for="age">Age : </label> <input type="number" name="age"
					id="age" />
			</div>

			<input type="submit" value="valider" class="btn">

		</form>

	</section>

	</main>
</body>
</html>