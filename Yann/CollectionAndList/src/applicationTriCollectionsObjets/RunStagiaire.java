package applicationTriCollectionsObjets;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;



public class RunStagiaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	    List <Stagiaire> stagiaireList = new ArrayList<Stagiaire>();
		
	    stagiaireList.add(new Stagiaire(1, "Curtis Jackson", 45));
	    stagiaireList.add(new Stagiaire(3, "Luther King jr", 120));
	    stagiaireList.add(new Stagiaire(4, "Nelson Mandela", 90));
	    stagiaireList.add(new Stagiaire(2, "Cacius Clay", 70));
	    stagiaireList.add(new Stagiaire(5, "Didier Drogba", 39));
	    stagiaireList.add(new Stagiaire(1, "test id one", 122));
	    stagiaireList.add(new Stagiaire(2, "test id two", 18));
	    
	    
	    System.out.println("Liste Afficher avec toString ==> ");
	    System.out.println("");
	    System.out.println(stagiaireList.toString());
	    System.out.println("");
	    
	    
	    
	    System.out.println("Liste Original ==>");
		System.out.println("");
		
		
		for(Stagiaire str : stagiaireList)
		{
	       System.out.println(str);
		}
		
		
		System.out.println("");
		
		
		
		 System.out.println("Liste Triée par Ages ==>");
			System.out.println("");
			
			Collections.sort(stagiaireList, Stagiaire.ageComparator);
			
			for(Stagiaire str : stagiaireList)
			{
		       System.out.println(str);
			}
			
			System.out.println(""); 
			
			
			
			 System.out.println("Liste Triée par Id ==>");
				System.out.println("");
				
				Collections.sort(stagiaireList, Stagiaire.idComparator);
				
				for(Stagiaire str : stagiaireList)
				{
					 System.out.println(str);
				}
				
	
				System.out.println("");
				
				 System.out.println("Liste Triée par les Noms ==>");
					System.out.println("");
					
					Collections.sort(stagiaireList, Stagiaire.nameComparator);
					
					for(Stagiaire str : stagiaireList)
					{
				       System.out.println(str);
					}
				

	}

}
