package corrections;
import java.util.Scanner;
public class Etudiant {
private String nom;
	public Etudiant(String nom) {
		this.nom=nom;
	}
public void travailler() {
	if (nom.equals("toto")) {
		System.out.println(this.nom + " se met au travail !");
	}
}
public void seReposer() {
	if (nom.equals("toto")) {
		System.out.println(this.nom + " se repose !");
	}
}


}
