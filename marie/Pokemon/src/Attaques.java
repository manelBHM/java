import java.util.ArrayList;
public class Attaques {

	final String nom;
	@Override
	public String toString() {
		return "Attaque [" + nom + "]";
	}
	public String getNom() {
		return nom;
	}
	public int getDegats() {
		return degats;
	}
	final int degats;
	public Attaques(String nom, int degats) {
		this.nom = nom;
		this.degats = degats;
	}
}
