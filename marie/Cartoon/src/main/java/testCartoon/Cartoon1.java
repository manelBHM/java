package testCartoon;

public class Cartoon1 {

	String nom;
	String prenom;
	
	public Cartoon1(String nom, String prenom) {
		// TODO Auto-generated constructor stub
		this.nom=nom;
		this.prenom=prenom;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String name) {
		this.nom = name;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "du bean :" + nom + prenom ;
	}

	
}
