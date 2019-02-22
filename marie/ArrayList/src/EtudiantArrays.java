import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class EtudiantArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> etudiant = new ArrayList<String>();
		etudiant.add("François");
		etudiant.add("Juliette");
		etudiant.add("Daniel");
		etudiant.add("Jack");
		etudiant.add("Patrick");
		etudiant.add("Franck");
		System.out.println(etudiant);
		
		etudiant.remove(0);
		etudiant.remove(3);
		System.out.println(etudiant);
	}

}
