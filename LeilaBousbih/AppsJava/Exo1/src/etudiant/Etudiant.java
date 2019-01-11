package etudiant;
public class Etudiant {
	private String nom;
	public Etudiant (String nom) {
	this.nom=nom;	
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void travailler() {
		System.out.println(this.nom + " se met au travail");
	}
	
	public void seReposer() {
		System.out.println(this.nom + " se repose");
	}
	

	

}
