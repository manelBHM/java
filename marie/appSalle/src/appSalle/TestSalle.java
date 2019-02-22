package appSalle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

public class TestSalle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Salle> ss = new ArrayList<Salle>();
		ss.add(new Salle(1, "A", "Salle 1"));
		ss.add(new Salle(2, "B", "Salle 2"));
		ss.add(new Salle(3, "C", "Salle 3"));
		ss.add(new Salle(4, "D", "Salle 4"));

		  Collections.sort(ss, Salle.ComparatorId);
		  System.out.println("Liste de salle");
		  for(Salle e:ss)
		   System.out.println(e);
		  System.out.println(" ");
		  
		  System.out.println("Suppression d'une salle");
		  ss.remove(0);
		  for(Salle e:ss)
			   System.out.println(e);
		  System.out.println(" ");
		  System.out.println("Donner un code");
		  int a = sc.nextInt();
		  
		  //ss.set(0, "A");
		  
	      System.out.println("Changement du nom de la salle");
	      for(Salle e:ss)
	       System.out.println(e);
	}

}






























