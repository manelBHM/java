import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class StagiaireM {

	public static void main(String[] args) {

		ArrayList<Stagiaire> liste = new ArrayList<Stagiaire>();

		Stagiaire jean = new Stagiaire("Jean L", 25, 225);
		Stagiaire franck = new Stagiaire("Franck D", 27, 100);
		Stagiaire alain = new Stagiaire("Alain J", 20, 220);
		Stagiaire victor = new Stagiaire("Victor", 22, 150);

		liste.add(jean);
		liste.add(franck);
		liste.add(victor);
		liste.add(alain);

		// Iterator iterator = liste.iterator();

		for (Stagiaire x : liste) {
			System.out.println(x.toString());
		}
		System.out.println();

		Collections.sort(liste, Stagiaire.ageComparator);
		for (Stagiaire st : liste) {
			System.out.println(st);
		}
		System.out.println();

		Collections.sort(liste, Stagiaire.idComparator);
		for (Stagiaire st : liste) {
			System.out.println(st);
		}
		
		System.out.println();
		
		Collections.sort(liste, Stagiaire.nameComparator);
		
		for (Stagiaire st : liste) {
			System.out.println(st);
		}

	}

}
