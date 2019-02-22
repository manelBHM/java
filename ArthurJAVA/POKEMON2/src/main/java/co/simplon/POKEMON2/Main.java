package co.simplon.POKEMON2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Attaques lanceflamme = new Attaques("Lance flamme", 65);
		Attaques flameche = new Attaques("Flameche", 20);
		Attaques pistolet = new Attaques("Pistolet a eau", 20);
		Attaques hydro = new Attaques("Hydrocanon", 65);
        Attaques attaqueMentale = new Attaques("Attaque mentale", 40);
        Attaques psycho = new Attaques("Psycho", 60);
        Attaques ultraLaser = new Attaques("Ultra-Laser", 80);
        Attaques griffe = new Attaques("Griffe", 35);
		
		Pokemon Dracaufeu = new Pokemon("Dracaufeu", 200, flameche, lanceflamme);
		Pokemon Tortank = new Pokemon("Tortank", 190, pistolet, hydro);
		Pokemon mewtwo = new Pokemon("Mewtwo", 195, attaqueMentale, psycho);
		Pokemon Dracolosse = new Pokemon("Dracolosse", 190, ultraLaser, griffe);

		ArrayList<Pokemon> liste = new ArrayList<Pokemon>();

		liste.add(Dracaufeu);
		liste.add(Tortank);
		liste.add(mewtwo);
		liste.add(Dracolosse);

		Run run = new Run();
		run.run(liste);

	}

}
