package project1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Exo_TeacherduNet {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
	    al.add(12);
	    al.add("Une chaîne de caractères !");
	    al.add(12.20f);
	    al.add('d');
	                
	    for(int i = 0; i < al.size(); i++)
	    {
	      System.out.println("donnée à l'indice " + i + " = " + al.get(i));
	    } 
		  }
		
}
