package exemple4;

import java.util.Scanner;
import java.math.BigDecimal;
import java.util.*;

public class Evaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner clavier = new Scanner(System.in); //  indique que vous souhaitez 
		                                          // récupérer ce que l'utilisateur saisit au clavier. 
		
		   float note ;
		   System.out.println("Entrez la note de votre élève :");
	       note = clavier.nextFloat(); 
	       
	   
	     int status = 1;
	     
	     
		 if ( status == 1) 
			 {  
	     
	     switch  ( status ) 
	      
	     {
		    case  1 : 
		    	if ( note  < 10 )
		   			System.out.println("non reussi , il faut travailler");
		    	    
		    
		    case 2: 
		    	if ( note  > 10 &&  note  <= 12 )
		            System.out.println(" reussi  , avec mention PASSABLE ");
		
		    case  3 :
		    	if ( note  > 12 && note <= 14 )
  			       System.out.println(" reussi  , avec mention ASSEZ-BIEN");
		    
            case 4:
            	if (  note > 14  &&  note  <= 16 )
                   System.out.println(" reussi  , avec mention BIEN " );
            
            case 5 : 
            	if (   note  >16  &&   note  <= 20) 
                   System.out.println(" reussi  , avec mention TRES BIEN " );
            
            default :
            	
            	break;
			  
	     }
			
	   
		
		
	}  else 
   	 System.out.println(" pas compris la note " );

}}
