package Application_Vacances;

public class Personne {
	
	
	private String nom;
	private Personne ami;
	
	public Personne(String nom) {
		
		this.nom = nom;
	}
	
	public Personne(Personne ami, String nom) {
		
		this.nom = nom;
		this.ami = ami;
	}
	

	public Personne getami() {
		
		return ami;
	}
	
	public void  setami(Personne ami) {
		
		this.ami = ami;
	}
	
	 public void afficher() {
		 
		 
	    	if (this.ami== null) {
	    		
	    		
	    		System.out.println( this.nom + " n'a pas d'ami" );
	    	}
	    	
	    	else    System.out.println( this.nom + " est l'ami de " + ami.nom  );

	   
		 		 
	 }
}
