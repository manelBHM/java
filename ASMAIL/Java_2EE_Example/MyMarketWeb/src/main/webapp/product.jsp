<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Product" %>
<%@ page import="dao.ProductDao" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Market Web</title>
<link href='https://fonts.googleapis.com/css?family=Actor'
	rel='stylesheet'>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<link href='https://fonts.googleapis.com/css?family=Abhaya Libre'
	rel='stylesheet'>
<link href='https://fonts.googleapis.com/css?family=Abril Fatface'
	rel='stylesheet'>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"
	integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/css/master.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

<style type="text/css">
body {
	background: #f4fcff;
	font-family: 'Abhaya Libre';
	font-size: 22px;
	color: #000;
}

.navbar .navbar-brand {
	color: #f4fcff !important;
	font-size: 30px;
	font-family: 'Abril Fatface';
	font-size: 22px;
	text-shadow: 1px 1px #e84118;
}

.navbar button {
	background: #f4fcff;
	color: #007bff;
	font-weight: bold;
}

.navbar button:hover {
	color: #FFF !important;
	background-color: #007bff !important;
	border: 1px solid #FFF !important;
}

.navbar ul .nav-link {
	color: #FFF !important;
}

.navbar ul .nav-link:hover {
	text-decoration: underline;
	color: #2ae4f9 !important;
}
</style>

</head>
<body>

	<nav class="navbar navbar-light bg-primary">
		<a class="navbar-brand"><i class="fab fa-markdown"
			style="color: #e84118; background: #f4fcff; margin-left: 50px; padding: 5px; margin-right: 10px;"></i>
			Online Market </a>

		<ul class="nav justify-content-center">
			<li class="nav-item"><a class="nav-link active" href="index.jsp">Home</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
		</ul>

		<form class="form-inline" style="font-size: 16px;">
			<input class="form-control mr-sm-4" type="search"
				placeholder="Search" aria-label="Search">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		</form>
	</nav>


<div>


</div>


	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"
		integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"
		integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
		crossorigin="anonymous"></script>
</body>
</html>