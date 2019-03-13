import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
public class Run {
	public void run(ArrayList<Pokemon> liste) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		ArrayList<Pokemon> maListe = new ArrayList<Pokemon>();

		boolean rester = true;
		System.out.println("Pour une expérience optimale, mettre la console en plein écran (double click sur l'onglet console)");
		for(int i =3;i>0;i--) {
			Thread.sleep(1000);
			System.out.println(i);
		}
		Thread.sleep(1000);
		System.out.println("                                  ,'\\\n"
				+ "    _.----.        ____         ,'  _\\   ___    ___     ____\n"
				+ "_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.\n"
				+ "\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |\n"
				+ " \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |\n"
				+ "   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |\n"
				+ "    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |\n"
				+ "     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |\n"
				+ "      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |\n"
				+ "       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |\n"
				+ "        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |\n"
				+ "                                `'                            '-._|");
		System.out.println();
		System.out.println();
		String pokemon = "ATTRAPEZ LES TOUS !!";
		for (int i = 0; i < pokemon.length(); i++) {
			Thread.sleep(100);
			System.out.print(pokemon.charAt(i));
		}
		System.out.println();
		System.out.println();
		Thread.sleep(1500);

		do {

			System.out.println("Choisir son Pokemon : 1 / Rentrer en duel : 2");

			int choix = sc.nextInt();

			switch (choix) {

			case 1:
				System.out.println("Les Pokemons dispos sont : \n");

				afficher(liste);
				System.out.println();
				System.out.println("Choisir son pokemon");
				int x = sc.nextInt();
				Pokemon monPokemon = liste.get(x - 1);
				maListe.add(monPokemon);
				liste.remove(monPokemon);
				System.out.println();
				System.out.println("Hmm hmm, très bon choix jeune dresseur, vous avez choisi : " + monPokemon.getNom());

				break;

			case 2:
				if(liste.contains(null)) {
					
				}
				int newEnnemyPV;
				int myNewPV;
				monPokemon = maListe.get(0);
				Random r = new Random();
				int ra = r.nextInt(liste.size());
				Pokemon ennemi = liste.get(ra);
				System.out.println("VOTRE ENNEMI EST : " + ennemi.getNom() + " PREPAREZ VOUS !!!");
				System.out.println("VOTRE ENNEMI A " + ennemi.getPV() + "PV");
				System.out.println();
				System.out.println(
						"VOTRE POKEMON EST " + monPokemon.getNom() + " IL DISPOSE DE  " + monPokemon.getPV() + "PV");
				do {

					System.out.println("Attaque 1 :" + monPokemon.getAttaque1().getNom());
					System.out.println("Attaque 2 :" + monPokemon.getAttaque2().getNom());

					int attaque = sc.nextInt();
					switch (attaque) {

					case 1:
						newEnnemyPV = ennemi.getPV() - monPokemon.attaque1.getDegats();
						ennemi.setPV(newEnnemyPV);
						System.out.println("Ouchhhh vous infligez :" + monPokemon.getAttaque1().getNom() + "pour  "
								+ monPokemon.getAttaque1().getDegats() + "PV, c'est super efficace !!");

						System.out.println("Il reste " + ennemi.getPV() + " a l'ennemi !!");
						if (ennemi.getPV() < 0) {
							break;
						}
						int rand = new Random().nextInt(100);
						if (rand > 50) {
							myNewPV = monPokemon.getPV() - ennemi.getAttaque1().getDegats();
							monPokemon.setPV(myNewPV);
							for (int i = 0; i < 4; i++) {
								Thread.sleep(500);
								System.out.print("*");
							}
							System.out.println();
							System.out.println("Aille aille aille vous recevez :" + ennemi.getAttaque1().getNom()
									+ " pour " + ennemi.getAttaque1().getDegats() + "PV, c'est super efficace !!");

						} else {
							myNewPV = monPokemon.getPV() - ennemi.getAttaque2().getDegats();
							monPokemon.setPV(myNewPV);
							for (int i = 0; i < 4; i++) {
								Thread.sleep(500);
								System.out.print("*");
							}
							System.out.println();

							System.out.println("Aille aille aille vous recevez :" + ennemi.getAttaque2().getNom()
									+ " pour " + ennemi.getAttaque2().getDegats() + "PV, c'est super efficace !!");

						}

						System.out.println("Il vous reste : " + monPokemon.getPV() + "PV");
						break;
					case 2:
						newEnnemyPV = ennemi.getPV() - monPokemon.attaque2.getDegats();
						ennemi.setPV(newEnnemyPV);
						System.out.println("Ouchhhh vous infligez :" + monPokemon.getAttaque2().getNom() + "pour  "
								+ monPokemon.getAttaque2().getDegats() + "PV, c'est super efficace !!");
						System.out.println("Il reste " + ennemi.getPV() + " a l'ennemi !!");
						if (ennemi.getPV() < 0) {
							break;
						}

						int rand2 = new Random().nextInt(100);
						if (rand2 > 50) {
							myNewPV = monPokemon.getPV() - ennemi.getAttaque1().getDegats();
							monPokemon.setPV(myNewPV);
							for (int i = 0; i < 4; i++) {
								Thread.sleep(500);
								System.out.print("*");
							}
							System.out.println();

							System.out.println("Aille aille aille vous recevez : " + ennemi.getAttaque1().getNom()
									+ " pour " + ennemi.getAttaque1().getDegats() + "PV, c'est super efficace !!");

						} else {
							myNewPV = monPokemon.getPV() - ennemi.getAttaque2().getDegats();
							monPokemon.setPV(myNewPV);
							for (int i = 0; i < 4; i++) {
								Thread.sleep(500);
								System.out.print("*");

							}
							System.out.println();

							System.out.println("Aille aille aille vous recevez :" + ennemi.getAttaque2().getNom()
									+ " pour " + ennemi.getAttaque2().getDegats() + "PV, c'est super efficace !!");

						}

						System.out.println("Il vous reste : " + monPokemon.getPV() + "PV");

					}

				} while ((monPokemon.getPV() > 0 && ennemi.getPV() > 0));

				if (monPokemon.getPV() < 0) {
					System.out.println("YOU LOOSE, RETOURNE A L'ENTRAINEMENT JEUNE DRESSEUR");
				} else if (ennemi.getPV() < 0) {
					System.out.println("BRAVO, UN PAS DE PUS VERS EL FAMOSO CONSEIL DES 4");
				} else {
					System.out.println("EGALITEY");
				}

				System.out.println("COMBAT TERMINEY REVENEZ PLUS TARD");
				Thread.sleep(2500);

				rester = false;

			}

		} while (rester);
		System.out.println();
		System.out.println();
         signature();
	}

	public void duel(ArrayList<Pokemon> liste) {

	}

	public void afficher(ArrayList<Pokemon> liste) {

		int i = 1;
		Iterator<Pokemon> it = liste.iterator();

		while (it.hasNext()) {
			System.out.println(it.next().getNom() + " : " + i++);

		}}
	
	public void signature() throws InterruptedException {
		String signature = "..................................................................               .::.                                  .O888888888888888888888888888Ooo::..oO8O:\n" + 
				"................................................................                                                       .O8888888888888888888888888Ooo:... :88o. \n" + 
				".............................................................                                                          .o88888888888888888888888Oo:...    oO:   \n" + 
				"...........................................................           Full credit to Arthur de Donno                   .:88888888888888888888Oo:::...      .    \n" + 
				"..........................................................                                                              :8888888888888888OOo::::::..      .Oo.  \n" + 
				"........................................................                                                                :O88888888888Oooo::::::::::.      .O8O:.\n" + 
				".......................................................                                                                 :O88888888Oo:::::o:::::::::.       .oOo:\n" + 
				"......................................................                                                                  .o8888888O::::::::oo::::::.          .  \n" + 
				"....................................................                   .. ......                         :o:::.         .:888888O::::::::::::::::..             \n" + 
				"...................................................                  ....:::.......                     .OOOo           .:88888o:::::::::::::::....             \n" + 
				"..................................................                .....::o::.......  .                  .o.o.            :O888oo::::::::::::::..::.             \n" + 
				".................................................              .::::::::::.........   ..           .o. .o.:.             .O888::::::::::::::::::::.             \n" + 
				".. .............................................          ..::::oOooooooo:::::::::.........           .oo:               .o88O::::::::::::::::::::.             \n" + 
				"      ..........................................         :oOOOOOOOOOOOOOooOOOOOOOOooo:....            o:o                .:88o::::::::::::::::...:.             \n" + 
				"         ......................................        .ooOOOOOO88888O8OOO8888888888OOO:...          .::.                .:88o:.:::::::::::::::...              \n" + 
				"              .  .............................        .ooOOOOOOO8888888888888888888888OOOo:.          ..                  .O8o.::::::::::::::::::.              \n" + 
				"                      ........................        :ooOOOOO8888888888888888888888888OOOo:.                             .o8:..:::::::::::::::::.              \n" + 
				"                      .......................        .oooOOOO888888888888888888888888888OOOo:.                            .o8:..::::::::::::::::.               \n" + 
				"                             ................        :oooOOOO888888888888888888888888888OOOo:.                            .:8:.:::::::::::::::::.               \n" + 
				"                             ...............         :oooOOOO8888888888888888888888888888OOO:..                            :O..:::::::::::::::::.               \n" + 
				"                             ...............        .:ooOOOOOO888888888888888888888888888OOOo:.        ...                 .o..:::::::::::::::::.               \n" + 
				"                              .............         .:oooOOOOO888888888888888888888888888OOOo:..       .::.                ....::::::::::::::::.                \n" + 
				"                               ............         .:oooOOOOOO88888888888888888888888888OOOo:..       .o:O.               ....::::::::::::::::.                \n" + 
				"                               ............         .:oooOOOOOOO8888888888888888888888888OOOo:..        :o:O:   .           ...::::::::::::::.:.                \n" + 
				"                                ...........         .:oooOOOOOOO888888888888888888888888OOOOo:..         :O.oo. .           ...::::::::::::::...                \n" + 
				"                                ..........          .:oooooOOOOOO8888888888888888888OO8OOOOOo:..         .ooooO:            ...::::::::::::::...                \n" + 
				"                               ...........          .::...::::oooOOOO88888OOOOOOOOoooooOOOOOo:..         ..o..:.            ...::::::::::::::.                  \n" + 
				"                               ...........          .. .::::....::ooO8888OOoo::.:::::::::OOOo:..          ...... .           ..::::::::::::::.                  \n" + 
				"                              ............          . .::oooo:....:ooO888OOo::.::oOOOOoo:oOOoo          ..........           .:::::::::::::::.                  \n" + 
				"                              ............          ...::::.....::::oO888OOoo::::::ooooOoooOoo.          .........           .:::::::::::::::                   \n" + 
				"                            ..............          ..::.... ...ooo:oO888OOOOo::   ..::ooOOOOo.         ........ .           .:::::::::::::::.                  \n" + 
				"......................................:::.          .:::..:o:.:oOoOoOO888OOOOooo:...:.::oOOOOo.         .......              .:::::::::::::::.                  \n" + 
				".........                     .::::::::::.          .:oo::ooooooOOooOO8888OOOOOooooOooooOOOOOo.        ...........   ..      .:::::::::::::::                   \n" + 
				".........                     .::::::::::.          :oooooooOOOOOOooOO8888OOOOOOOOOOOOOOOOOOOo.        ..........   ....     .:::::::::::::::                   \n" + 
				"    .....                     .::::::::::.          :ooOOOOOOOOOOoooO88888OOOOOOOOOOOO88OOOOOo.         ........             .::o::::::::::::                   \n" + 
				"      ..                      .::::::::::.          :oOOOOOOOOOOOooOO8888OOOOO88888O888888OOOo          ............         .:::::::::::::::                   \n" + 
				"                            . .::::::::::.          :oOOOOOOOOOOoooOOO888OOOOO888888888888OOOo          ....                 .:::::::::::::::                   \n" + 
				"                           .  .::::::::::.          :oOOOOOOOOOOOoOOO8888OOOOO888888888888OOoo          .. .....             .:::::::::::::::                   \n" + 
				"                          .   .::::::::::.          .oOOOOOOOOOOooOOO888888OOO888888888888OOo:          ..........         ...::::::::::::::.                   \n" + 
				"                              ............          .:oOOOOOOOOoooooOO888OOOOOO8888888888OOOo.          ............         .:::::::::::o::.                   \n" + 
				"             ...                 ..  ....            :oOOOOOOOo:o:::ooOOOooooOO888888888OOOOo...        ............         .::::::::::o:::.                   \n" + 
				"              .                    ......            .:oOOOOOOo.......:::oo::oO888888888OOOO888O:       ...............  .   .:::::::::o::::.                   \n" + 
				"                                 ........             :oOOOOOOOoo::.::OOoo:::OOO88888888OOO888888o      ......  ..  ...   .  :::::::::::::::.                   \n" + 
				"...                            .........             ..ooOOOOOOo:. ..:oo:....:ooOOOO88OOOoO888888O.     ..............       .::::::::o:::::.                   \n" + 
				" ...   .                  .  ...........             ..:oooo:::.. ....:o:.......:::ooOOOOoO8888888:    ..............        .::::::::::::::.                   \n" + 
				"...  ...              .....  ...........              ..:o:.... ....:ooo:oo:........:oOOo:O8888888O  ...........           ..:::::::o:::::::                    \n" + 
				".                             .........                ..:.   ...:oOOOOOOOOOoooo:....:OOo:O8888888O. ...........         .oOOOO:::::::::::::                    \n" + 
				"                               ........                 ..   ..:::oooooooooooooooo:..:ooo:OO8888888: ..........         :OO8888O:::o::::::::                    \n" + 
				"               .               .......                      .:o::ooooOOOOOOOOOOOOOo..:ooo:oO8888888O ..........        :oO88888Oo:::::::::::                    \n" + 
				"           .                        ..                      .:ooooooOOOOOOOOOOOoOOO:::ooo:OO88888888...........     ...oOOO888OOo::::::::::.                    \n" + 
				"        .                       .....                      ..oo::::ooOOOOOOooooOOOOooooo:.oO88888888:..........   ....:oOOO888OO:::::::::::.                    \n" + 
				"           .                    .                          .:oooo:..:::::::::oOOOOoOooo: .oOO8888888:..........      .oOO88888OO:::::::::::.                    \n" + 
				"        . :o.                                              ..::::o:..   ....oOOOOOoooo:. .oO88888888O..........      :oOOO88OOOO:::::::::::                     \n" + 
				"        .   .                                               ..::oooo:::.:::oOOOOOo::o:.   oO888888888:.........     .oOOOO8OOOOo:ooo::::::.                     \n" + 
				"         ....                       .                        ..:oooooo::oooOOOoOo:....    :OO88888888o.........     :OOO8888OOO::o::::::::                      \n" + 
				"         .                          .                         .:o::ooooooooooooo::. .     .oO888888888........      oOOO888888O::o:::o:::                       \n" + 
				"    ..        .                                                .:.::::oo:::::::...         oO888888888o......       oOO888888O::::ooo:o:.                       \n" + 
				"             ....                                              .......:.   .... .          :O88888#8888.....       .OO8888888O.:::::::::                        \n" + 
				".  .         ...                 ...                 ...:           ..        .            .O88888#8888o....       oO88888888o.:::o:::o.                        \n" + 
				"     .....      . .             ....                  ..o:.                   .            .oO8888##8888...       .oO88888888:.::::::o:                         \n" + 
				"      ....  .  .  .  .  .      .... .                  .oo:.                                oO88888#8888o..       :OO88888888..::::o:::                         \n" + 
				"    ......  .        .  . .       . .                  .oooo.                               :O88888#88888..       :O888888888. ::::::::                         \n" + 
				"   ........         .. .  .   ..  . .                   :oOOo::::.          .:o             .oO8888888888o.      .oO88888888O. .::::::.                         \n" + 
				" .  ..... ..     .. .. .. .   .   .                      oOOOO888Oo.     .:oOO.              oO88888888888.      .oO88888888O:..::::::.                         \n" + 
				"                                                         .OOO88888Oo......oOO.               :OO8888888888o      :OO88888888O:..:::::::                         \n" + 
				"                                                          :OO88888OO:.....:O:                .oO88888888888:     :OO88888888O::.::o::::                         \n" + 
				"                                                          :OO8888888O......:                 .oO88888888888O    .oOO8888888OO:::::oo:o:.                        \n" + 
				"                                                          :O88888888O:.....                   oOO88888888888.   .OO88888888OO:::::::::::                        \n" + 
				"                                                          .O888888888o....                    :OO88888888888:   :OO8888888OOO::::::::o::                        \n" + 
				"                                                           oO88888888O:..                     :oO88888888888o  .oOO8888888O8O:::::::::::                        \n" + 
				"                                                           oO888888888o..                     .oO88888888888O. .OOO88888888OO::::ooo::::                        \n" + 
				"                                                           :O888888888O:                      .oOO88888888888: oOOO88888888Oo::::::::::.                        \n" + 
				"                                                           .OO888888888o                       oOOO8888888888O.oOO888888888O:.::::o::::                         \n" + 
				"                                                           .OO8888888888.                      :oOO88888888888:OOOO888888888:.:::::::o:                         \n" + 
				"                                                            oO8888888888O                      .oOOO8888888888oOOOO88888888O. ..::::::.                         \n" + 
				"                                                            :O88888888888:                     .ooOOO888888888OOOOO88888888O       ...                          \n";
			
		
		String produce = "Produced by :";
		for(int i=0; i<produce.length();i++) {
			Thread.sleep(150);
			System.out.print(produce.charAt(i));
		}
		System.out.println();
		System.out.println();
		Thread.sleep(500);
		
		for(int i=0; i<signature.length();i++) {
			Thread.sleep(1);
			System.out.print(signature.charAt(i));
		}
	}
}
