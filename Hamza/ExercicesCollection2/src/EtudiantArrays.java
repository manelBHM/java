import java.util.ArrayList;
import java.util.Iterator;

public class EtudiantArrays {

	public static void main(String[] args) {
		ArrayList<String> etudiants = new ArrayList<String>();

		etudiants.add("François");
		etudiants.add("Juliette");
		etudiants.add("Daniel");
		etudiants.add("Jack");
		etudiants.add("Patrick");
		etudiants.add("Franck");

		System.out.println(etudiants);

		etudiants.remove(0);
		etudiants.remove(3);

		System.out.println(etudiants);

		etudiants.remove(2);

		for (String str : etudiants) {
			System.out.println(str);
		}

	}

}
