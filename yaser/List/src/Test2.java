import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;




public class Test2 {

	public static void afficherSet (final Set<String> set) {
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out .println(element);
			
			if(iterator.hasNext()) {
				System.out .println(",");
			}
			else {
				System.out .println("");
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NavigableSet<String> set = new TreeSet<String>();
		NavigableSet<String> set1 = new TreeSet<String>();
		
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		
		System.out.println(set);
		
		System.out .println("teh higher is : " +set.higher("b") );
		System.out .println("teh lower is : " +set.lower("b") );
		
		set1.add("b");
		set1.add("d");
		set1.add("a");
		set1.add("c");
		System.out.println(set);
		afficherSet(set.descendingSet());
		
		
		
		
		
	}

}
