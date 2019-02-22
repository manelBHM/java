package app1;

public class Etudiant {

	private String nom;
	
	public Etudiant(String nom) {
		this.nom = nom;
	}
	
	public void travailler() {
		System.out.println(this.nom + " se met au travaille");
	}
	
	public void seReposer() {
		System.out.println(this.nom + " se repose");
	}
}
