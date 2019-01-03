// import lombok;
 
 
public class Etudiant {
	
	private String nom ;
	
 
	
	public Etudiant ( String nom) {
		
		this.nom=nom;
	}
	
	public void travailler() {
		
		System.out.println(this.nom + " se met au travail !");
	}
	
	public void seReposer() {
		
		System.out.println(this.nom + " est au repos  !");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
 
}
