
public class Personne {

	
		private String nom;
		private Personne ami;
		
		public Personne getAmi() {
			return ami;
		}

		public void setAmi(Personne ami) {
			this.ami = ami;
		}

		public Personne (String nom) {
	    this.nom= nom;}
	    
	    public Personne (String nom, Personne ami) {
	    this.nom = nom;
	    this.ami = ami;
	    }
	    
	    
	    public String toString() {
	    	String message;
	    	if ( ami == null) { return message = this.nom + " n'a pas d'amis ";}
	    	else 
	    	return message = nom + " a pour ami : " + ami.nom;
	    }
	    
	  
	  
	}
