import java.util.*;
import java.util.Map.Entry;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(5, "A");
		hmap.put(11, "C");
		hmap.put(4, "Z");
		hmap.put(77, "Y");
		hmap.put(9, "P");
		hmap.put(66, "Q");
		hmap.put(0, "R");

		System.out.println("Avant tri : ");

		for (Map.Entry<Integer, String> valeur : hmap.entrySet()) {
			System.out.println(valeur.getKey() + ":" + valeur.getValue());
		}

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>(hmap);

		System.out.println("");
		System.out.println("Après le tri par clés : ");
		for (Map.Entry<Integer, String> valeur : tmap.entrySet()) {
			System.out.println(valeur.getKey() + ":" + valeur.getValue());
		}

		List<Map.Entry> liste = new LinkedList<Map.Entry>(hmap.entrySet());

		Collections.sort(liste, new Comparator<>() {

//			@Override
//			public int compare(Object o1, Object o2) {
//
//				return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
//			}

			@Override
			public int compare(Entry o1, Entry o2) {
				return ((String) o1.getValue()).compareTo((String) o2.getValue());
				
			}
		});

		System.out.println("");
		System.out.println("Après le tri par valeurs : ");

		HashMap hmaptriee = new LinkedHashMap();

		for (Iterator iterator = liste.iterator(); iterator.hasNext();) {
			Map.Entry entree = (Map.Entry) iterator.next();
			hmaptriee.put(entree.getKey(), entree.getValue());

		}

		for (Iterator iterator = ((Set<Entry<Integer, String>>) hmaptriee).iterator(); iterator.hasNext();) {
			Map.Entry valeur = (Map.Entry) iterator.next();
			System.out.println(valeur.getKey() + ":" + valeur.getValue());

		}

	}
}
