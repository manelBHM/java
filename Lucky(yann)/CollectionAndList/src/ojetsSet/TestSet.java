package ojetsSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
	

	public static void afficherSet(final Set<String> set) {
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
		String element = iterator.next();
		System.out.print(element);
		if (iterator.hasNext()) {
		System.out.print(", ");
		} else {
		System.out.println("");
		}
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		
		
		NavigableSet<String> set = new TreeSet<String>();
		for (int i = 1; i < 10; i++) {
		set.add("" + i);
		}
		System.out.println(set);
		System.out.println("higher(5)=" + set.higher("5"));
		System.out.println("lower(5)=" + set.lower("5"));
		System.out.print("Ordre descendant=");
		afficherSet(set.descendingSet());
		
		
		
		
		
		
		
		/*
		NavigableSet set = new TreeSet();
		
		set.add(1);
		set.add(5);
		set.add(4);
		set.add(2);
		set.add(0);
		set.add(3);
		
		System.out.println(set);
	//	System.out.println(set.higher("A"));
   // System.out.println(set.lower("B"));
		afficherSet(set.descendingSet());
		*/
		
	}
	

}
