
public class Personne {
	
	
	   private String nom;
	   private Personne ami;
	
	  public Personne(String nom) {
		  this.nom = nom;
	  }

	  public Personne(String nom, Personne ami) {
		  this.nom = nom;
		  this.ami = ami;
	  }
	  
	  public Personne getAmi() {
		  return ami;
	  }
	  
	  public void setAmi(Personne ami) {
		  this.ami = ami;
	  }
	  
	  
	  public String toString() {
		  
		  if (ami==null) {
			  return nom +" n'a pas d'ami";
			  
		  }
		  
		  else {
			  return nom + " a pour ami " + ami.nom; }
		  
		  
				  
		  
		  
	  }
	  
	  
	  
	  
}
