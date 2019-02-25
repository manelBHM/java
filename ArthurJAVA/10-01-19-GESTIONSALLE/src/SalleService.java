import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.event.ListDataEvent;

public class SalleService implements ISalle {

	@Override
	public LinkedList<Salle> create() {

		LinkedList<Salle> newSalle = new LinkedList<Salle>();

		Salle zeus = new Salle(1, "Zeus", 1000);
		Salle athena = new Salle(2, "Athena", 800);
		Salle artemis = new Salle(3, "Artemis", 600);
		Salle apollo = new Salle(4, "Apollo", 500);
		Salle bacchus = new Salle(5, "Bacchus", 200);

		newSalle.add(artemis);
		newSalle.add(athena);
		newSalle.add(zeus);
		newSalle.add(bacchus);
		newSalle.add(apollo);

		return newSalle;
	}

	@Override
	public void update() {

	}

	@Override
	public void clearList(LinkedList<Salle> liste) {

		liste.clear();

	}

	public void ajouterSalle(LinkedList<Salle> liste) {
		Scanner sc10 = new Scanner(System.in);
		System.out.println("ENtrez id salle");
		int id = sc10.nextInt();
		
		System.out.println("Entrez nom de la salle");
		Scanner sc9 = new Scanner(System.in);

		String nom = sc9.nextLine();
		System.out.println("Entrez la capacité de la salle");
		Scanner sc8 = new Scanner(System.in);

		int capa = sc8.nextInt();
		Salle ajouSalle = new Salle(id, nom, capa);
		liste.add(ajouSalle);

	}

	public void removeSalle(LinkedList<Salle> liste) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Voici la liste des salles : " + "\n");
		afficherSalles(liste);
		System.out.println("Veuillez entrez l'id de la salle a supprimer :");
		int x = sc.nextInt();
		liste.remove(x-1);

	}
	
	public int idReturn(Salle salle) {
		
		int ID  = salle.getId();
		
		return ID;
	}

	@Override
	public void delete(LinkedList<Salle> liste) {
     liste.clear();
     afficherSalles(liste);
	}

	public void menu(LinkedList<Salle> liste) {
		Scanner sc = new Scanner(System.in);
		boolean retour = true;

		System.out.println("Bienvenue dans la gestion de salles");

		do {
			System.out.println(" Que souhaitez vous faire ?" + "\n" + "1 : consulter les salles disponibles" + "\n"
					+ "2 : ajouter une salle" + "\n" + "3 : supprimer une salle" + "\n" + "4 : quitter");

			int choix = sc.nextInt();

			switch (choix) {
			case 1:
				afficherSalles(liste);
				System.out.println("Retour ? // Oui : 1 / Non : 2");
				int var2 = sc.nextInt();
				if (var2 == 2) {
					retour = false;
				}
				break;
			case 2:
				ajouterSalle(liste);
				System.out.println("Après ajout de salles : ");
				afficherSalles(liste);
				System.out.println("Retour ? // Oui : 1 / Non : 2");
				int var3 = sc.nextInt();
				if (var3 == 2) {
					retour = false;
				}
				break;
			case 3:
				removeSalle(liste);
				System.out.println("Voici le salles restantes");
				afficherSalles(liste);
				System.out.println("Retour ? // Oui : 1 / Non : 2");
				int var4 = sc.nextInt();
				if (var4 == 2) {
					retour = false;
				}
				break;
			case 4:
				System.out.println("Etes vous sur de quitter ? 1 : Oui / 2 : Non");
				int var5 = sc.nextInt();
				if (var5 == 1) {
					retour = false;
				}
				
			

			}
		} while (retour);

	}

	@Override
	public void afficherSalles(LinkedList<Salle> liste) {
		
		Collections.sort(liste, Salle.idComparator);

		Iterator<Salle> it = liste.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
