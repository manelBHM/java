import java.util.ArrayList;
import java.util.List;

public class EtudiantArrays {

	public static void main(String[] args) {

		ArrayList<String> etudiants = new ArrayList<String>();
		etudiants.add("Francois");
		etudiants.add("Juliette");
		etudiants.add("Daniel");
		etudiants.add("Jack");
		etudiants.add("Patrick");
		etudiants.add("Franck");
		
		System.out.println(etudiants);
		
		etudiants.remove("Francois");
		etudiants.remove("Patrick");
		
		System.out.println(etudiants);
		
		etudiants.remove("Jack");
		
		for (String a : etudiants) {
			System.out.println(a);
		}
		
		
        
		
	}

}
