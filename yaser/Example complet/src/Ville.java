
public class Ville {

	
	protected String nomVille;
	protected int nbreH = -1 ;
	
	 
	public Ville() {
		// TODO Auto-generated constructor stub
	}
	
	Ville (String nomVille , int nbreH){
		
		this.nomVille= nomVille;
		this.nbreH = nbreH;
	} 
	
	Ville (String nomVille) {
		
		this.nomVille = nomVille ;
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
		{   habitants = "inconnu" ;
			message = "La ville "+ nomVille +" nombre d'habitants est "+ habitants ;
			
		}
		return message ;
		
		
	}
	
}
