
public class Ville {

	String nom;
	int nbreHabitant;
	
	  public Ville (String nom, int nbreHabitant) {
	    
	  this.nom = nom;
	  this.nbreHabitant = nbreHabitant;
	  }
	  
	  public Ville (String nom) {
		  this.nom = nom;
	  }
	  
	  
	  protected String afficher() {
		  
		  String var;

		  
		  
		  if (nbreHabitant>0) {
			  var="= " + nbreHabitant;
		  }
		  else var="inconnu";
		  
		  String chaine = "ville " + nom + "nombre d'habitants " + var;

		  
		  return chaine;
		
	  }
	  
}
