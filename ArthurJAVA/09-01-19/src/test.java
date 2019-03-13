import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class test {

	public static void main(String[] args) {

		ArrayList<String> liste = new ArrayList<>();
		liste.add("RED");// , "GREEN","ORANGE","WHITE","BLACK");
		liste.add("GREEN");
		liste.add("ORANGE");
		liste.add("WHITE");
		liste.add("BLACK");

		System.out.println("BEFORE\n" + liste + "\n");

		//Collections.sort(liste);

		//System.out.println("AFTER\n" + liste + "\n");

		//Collections.reverse(liste);
		
		//System.out.println(liste);
		
		List<String> subListe = liste.subList(0, 3);
		
		System.out.println(subListe + "\n");
		
		subListe.add("WHITE");
		subListe.add("PINK");
		subListe.add("YELLOW");
		
		System.out.println(subListe);
		
        liste.ensureCapacity(20);


		System.out.println(liste);
		
for (int i = 0; i<10; i++) {
	System.out.println("Thelma est la plus jolie");
}
	}
}
