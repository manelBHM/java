import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ExerciceTri {

	public static void main(String[] args) {

		List<String> liste = new ArrayList<String>();

		liste.add("Red");
		liste.add("Green");
		liste.add("Orange");
		liste.add("White");
		liste.add("Black");

		System.out.println("Liste : " + liste);

		Collections.sort(liste);

		System.out.println("");
		System.out.println("Liste triée : " + liste);

		Collections.reverse(liste);

		System.out.println("");
		System.out.println("Liste inversée : " + liste);

		List<String> sousListe = liste.subList(0, 3);

		System.out.println("");
		System.out.println("Sous-liste : " + sousListe);

		sousListe.add("Yellow");
		sousListe.add("Grey");
		sousListe.add("Blue");

		System.out.println("");
		System.out.println("Sous-liste après ajout : " + sousListe);

		System.out.println("");
		System.out.println("Liste : " + liste);

		Collections.sort(sousListe);

		System.out.println("");
		System.out.println("Sous-liste triée : " + sousListe);

		System.out.println("");
		System.out.println("Liste : " + liste);
		
		

	}

}
