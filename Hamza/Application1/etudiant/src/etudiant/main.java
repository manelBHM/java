package etudiant;

public class main {

	public static void main(String[] args) {
		Etudiant bosseur = new Etudiant("Toto");
		Etudiant faineant = new Etudiant("Titi");
		
		bosseur.travailler();
		faineant.seReposer();
	}

}
