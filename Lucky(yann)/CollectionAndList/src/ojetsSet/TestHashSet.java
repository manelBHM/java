package ojetsSet;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs = new HashSet();
		
		hs.add("toto");
		hs.add(12);
		hs.add('d');
		
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		    System.out.println("");
			System.out.println("Parcours avec un tableau d'objet");
			System.out.println("--------------------------------");
			
			
			Object[] obj = hs.toArray();
			for(Object o : obj)
			{
				System.out.println(o);
			}
		
		
	}

}
