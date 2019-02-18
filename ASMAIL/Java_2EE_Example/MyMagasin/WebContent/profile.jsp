     	   
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.util.List" %>
<%@page import="javax.servlet.http.*" %>
<%@page import="connection.MyConnection" %>
<%@page import="users.User" %>
<%@page import="dao.UserDao"%>

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
#profileDiv .card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  max-width: 300px;
  margin: auto;
  text-align: center;
  font-family: arial;
  margin-top: 25px;
}

#profileDiv .title {
  color: grey;
  font-size: 18px;
  margin-bottom: -10px;
}

#profileDiv button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
  font-size: 18px;
}

#profileDiv a {
  text-decoration: none;
  font-size: 22px;
  color: black;
}

#profileDiv button:hover, a:hover {
  opacity: 0.7;
}
.containers {
  border: 2px solid #ccc;
  background-color: #c8d6e5;
  border-radius: 5px;
  padding: 16px;
  margin: 16px 0
}

.containers::after {
  content: "";
  clear: both;
  display: table;
}

.containers img {
  float: left;
  margin-right: 20px;
  border-radius: 50%;
}

.containers span {
  font-size: 20px;
  margin-right: 15px;
}

@media (max-width: 500px) {
  .containers {
      text-align: center;
  }
  .containers img {
      margin: auto;
      float: none;
      display: block;
  }
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
	
	
	<div class="container">
	  <div class="row">
	    <div class="col-lg-4" style="background:#FFF">
	            <div id="profileDiv">
        
        <%
        Cookie[] cks = request.getCookies();
       // out.println("Welcome "+cks[0].getValue());
        
         String email = request.getParameter("email");
         User u = UserDao.getByEmail(cks[0].getValue());              
        %>
       
<div class="card">
  <img src="https://cap.img.pmdstatic.net/fit/http.3A.2F.2Fprd2-bone-image.2Es3-website-eu-west-1.2Eamazonaws.2Ecom.2Fcap.2F2017.2F05.2F12.2F4df15032-f081-4922-9fdd-28a798bdd557.2Ejpeg/300x169/background-color/ffffff/quality/70/picture.jpg" alt="John" style="width:100%">
  <h1 style="margin-top: 10px;">Your Profile</h1><hr>
  
   <p class="title">Name: <% out.print(u.getName()); %></p><hr>
    <p class="title">Pass: <% out.print(u.getPass());  %></p><hr>
    <p class="title">Email: <% out.print(u.getEmail());  %></p><hr>
  
  <div style="margin: 24px 0;">
    <a href="#"><i class="fab fa-dribbble"></i></a> 
    <a href="#"><i class="fab fa-twitter"></i></a>  
    <a href="#"><i class="fab fa-linkedin"></i></a>  
    <a href="#"><i class="fab fa-facebook"></i></a> 
  </div>
  <%
  /*
    response.setHeader("Cache-Control", "ncache, no-store, must-revalidate");
    response.setHeader("Progma", "no-cache");
    response.setDateHeader("Expriss", 0);
    */
  %>
  <p><a onclick="confirm('Are you sur want to logout!!')" class="nav-link" href="login.jsp"><button type="submit">Logout</button></a></p>
</div>

        </div>
	    </div>
	<div class="col-lg-8" style="background:#FFF; border-left: 1px solid;">
	 <h2 style="margin-top: 23px; text-decoration: underline;">All Users</h2>
	    
	    <% List<User> list;
			//Product pro = new Product();
			try {
			list = UserDao.getList();
				for(int i = 0; i < list.size(); i++) {
				int index = i;
				//pro = list.get(i);
		           %>
	    

<div class="containers">
  <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT07jMnmPrv25bMPiB5NqnDh2zG0UsctgZ0UDT9z2DDkWj5_aGErA" alt="Avatar" style="width:90px">
  <p><span>Name: </span><% out.print( list.get(i).getName()); %></p>
   <p><span>Email: </span><% out.print( list.get(i).getEmail()); %></p>
</div>


	<%
						
	}
	} catch (Exception e) {
	  e.printStackTrace();
	}
		
	%>
	    </div>
	  </div>
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