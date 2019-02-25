<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

*{
    margin: 0;
    padding: 0;
}


body {
    bakground: #66d9ff;
    height: 100%;
    width: 100%;
    font-family: tahoma;
}


main {
    height: auto;
    width: 700px;
    background: #ccf2ff;
    margin: 50px auto;
    padding-bottom:20px;
    text-align: center;
    border-radius: 10px;
}


main h2 {
    background: #006080;
    color: white;
    height: 120px;
    line-height: 120px;
    margin-bottom: 20px;
    border-radius: 10px
}

main article p {
    height: 100px;
    width: 80%;
    margin: 5px auto;
    padding: 0px 8px 0px 8px;
    color: white;
    background: #00394d;
    border-left: 18px solid #6600ff;
    line-height: 100px;
    font-size: 20px;
    text-align: center; 
    border-radius: 10px
}


main article p:hover{
background: #6600ff;
transition: .8s ease-in;
}


</style>
</head>
<body>

<main>

<h2>Ceci est une page généré depuis une JSP.</h2>
<section>

<article>
 
 <p>
<% 

String att = (String)request.getAttribute("nom");
	out.println(att);
	%>
</p>

</article>



<article>
 
 <p>
<% 

String prenom = (String)request.getAttribute("prenom");

out.println(prenom);
	%>
</p>

</article>




<article>
 
 <p>
<% 

String age = (String)request.getAttribute("age");

out.println(age);
	%>
</p>

</article>

</section>

</main>
</body>
</html>