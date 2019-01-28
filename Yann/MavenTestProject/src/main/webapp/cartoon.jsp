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
    height: 400px;
    width: 700px;
    background: #ccf2ff;
    margin: 50px auto;
    text-align: center;
    border-radius: 10px
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
<h2>
 Ceci est une page générée depuis une JSP.
</h2>
<section id="mySection">
<article class="one">
 <p>
<% 
String displayName = (String)request.getAttribute("cartoon");
	out.println(displayName);
	%>
</p>
</article>


<br>

<article class="two">
 <p>
<% 
 String displayCartoon = (String)request.getAttribute("bean");
 out.println(displayCartoon);
	%>
</p>
</article>

</section>
</main>

</body>
</html>