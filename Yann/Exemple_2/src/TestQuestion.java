import java.util.Scanner;
import java.util.*;


public class TestQuestion {

	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
	
		
		
		System.out.println("Qui est le President de la France ?");
		
		
		int compteur=0;
		String answer;
		
	    do {	
	    
	     answer= sc.nextLine();
	  
	     switch (answer)
	     {
	     case "macron":
	    	 System.out.println("Good vous remporter 1 point ce qui vous fait un total de " +  (compteur+=1) + " points"+'\n');
	    	 System.out.println("Es un Banquier o/n ? ");
	    	 break;
	    	 	    	 
	     case "MACRON":
	     System.out.println("Good vous remporter 1 point ce qui vous fait un total de " +  (compteur+=1) + " points");
	     System.out.println("Es un Banquier o/n ? ");    
	     break;
	         
	     case "emmanuel macron":
	    	 System.out.println("Good vous remporter 1 point ce qui vous fait un total de " +  (compteur+=1) + " points");
	    	 System.out.println("Es un Banquier o/n ? ");
	    	 break;
	          
	     case "EMMANUEL MACRON":
	    	 System.out.println("Good vous remporter 1 point ce qui vous fait un total de " +  (compteur+=1) + " points");
	    	 System.out.println("Es un Banquier o/n ? ");
	    	 break;
	         
	     case "o":
		     System.out.println("Good vous remporter 1 point ce qui vous fait un total de " +  (compteur+=1) + " points"+'\n');
		     System.out.println("Quel est sont pays d'origine ?");

		    	 break;
		    	 
		  case "france":
			  System.out.println("Good vous remporter 1 point ce qui vous fait un total de " +  (compteur+=1) + " points"+'\n');

		    	 break;
		    	 
		    	 
		   case "FRANCE":
				System.out.println("Good vous remporter 1 point ce qui vous fait un total de " +  (compteur+=1) + " points"+'\n');
				
		    	 break;
		    	 
		    	 
		   case "exit": 
			   System.out.println("Exit System");
			   break;
		    
		  	   
	          default:
	        	 
	        	System.out.println("Mauvaise réponse vous perdez 1 point ce qui vous fait un total de " + (compteur+=-1) + " points");
	     
	        	  break;
    	
	    }
	    
	}while(answer!="exit");
}
}








