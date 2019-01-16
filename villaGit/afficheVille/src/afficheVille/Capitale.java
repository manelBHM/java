package afficheVille;
public class Capitale extends Ville {
	String pays ;
	int nbreH = -1;
	 
	
	
	public Capitale() {
		
		// TODO Auto-generated constructor stub
		super();
		
		
		
	}
	
	public Capitale (String nomVille , int nbreH , String pays)
	{ 
		
		this.nomVille= nomVille;
		this.nbreH = nbreH;
		this.pays = pays;
	}
	
	
	// methode presenteTOI : redefinition override 
	public String presenteToi() {
		
		String message ;
		String habitants;
		
		message =  super.presenteToi();
		message = message + ", la capitale de "+pays;
		return message ;
		
	}

}