
public enum Jour {
		LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE;

	
	
  static void action (String nom) 
	   {
		
	
	  
	  
		try {
		   Jour jour = Jour.valueOf(nom);
		  
		 
		
		   switch(jour)
		   {
		   
		   
		   case SAMEDI :
		   case DIMANCHE:
			   System.out.println("seReposer");
			   break;
		    
			   default:
				   System.out.println("Taffer !!!");
		   }
		   
		}
		catch(Exception error)
		{
			System.out.println("Mauvais jour");
		}
		   
		   
		   

	   }

}
