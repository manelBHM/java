package testArrayList;

import java.util.ArrayList;
import java.util.List;

public class extraireUnPartie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> liste = new ArrayList<String>();
		
		liste.add("Red");
		liste.add("Green");
		liste.add("Orange");
		liste.add("White");
		liste.add("Black");
		
		//for(String str : liste) {
			System.out.print(liste+" ");
		//}
		
		System.out.println("");
		
		List <String> sousListe = liste.subList(0, 3);//extrait une partie d'une liste et ne prend pas en compte le dernier
		
		
			System.out.print(sousListe+" ");
		

	}

}
