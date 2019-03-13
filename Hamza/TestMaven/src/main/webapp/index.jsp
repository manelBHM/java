<html>
<body>
	<h1 align=center>MAVEN</h1>
<p> 
	<% String nomA = (String) request.getAttribute("nomAttrib"); 
	
		if(nomA.equals("Hamza")){
			for(int i =1; i<10 ; i++) {
				out.println("Salut " + nomA + " " + i + " fois <br>" );
			}
		}else if(nomA.equals("Tony")){
			out.println("Salut Je m'appelle " + nomA + " et je suis un gilet jaune");
		}else{
			out.println("Je ne sais pas qui vous êtes, veuillez dégager les lieux rapidement");
		}
	%> 
</p>

<p>
	<% String nomP = request.getParameter("nomParam"); 
		out.println("Je suis le paramètre : " + nomP); 
	%>
</p>


	
</body>
</html>
