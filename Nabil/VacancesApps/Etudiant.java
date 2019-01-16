package Application_Vacances;

public class Etudiant {
	
	
private String nom = "toto";
	
	public Etudiant(String nom){
		
		this.nom = nom;
		
	}
	
	
	void travailler() {
		
		System.out.println(nom + " se met au travail!");
		}
	
	void seReposer() {
		
		System.out.println(nom + " se repose!");
		}

}
