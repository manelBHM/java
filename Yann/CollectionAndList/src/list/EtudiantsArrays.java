package list;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;


public class EtudiantsArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> etudiants = new ArrayList<String>();

		etudiants.add("François");
		etudiants.add("Juliette");
		etudiants.add("Daniel");
		etudiants.add("Jack");
		etudiants.add("Patrick");
		etudiants.add("Franck");

		System.out.println(etudiants);


		System.out.println("");
		etudiants.remove(0);
		etudiants.remove(3);

		System.out.println(etudiants);
		System.out.println("");

		etudiants.remove(3);



		ListIterator<String> it = etudiants.listIterator();

		while(it.hasNext())
		{
			String str = it.next();
			System.out.println(str + " ");
		}



		for(String str : etudiants)
		{
			System.out.println(str + " ");
		}






	}


}
