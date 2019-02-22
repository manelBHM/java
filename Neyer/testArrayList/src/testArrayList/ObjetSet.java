package testArrayList;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class ObjetSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NavigableSet set = new TreeSet();
		
		for(int i = 0 ; i < 10 ;i++) {
			
			set.add(""+i);
			
		}
		
		afficherSet(set);
		System.out.println(set.higher("2"));

	}
	
	
	public static void afficherSet(Set<String> set) {
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			
			String element = it.next();
			
			System.out.print(element);
				
		}
		
	}

}
