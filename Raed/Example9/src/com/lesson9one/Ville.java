package com.lesson9one;

public class Ville {

	protected String nomVille;
	protected int nbreH = -1;
	

 
	public Ville (String nomVille , int nbreH)  throws NombreHabitantException , NomVilleException {
	        
	        
	        if ( nbreH < 0 )
	            throw new NombreHabitantException ();
	        if ( nomVille.length() < 3 )
	            throw new NomVilleException (" le nom de la ville est incorrecte .. inferieur a 3 lettres !! "+ nomVille );
	        
	        
	        else {
	          int nbreInstance  = 0 ;
	          nbreInstance  ++ ;
	          this.nomVille= nomVille;
	          this.nbreH = nbreH; 
	          }
	    
	
	}
	public String presenteToi() {
	        
	        String message ;
	        String habitants ;
	        
	        if (nbreH >0)
	        {
	            habitants = ""+ nbreH ;
	            message = "La ville "+ nomVille +" nombre d'habitants est "+ habitants;
	        }
	        
	        else
	        {
	            habitants = "inconnu" ;
	            message = "La ville "+ nomVille +" nombre d'habitants est "+ habitants ;
	            
	        }
	        return message ;
	}
	        
	
	
	
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	
	

/*	protected String ville ;
	protected int nbreD ;
	protected int var ;
 
	
	public Ville()
	{
	
	}
	
	public Ville(String ville,int var) {
		super();
 
		this.var = var;
		this.ville = ville;
	}
	
	
	
	
	public Ville(String ville) {
		super();
		this.ville = ville;
	}*/

		
/*	

	public String  presentToi() {
		String h ;
		String m;
		if(var >0) {
			h = ""+var;
			m = "ville "+this.ville+"nombre d'habitants "+h;
		}else {
			h = "incoun";
			m = "ville "+this.ville+"nombre d'habitants "+h;
			
		}
		
		return m;
	}
	
	*/
	
	
	
	
	
 
	
	
	
	
	
	
	
	
	
	

}
