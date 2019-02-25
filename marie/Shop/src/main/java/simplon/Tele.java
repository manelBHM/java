package simplon;

public class Tele extends Produit{

	String tailleEcran;
	String technology;
	static String nom = "tele";
	
	public Tele(String marque, String description, double prix, String tailleEcran, String technology) {
		super(nom, description, prix);
		this.tailleEcran = tailleEcran;
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "Televiseur: Description: " + description + ", Technology: " + technology + 
				", Taille de l'ecran: " + tailleEcran + ", prix: " + prix;
	

}

	public String getTailleEcran() {
		return tailleEcran;
	}

	public void setTailleEcran(String tailleEcran) {
		this.tailleEcran = tailleEcran;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		Tele.nom = nom;
	}
}