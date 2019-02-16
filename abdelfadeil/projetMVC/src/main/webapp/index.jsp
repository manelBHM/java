<%@page import="metier.Carton" %>
<% 
Carton model = (Carton)request.getAttribute("model");
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
<title>Applciation Servlet model vue</title>
</head>
<body>
<header class="header">
<div class="mynav">
<nav class="nav">
<ul>
<li><a href="index.jsp">Acceuil</a></li>

<li><a href="index2.jsp">Conexction</a></li>

<li><a href="index.jsp">Créer un compt</a></li>

<li><a href="">Contact nous</a></li>
</ul>

</nav>
</div>
</header>

<h2 class="titre">Hello dans la page home (index.jsp)</h2>

<div class="container">
<form action="myServlet" method="post">
<h4>Create account</h4>
<div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Last name</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="lName" placeholder="Last name">
    </div>
  </div>
<div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">First name</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="fName" id="inputEmail3" placeholder="First name">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
    <div class="col-sm-10">
      <input type="email" class="form-control" name="email" id="inputEmail3" placeholder="Email">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" name="password" id="inputEmail3" placeholder="Password">
    </div>
  </div>
  
  
  <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary">Sign up</button>
    </div>
  </div>
</form>

</div>

</body>
</html>