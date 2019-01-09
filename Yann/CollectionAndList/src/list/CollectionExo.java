package list;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;

public class CollectionExo {

	
	public static void trier(final List<String> x)
	{
		Collections.sort(x);	 
	}
	
	
	public static void trieDecroissant(final List<String> x)
	{
		//Tri dans l'ordre décroissant
		
		Collections.sort(x, Collections.reverseOrder());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> liste = new ArrayList<String>();
		
		liste.add("Red");
		liste.add("Green");
		liste.add("Orange");
		liste.add("White");
		liste.add("Black");
	
		System.out.println("Liste initiale : " + liste);
		System.out.println("");
		
         trier(liste);
           
         System.out.println("Liste trié : " + liste);
         System.out.println("");
         
         
         trieDecroissant(liste);
         
         System.out.println("Liste triée en ordre decroissant : " + liste);
	}

}
