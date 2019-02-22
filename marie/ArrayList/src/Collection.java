import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> liste = new ArrayList<String>();
		liste.add("Red");
		liste.add("Green");
		liste.add("Orange");
		liste.add("White");
		liste.add("Black");
		System.out.println("\nContenu du tableau " + liste);
		
		/*List<String> liste2 = liste.subList(0, 3);
	
		System.out.println("\nContenu du tableau " + liste2);
		
		List<String> liste3 = new ArrayList<String>();
		((ArrayList<String>) liste2).ensureCapacity(3);
		liste2.add("White");
		liste2.add("Pink");
		liste2.add("Purple");
	   
	      for (String str: liste2) {
	            System.out.println(str);
	      }*/
	
			
		Collections.sort(liste);
		/*Collections.reverse(liste);*/
		
		System.out.println("\nContenu du tableau apres " + liste);
		


}}
