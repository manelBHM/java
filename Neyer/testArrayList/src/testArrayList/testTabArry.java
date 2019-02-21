package testArrayList;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class testTabArry {

	public static void main(String[] args) {
		
		String tab[] = {"Neyer","Marie","Samba","Yiann"};
		
		List<String> liste = new ArrayList<String>();
		
		System.out.println("contenu tableau");
		
		for(String str : tab) {
			System.out.print(" "+str);
		}
		
		liste = Arrays.asList(tab);//associe tab evc liste
		System.out.println("\ncontenu tableau");
		
		for(String str : liste) {
			System.out.print(" "+str);
		}
		
		tab[0]="NY";
		
		System.out.println("\ncontenu tableau");
		
		for(String str : liste) {
			System.out.print(" "+str);
		}
		
		liste.add("Mouche");
		
System.out.println("\ncontenu tableau");
		
		for(String str : tab) {
			System.out.print(" "+str);
		}
		
	}

}
