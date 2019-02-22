import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoArrayList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tableau = { "A", "B", "C", "D"};
		List<String> liste = new ArrayList <String> ();
		
		System.out.println("Contenu du tableau");
		for (String str : tableau) {
			System.out.println(" " + str);
		}
		liste = Arrays.asList(tableau);
		System.out.println("\nContenu de la liste");
		for (String str : liste) {
			System.out.println(" " + str);
		}
		System.out.println("\n");
		tableau[0] = "AA";
	
		System.out.println("\nContenu de la liste");
		for (String str : liste) {
			System.out.println(" " + str);}
		
		System.out.println("\n");
		liste.add("E");
		
		
		
		

	}

}
