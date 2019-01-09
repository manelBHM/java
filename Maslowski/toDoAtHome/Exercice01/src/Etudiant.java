
public class Etudiant {
	
	private static String nom;

	public Etudiant(String nom) {
		this.nom = nom;
	}
	
	public void travailler(){
		System.out.println(this.nom + " se met au travail !");
	}
	
	public void seReposer() {
		System.out.println(this.nom + " se repose.");
	}
	
	
	
	public static void main(String[] args) {
		
		Etudiant Kevin = new Etudiant("Kevin");
		Kevin.seReposer();
		
		Etudiant Toto = new Etudiant("Toto");
		Toto.travailler();
		

	}
}