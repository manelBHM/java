import java.util.Hashtable;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ExTreessset {

	public static void main(String[] args) {

		
		NavigableSet<String> x = new TreeSet<String>();
		x.add("A");
		x.add("B");
		x.add("C");
		x.add("D");
		
		System.out.println(x.higher(""));
		
		
		NavigableSet<String> y = new TreeSet<String>();

		y.add("N");
		y.add("S");
		y.add("A");
		y.add("D");
		y.add("B");
		
		System.out.println(y + "\n");
		System.out.println(x.higher("A"));
		
        System.out.println(x.headSet("N"));
        
        Hashtable ht = new Hashtable<>();
        ht.put(1, "salut");
        ht.put(2, "hello");
        ht.put(1, "coucou");
        
        System.out.println(ht);
	}

}
