package simplon.co;

public class Cartoon {
	
	@Override
	public String toString() {
		return "Cartoon [nom=" + nom + "]";
	}

	String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Cartoon(String nom) {
		super();
		this.nom = nom;
	}

}
