import java.util.List;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Couleur {

	public static void main(String[] args) {
		List<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Green");
		color.add("Orange");
		color.add("White");
		color.add("Black");
		
		System.out.print(color+" ");

		System.out.println();
		Collections.sort(color);
		for (String str : color) {
			System.out.print(str+" ");
		}

		Iterator<String> mescolor = color.iterator();
		System.out.println("\n**********************");
		while (mescolor.hasNext()) {
			System.out.print(mescolor.next() + " : ");

		}
		System.out.println("\n**********************");

		TreeSet<String> colors = new TreeSet<String>();
		colors.addAll(color);
	
		
		Iterator<String> itcolor = colors.iterator();
		while (itcolor.hasNext()) {
			System.out.print(itcolor.next()+" : ");			
		}

	}

}