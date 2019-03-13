
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		String[] tableau = {"A", "B", "C", "D"};
		List<String> liste = new ArrayList<String>();
		
		System.out.println("Contenu du tableau");
		for(String str: tableau) {
			System.out.print(" " + str);
		}
		
		liste = Arrays.asList(tableau);
		System.out.println("\nContenu de la liste");
		for(String str: liste) {
			System.out.print(" " + str);
		}
		
		System.out.println("\n");
		tableau[0] = "AA";
		
		System.out.println("\nContenu de la liste");
		for(String str: liste) {
			System.out.print(" " + str);
		}
		
		System.out.println("\n");
		liste.add("E");
		System.out.println("Contenu du tableau");
		for(String str: tableau) {
			System.out.print(" " + str);
		}
	}

}
