
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class ExerciceTreeset {
	
	public static void afficherSet(final Set<String> set) {
		Iterator<String> iterator = set.iterator(); 
		while (iterator.hasNext()) {
		String element = iterator.next(); 
		System.out.print(element);
		if (iterator.hasNext()) {
		System.out.print(", "); } else {
		System.out.println(""); }
		}
	}
		
	

	public static void main(String[] args) {

		NavigableSet<String> set = new TreeSet<String>();

		set.add("A");
		set.add("D");
		set.add("C");
		set.add("B");
		set.add("E");

		System.out.println(set);

		System.out.println(set.higher("D"));
		System.out.println(set.lower("C"));
		System.out.println(set.first());

		System.out.println(set.descendingSet());
		System.out.println("");
		afficherSet(set);
		System.out.println("");

		System.out.println(set.higher("D"));
		System.out.println(set.lower("C"));

		System.out.println(set.first());
		System.out.println(set.headSet("D"));
		System.out.println(set.headSet("D", true));

	}

}
