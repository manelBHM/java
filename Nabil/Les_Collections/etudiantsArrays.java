import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;
public class etudiantsArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> etudiants = new ArrayList<String>();
		
		etudiants.add("Francois");
		etudiants.add("Juliette");
		etudiants.add("Daniel");
		etudiants.add("Jack");
		etudiants.add("Patrick");
		etudiants.add("Franck");
		
		
		Iterator it1 = etudiants.iterator();
		
		while(it1.hasNext()) {
			
			System.out.println(it1.next());

			
		}
		
		System.out.println("\n");
		
		
		etudiants.remove(0);
		etudiants.remove(3);
		
		Iterator it2= etudiants.iterator();
		
		while (it2.hasNext()) {
			
			System.out.println(it2.next());
		}
			
		
		System.out.println("\n");
		etudiants.remove(2);
		
		
		
		Iterator it = etudiants.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

			
		}

		
		

			

		



		
		
		

	}

}
