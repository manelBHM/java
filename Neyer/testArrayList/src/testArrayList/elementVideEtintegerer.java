package testArrayList;

import java.util.ArrayList;
import java.util.List;
//import java.util.Collections;

public class elementVideEtintegerer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> liste = new ArrayList<String>();
		
		liste.add("Red");
		liste.add("Green");
		liste.add("Black");
		
		System.out.println(liste);
		
		
		((ArrayList<String>) liste).ensureCapacity(6);
		
		//liste.add("White");
		//liste.add("Pink");
		//liste.add("Yellow");
		
		//liste(4)=liste.add("Orange");
		liste.add("Yo");
		
		
		System.out.println(liste);

	}

}
