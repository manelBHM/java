import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Listes {

	public static void main(String[] args) {

		Integer[] tab = { 1, 2, 3, 4, 5 };

		List<Integer> liste = new ArrayList();

		for (int valeur : tab) {
			System.out.println("La valeur du tableau est : " + valeur);
		}
		
		System.out.println("");

		liste = Arrays.asList(tab);

		System.out.println(liste);
		
		System.out.println("");
		
		
		tab[0]=10;
		
		for (int i : tab) {
			System.out.println("La valeur du tableau est : " + i);
		}
		
		System.out.println("");
		System.out.println(liste);
		System.out.println("");
		
		Collections.sort(liste);
		
		System.out.println(liste);
		
		
		
		

	}

}
