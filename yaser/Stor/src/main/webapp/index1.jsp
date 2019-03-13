<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

body{
background-color:  silver; 
}
#heder{
width:100%;
height:300px;
display:flex;
flex-direction: row;
justify-content:space between;
align-items:center;


}


.head{
display:flex;
flex-direction: row;
text-align:  center;
box-shadow: 3px 2px 2px 2px black;
height:60px;
margin: 0 0 0 50px;
color: black;
}
.img1{
background-image:url("61.png");
background-repeat:no-repeat;
background-size:100px;
width: 100px;
height: 200px;

}

.head2{
display:flex;
flex-direction: row;
text-align:  center;
box-shadow: 3px 2px 2px 2px black;
height:70px;
margin: 0 0 0 150px;
color: black;
}
.img2{
background-image:url("62.jpg");
background-repeat:no-repeat;
background-size:100px;
width: 100px;
height: 200px;

}

.head3{
display:flex;
flex-direction: row;
text-align:  center;
box-shadow: 3px 2px 2px 2px black;
height:60px;
margin: 0 0 0 200px;
color: black;
}
.img3{
background-image:url("63.jpg");
background-repeat:no-repeat;
background-size:100px;
width: 100px;
height: 200px;
}

.n{
display:flex;
flex-direction: row;
text-align:  center;
box-shadow: 3px 2px 2px 2px black;
width: 40%;
padding-bottom: 60px;
height: 30px;
color: black;
}


.n1{
box-shadow: 3px 2px 2px 2px black;
width: 40%;
margin: 20px 0 0 700px;
color: black;
}


.n2{
box-shadow: 3px 2px 2px 2px black;
width: 40%;
color: black;

}
h1{
text-align: center;
}





</style>
</head>
<body>
<h1>welcome to our shop online <hr></h1>
<h2>choose your product</h2>
<div id="heder">
<div class="head">
<p><b>1-télévision:</b>550 € <br> hd Samsong  </p>
<div class="img1"></div>
</div>
<div class="head2">
<p><b>2-frigo:</b> 700 € <br>americain côte-à-côte   </p>
<div class="img2"></div>
</div>

<div class="head3">
<p><b>3-four:</b> 400 € <br>php noir   </p>
<div class="img3"></div>
</div>
</div>


<form action = "TestAppStor" method="get">
<div class="n">
		<label for="Name">Name <span class="requis">*</span></label>
                <input type="text" name="nom" value="" size="20" maxlength="60" />
                <br />
                
         <label for="adresse">adresse<span class="requis">*</span></label>
                <input type="text" name="adresse" value="" size="20" maxlength="60" />
                <br /></div>
   <div class="n1">
   <label for="Liveresion" >
 ExpressDelivery : <input type="radio" name="Liveresion"value="ExpressDelivery" > <br>
 Adomicil : <input type="radio" name="Liveresion"value="Adomicil"> <br>
TakeAwayDelivery :   <input type="radio" name="Liveresion"value="TakeAwayDelivery"> <br>
 Information livraison (relay et exress)    <input type="text" name="" value=""> <br>
   <span class ="requis"></span> </label>  </div>        

<br>
<div class="n2">
                <label for="list product">listProduct <span class="requis">*</span></label>
           
                <textarea rows = "5" cols = "50" name ="listProduct" value="listProduct" ></textarea>
                <br />
                
                <button>Envoyer</button></div>
	</form>
	

</body>
</html>