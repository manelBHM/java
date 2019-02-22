import java.util.Date;

public class Profile {

	public String libelle;
	public String code;

	public Profile(String libelle, String code) {
		this.libelle = libelle;
		this.code = code;
	}

	public static void main(String[] args) {
		Voiture v1 = new Voiture("BMW", "X6", new Date(), 45000, new Profile(" X6 ", "BM-X6"));
		v1.calculeVoiture();
		v1.presentevoiture();

		Voiture v2 = new Voiture("Audi", "TT", new Date(), 35000, new Profile(" TT ", " Audi-TT "));
		v2.calculeVoiture();
		v2.presentevoiture();
	}
}
