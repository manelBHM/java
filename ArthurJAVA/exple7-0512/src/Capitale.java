
public class Capitale extends Ville {
	
	String pays;

	public Capitale(String nom, String pays) {
		super(nom);
	this.pays=pays;}
	
	
	
		
    public Capitale(String nom, String pays, int nbreHabitant) {
    	super(nom, nbreHabitant);
    	this.pays=pays;
    }
		
		
		
    public String afficher() {
    	
    	String var;
		  
		  
		  if (nbreHabitant>0) {
			  var="= " + nbreHabitant;
		  }
		  else var="inconnu";
		  
		  String chaine = "ville " + nom + "nombre d'habitants " + var + ", Capitale de " + pays;

		  
		  return chaine;
		  
	
	}
        public String afficherbis() {
		
		String afficher = super.afficher()	;
		afficher = afficher + ", Capitale de " + pays;
		return afficher;
		
		  
	  }
	
	
	
}
