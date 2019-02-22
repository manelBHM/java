package appCollection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class mapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(5, "A");
        hmap.put(11, "C");
        hmap.put(4, "Z");
        hmap.put(77, "Y");
        hmap.put(9, "P");
        hmap.put(66, "Q");
        hmap.put(0, "R");
        
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        System.out.println("Avant le tri: ");
        while(iterator.hasNext()) {
           Map.Entry me = (Map.Entry)iterator.next();
           System.out.print(me.getKey() + ": ");
           System.out.println(me.getValue());
        }

        Map sortedMap = new TreeMap(hmap);

        Set set2 = sortedMap.entrySet();
        Iterator iterator2 = set2.iterator();
        System.out.println("Après le tri: ");
        while(iterator2.hasNext()) {
           Map.Entry me2 = (Map.Entry)iterator2.next();
           System.out.print(me2.getKey() + ": ");
           System.out.println(me2.getValue());
        }
	} 
}   /* Collections.sort(mapCollection, Employe.ComparatorNom);
        
        System.out.println("liste ordonnée des employés par nom:");
        for(Employe e:arraylist)
         System.out.println(e);
	}
        public static Comparator<Employe> ComparatorNom = new Comparator<Employe>() {
            
            @Override
            public int compare(Employe e1, Employe e2) {
                return e1.getNom().compareTo(e2.getNom());
            }
        };*/







