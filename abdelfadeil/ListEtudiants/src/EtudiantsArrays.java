import java.util.ArrayList;
import java.util.Iterator;

public class EtudiantsArrays {

	public static void main(String[] args) {
		ArrayList<String> etudiants = new ArrayList<>();
		etudiants.add("François");
		etudiants.add("Juliette");
		etudiants.add("Daniel");
		etudiants.add("Jack");
		etudiants.add("Patrick");
		etudiants.add("Franck");
		System.out.println(etudiants);
		
		etudiants.remove("François");
		etudiants.remove("Patrick");
		
		System.out.println(etudiants);
		
		etudiants.remove("Daniel");

		System.out.println(etudiants);
		
		Iterator<String> etusiant = etudiants.iterator();
		
		for (String string : etudiants) {
			System.out.println(string);
		}

		
	}

}
