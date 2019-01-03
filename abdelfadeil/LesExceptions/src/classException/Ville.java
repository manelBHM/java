package classException;


public class Ville {
	
	String nom;
	int nbHabitant;
	
	public Ville(int nbHabitant, String nom) throws nombreVilleException, nomVilleException {
		
		if (nbHabitant < 0) {
			throw new nombreVilleException();
		}else {
			nom = nom;
			// nbHabitant=nbHabitant;
		}
		
		if (nom.length() < 3) {
          throw new nomVilleException();
		}else {
			nom = nom;
		}
	
	
		
		
	}

}
