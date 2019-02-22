import java.util.*;

public class TreeSetTest {
	
	public static void afficherSet(final Set<String> set) {
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.print(str);
			if(it.hasNext()) {
				System.out.print(", ");
			}else {
				System.out.print("");
			}
			
		}

	}

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("A");
		tree.add("B");
		tree.add("C");
		tree.add("D");

		System.out.println(tree.lower("C"));
		System.out.println(tree.higher("C"));
		TreeSet<String> tree1 = new TreeSet<String>();
		tree1.add("N");
		tree1.add("S");
		tree1.add("A");
		tree1.add("D");
		tree1.add("B");

		Iterator<String> it = tree1.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");

		}
		afficherSet(tree1);
		System.out.println("\n" + tree1.descendingSet());
		
		TreeSet<String> tree2 = new TreeSet<String>();
		tree2.add(""+1);
		tree2.add(""+2);
		tree2.add(""+3);
		tree2.add(""+4);
		tree2.add(""+5);
		tree2.add(""+6);
		tree2.add(""+7);
		tree2.add(""+8);
		tree2.add(""+9);
		afficherSet(tree2);
		System.out.println();
		afficherSet(tree2.descendingSet());
		
		System.out.println("headSet(5)");
		afficherSet(tree2.headSet("5"));
	}

}
