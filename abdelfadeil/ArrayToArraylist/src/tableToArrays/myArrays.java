package tableToArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;



public class myArrays {
	
	public static void mytable() {
		
		String [] tableau = {"fadeil", "beel", "samir", "amer"};
	     List<String> mylist = new ArrayList<String>();
		
		System.out.println("contenu du tableau ");
		for (String tab : tableau) {
			System.out.print(tab+" : ");
		}
		
		
		System.out.println();
		System.out.println("\n"+"/////////////////////////////////");

		mylist = Arrays.asList(tableau);
		
		System.out.println("contenu du mylist");
		
		for (String list : mylist) {
			System.out.print(list+" : ");
		}
		System.out.println();

		System.out.println("\n"+"/////////////////////////////////");

		tableau[0]=  "AAA";
		System.out.println("contenu du tableau avec AA ");
		for (String tab : tableau) {
			System.out.print(tab+" : ");
		}
		System.out.println();
		System.out.println("\n"+"/////////////////////////////////");
	      System.out.println("contenu du mylis après l'utilisation de la méthode add() ");

		mylist.add("Eric");
		
		for (String list : mylist) {
			System.out.print(list+" : ");
	}

		}
	public static void main(String[] args) {
		
		mytable();
		
		
		
	}

}
 
