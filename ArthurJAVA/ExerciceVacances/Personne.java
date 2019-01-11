
public class Personne {
	
	private String nom = "";
	private Personne ami;
	
	public Personne(String nom) {
		this.nom = nom;
	}
	
    public Personne(String nom, Personne ami) {
    	this.nom = nom;
    	this.ami = ami;
    }
    
    Personne getAmi() {
    	return ami;
    }
    
    void setAmi(Personne newAmi) {
    	ami=newAmi;
    }
    
    public String toString() {
    	if(ami == null) {
    		return nom + " n'a pas d'ami";
    	}
    	
    	else {
    		return nom + " a comme ami " + ami.nom;
    	}
    	
    	
    	
    }
}
