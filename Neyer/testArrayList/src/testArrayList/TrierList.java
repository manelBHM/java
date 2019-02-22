package testArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrierList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1 = new ArrayList<String>();
		
		list1.add("Red");
		list1.add("Green");
		list1.add("Orange");
		list1.add("White");
		list1.add("Black");
		
		for(String str : list1) {
			System.out.print(" "+str);
		}
		
		System.out.println("");
		
		Collections.sort(list1);//trie par la premiere lettre de l'alphabet  // avec deux paramètres le premier designe la liste, le deuxieme une variable (un critère) qui s'occupe du type de trie
		
		for(String str : list1) {
			System.out.print(" "+str);
		}
		
	}

}
