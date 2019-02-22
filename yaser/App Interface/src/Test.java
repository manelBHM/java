import java.util.Date;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Personne p1 = new Personne("Ahmed", "Issa", new Date("11/12/1990"), 3000, new Profil("Directeur Général", "DG"));

		p1.afiche();
		p1.calculeSaleir();

		

		@SuppressWarnings("deprecation")
		Personne p2 = new Personne("Fadeil", "shareif", new Date("04/10/1982"), 2500, new Profil("Employé", "EM"));

		p2.afiche();

		p2.calculeSaleir();

		

	}

}
