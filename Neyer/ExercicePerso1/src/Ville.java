
public class Ville {
	
	protected int nbHabitant;
	protected String nomPays;
	
	
	public Ville(String nomP, int nbH){
		
		
		this.nomPays=nomP;
		this.nbHabitant=nbH;
	}
	
	public Ville(int nbH) {
		
		this.nbHabitant=nbH;
	}
	
	protected String affiche() {
		
		String afficher;
		
		afficher = "Le pays est "+nomPays+", et a "+nbHabitant+" comme nombre d'habitants ";
		
		return afficher;	
	}
}
