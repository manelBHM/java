package co.hamza.Pokemon;

public class Pokemon {

	private String nom;
	private int nbVie;
	int nbManches = 0;
	int resultatLancer ;
	private static int nbPok = 0;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbVie() {
		return nbVie;
	}

	public void setNbVie(int nbVie) {
		this.nbVie = nbVie;
	}

	public Pokemon() {

	}

	public Pokemon(String nom, int nbVie) {
		this.nom = nom;
		this.nbVie = nbVie;

		nbPok++;

	}

	@Override
	public String toString() {

		String description = "Nom : " + this.nom + " \n" + "Nombre de vies : " + this.nbVie;

		return description;
	}

	public void compteur() {
		System.out.println(nbPok + " Pokemon ont été crées");

	}

	public void sablier() throws InterruptedException {
		
		Thread.sleep(1000);
		System.out.print("⚅");
		Thread.sleep(400);
		System.out.print("   ⚄");
		Thread.sleep(400);
		System.out.print("   ⚃");
		Thread.sleep(400);
		System.out.print("   ⚂");
		Thread.sleep(400);
		System.out.print("   ⚁");
		Thread.sleep(400);
		System.out.print("   ⚀");

	}
	
	
	public void banniereDebut(){
		System.out.println(" ************************************ ");
		System.out.println("          Début de la partie          ");
		System.out.println(" ************************************ ");
	}
	
	
	
	public void combat(Pokemon pokemon1, Pokemon pokemon2) throws InterruptedException {
		Des des1 = new Des();
		Des des2 = new Des();
		
		
		
		banniereDebut();
		
		while (pokemon1.nbVie > 0 && pokemon2.nbVie > 0) {
			
			int d1 = des1.lancer() + des2.lancer();
			int d2 = des1.lancer() + des2.lancer();


			char vie = '\u2764';
			
			
			Thread.sleep(1500);
			System.out.println("");
			System.out.println("");
			System.out.println(pokemon1.nom + " lance les dés .. ");

			sablier();
			
			

			Thread.sleep(750);
			System.out.println("");
			System.out.println("Résultat du lancer   " + d1);

			Thread.sleep(1500);
			System.out.println("");
			System.out.println(pokemon2.nom + " lance les dés .. ");

			sablier();
			

			Thread.sleep(750);
			System.out.println("");

			System.out.println("Résultat du lancer   " + d2);

			if (d1 > d2) {
				pokemon2.nbVie--;
				nbManches++;
				Thread.sleep(1500);
				System.out.println("");
				System.out.println(pokemon1.nom + " a gagné cette manche.");
				System.out.println("");
				
				System.out.println("Nombre de vies restantes : ");
				System.out.print(pokemon1.nom + " ");
				for (int i = 1; i <= pokemon1.nbVie; i++) {
					System.out.print(vie);
				}

				System.out.println("");
				System.out.print(pokemon2.nom + " ");
				for (int i = 1; i <= pokemon2.nbVie; i++) {
					System.out.print(vie);
				}
				

			} else if (d1 < d2) {
				pokemon1.nbVie--;
				nbManches++;
				Thread.sleep(1500);
				System.out.println("");
				System.out.println(pokemon2.nom + " a gagné cette manche.");
				System.out.println("");
				
				System.out.println("Nombre de vies restantes : ");
				System.out.print(pokemon1.nom + " ");
				for (int i = 0; i < pokemon1.nbVie; i++) {
					System.out.print(vie);
				}
				

				System.out.println("");
				System.out.print(pokemon2.nom + " ");
				for (int i = 0; i < pokemon2.nbVie; i++) {
					System.out.print(vie);
				}
				System.out.println("");

			} else {
				System.out.println("Match nul !");
				System.out.println("");
				System.out.println("Nombre de vies restantes : ");
				System.out.print(pokemon1.nom + " ");
				for (int i = 0; i < pokemon1.nbVie; i++) {
					System.out.print(vie);
				}

				System.out.println("");
				System.out.print(pokemon2.nom + " ");
				for (int i = 0; i < pokemon2.nbVie; i++) {
					System.out.print(vie);
				}

			}

		}
		if (pokemon1.nbVie == 0) {
			System.out.println("");
			System.out.println("");
			System.out.println(pokemon2.nom + " a gagné la partie en " + nbManches + " manches.");
			System.out.println("");
			System.out.print(pokemon2.nom + " ☺ ");
			System.out.println(pokemon1.nom + " ☹︎ ");

		} else {
			System.out.println("");
			System.out.println("");
			System.out.println(pokemon1.nom + " a gagné la partie en " + nbManches + " manches.");
			System.out.println("");
			System.out.print(pokemon1.nom + " ☺︎ ");
			System.out.println(pokemon2.nom + " ☹︎ ");
			

		}

	}

}
