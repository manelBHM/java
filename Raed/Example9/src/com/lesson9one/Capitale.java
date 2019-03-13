package com.lesson9one;

public class Capitale extends Ville{
	
	String pays ;
    int nbreH = -1;
    
    
 
    
    public Capitale (String nomVille , int nbreH , String pays)  throws NomVilleException  , NombreHabitantException
    {
    	super(nomVille,nbreH);
        
        this.nomVille= nomVille;
        this.nbreH = nbreH;
        this.pays = pays;
    }

    
    /// methode prsenteTOI : redefinition override
    
    public String presenteToi() {
        
        String message ;
        String habitants;
        
        message =  super.presenteToi();
        message = message + ", la capitale de "+pays;
        return message ;
        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	
	protected String pays;
		
	public Capitale ()
		{
		
		}	
		

	public Capitale(String ville, int nbreD, String pays) {
		super (ville , nbreD);
		// this.ville= ville;
		// this.nbreD= nbreD;
		this.pays = pays;
		
	}

	


	public Capitale(String ville, String pays) {
		super ();
		this.ville= ville;
		this.pays = pays;
	}




	public String  presentToi() {
		String h ;
		String m;
		if(nbreD >0) {
			h = ""+nbreD;
			m = "ville "+this.ville+"nombre d'habitants "+h+" est la capitale de "+ pays;
		}else {
			h = "incoun";
			m = "ville "+this.ville+"nombre d'habitants "+h+" est la capitale de "+ pays;
			
		}
		
		return m;
		 	*/
		
	} 
}
