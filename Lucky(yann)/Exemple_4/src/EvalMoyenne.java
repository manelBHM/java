import java.util.Scanner;

public class EvalMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         Scanner sc =  new Scanner(System.in);
		
		System.out.println("Renseigner Votre Moyenne");
		
		int note = sc.nextInt();
		
		if(note<10) {System.out.println("Il faut travailler");}
		else if(note <= 12 && note >= 10){System.out.println("Votre Mention est : Passable");}
		else if (note <= 14 && note >= 12){System.out.println("Votre Mention est : Assez Bien");}
		else if (note <= 16 && note >= 14){System.out.println("Votre Mention est : Bien");}
		else if (note <= 20 && note >= 18){System.out.println("Votre Mention est : Très bien");}
		else {System.out.println("Vous n'avez pas saisir une moyenne exacte");}
		
	/*
		switch(note)
		{
		

		  case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:  
			  
			 {System.out.println();}
			
		    break;
		  
		  case 10:
			  
		 { System.out.println();}

			    break;
		

		  case 13: case 14: 
				  
				 { System.out.println("Assez-bien!");}

			   
			    break;
			    
		  case 15: case 16:
				  
				 { System.out.println("Bien!");}
				
				  
				    break;
				    
		  case 17:  case 18: case 19: case 20:
				  
				 {System.out.println("Très Bien!");}
				  
				    break;
			

				  default:

				  System.out.println("Null");
				
				  
				

		}
		*/

	}

}
