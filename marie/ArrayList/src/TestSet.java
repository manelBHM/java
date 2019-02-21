import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util. Set;
import java.util.Iterator;
public class TestSet {

	public static void afficherSet(final Set<String> set) {
		// TODO Auto-generated method stub
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.print(element);
			
			if(iterator.hasNext()) {
				System.out.print(", ");
			}
				else {
					System.out.print(" ");
				}
			}
		}
	
	
	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet<String> set = new TreeSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		
		System.out.println("Liste original " + set);
		
		

	      System.out.println("Higher " + set.higher("B"));
	      System.out.println("Lower " + set.lower("B"));
	      System.out.println("\nListe descendant");
	      afficherSet(set.descendingSet());
	}

	

}
