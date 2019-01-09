package list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] tab = {"A", "B", "C", "D"};
	
		List<String> myList = new ArrayList<String>();
		
		
		
		System.out.println("Contenu du tableau ");
	
		for(String str : tab)
		{
			System.out.println(" " + str);
		}
		
		
		tab[0] = "AA";
		
		System.out.println("Contenu du tableau modifier ");
		
		for(String str : tab)
		{
			System.out.println(" " + str);
		}
		
		
		
		
		
		System.out.println("Contenue de ma liste ");
		
	     myList  = Arrays.asList(tab);
	     
	     System.out.println(myList);
	     
	     
	     
	     
	     
	     
	     System.out.println("contenu de ma list modifier ");
	     
	     myList.add("E");
	     
	     /*
	     System.out.println(myList);
			for(String str : tab)
			{
				System.out.println(" " + str);
			}
		
		*/
		
	/*
		
			LinkedList i = new LinkedList();
		i.add("hello");
		i.add("world");
		i.add(2, 12);
		
			System.out.println(i.get(0) + " " + i.get(1) + " " + i.get(2));
			System.out.println("la taille de mon tableau est : " + i.size());
			
		i.remove(1);
			
			System.out.println(i);
	*/

	}

}
