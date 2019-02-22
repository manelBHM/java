
public class Capital extends Ville {
	String pays ; // g rien mis alors protected  alors classe capital peut l'utiliser 
	
	 
	
	
	public Capital() {  // tous peut le voir 
		
		// TODO Auto-generated constructor stub
		super();
		
		
		
	}
	
	public Capital (String nomVille , int nbreH , String pays)
	{
		this.nomVille= nomVille;
		this.nbreH = nbreH;
		this.pays = pays;
	}
	
	public String presenteToi() {
		
		String message ;
		String habitants;
		
		if (nbreH >0)
		{
			habitants = ""+ nbreH ;
			message = "La ville "+ nomVille +" nombre d'habitants est "+ habitants;
		}
		
		else 
		{   habitants = "inconnu" ;
			message = "La ville "+ nomVille +" nombre d'habitants est "+ habitants ;
			
		}
		return message ;
		
	}

}
