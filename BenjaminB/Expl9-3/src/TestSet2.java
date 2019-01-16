import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet2 {
public static void afficherSet(final Set<String> set) {
	Iterator<String> iterator = set.iterator();
	while (iterator.hasNext()) {
		String element = iterator.next();
		System.out.println(element);
		if (iterator.hasNext()) {
			System.out.print(", ");
		}else {
			System.out.println(" ");
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableSet<String> set=new TreeSet<String>();
		for(int i=1;i<10;i++) {
			set.add(" "+ i);
		}
		System.out.println(set);
		
		System.out.println("Higher (5)="+set.higher("5"));
		System.out.println("Lower (5)="+set.lower("5"));
		System.out.println("Ordre descendant=");
		afficherSet(set.descendingSet());
	}

}
