package pendu;

import java.util.Scanner;

public class Facile {
	
	String comparerMot (char lettre , String motDevine) {

Scanner clavier = new Scanner (System.in);

	
	// mot a deviner existe 
	
	// saisir ma lettre pour tenter 
	
	char lettre ;  // lettre saisi par l'utilisateur en console 
	lettre = clavier.nextLine().charAt(0);
	int nbreIteration = motDeviner.legnth;
	String motConst ;  // mot a construire lettre par lettre 
	 // je aussi le nbre d'iteration = taille du mot a deviner 
	
	while ( nbreIteration > 0){   
		boolean seTrouve = true ;
		
		// parcourir mon mot a deviner carac par carac
		for ( int i =0 ; i < motDevine.length ; i++)
		{
			if ( motDevine.charAt(i) == lettre)
			{
				seTrouve = true ;
				motConst.charAt[i] = lettre;
				nbreIteration = nbreIteration; 
				
			}
			else {
				
				nbreIteration --;
				seTrouve = false ;
			}
			
		}
		
		
	}
    return motConst ;
	}
	   
}  
	  
	  
	 
	  
  
	
	
 
	
