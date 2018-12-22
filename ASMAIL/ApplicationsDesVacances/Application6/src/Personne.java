
public class Personne {
    private String nom;
    private Personne ami;
    
    public Personne() {
    }
    
    public Personne(String nom) {
    	this.nom=nom;
    }
    public Personne(String nom, Personne personne) {
    	this.nom=nom;
    	this.ami=personne;
    }
	public String getNom() {
		return nom;
	}
	public Personne getAmi() {
		return ami;
	}

	public String afficher() {

		if(!nom.equals(ami)) {
			return nom + " n'a pas d'ami";
		}else {
			return nom + " a pour ami " +nom;
		}
		
	}

	
   
}
