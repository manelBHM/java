package list;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;

public class CollectionExo {

	
	public static void trier(final List<String> x)
	{
		Collections.sort(x);	 
	}
	
	public static void trierReverse(final List<String> x)
	{ 
		Collections.reverse(x);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
List<String> liste = new ArrayList<String>();
		
		
		liste.add("Red");
		liste.add("Green");
		liste.add("Orange");
		liste.add("White");
		liste.add("Black");
		
	
		System.out.println("Liste initiale : " + liste);
		System.out.println("");

	 
         trierReverse(liste);
         
         System.out.println("Liste triée en ordre decroissant : " + liste);
         
         System.out.println("");
         
         
         
         
         
 		
                List<String> sousListe = liste.subList(2, 5);
                 
        	        System.out.println("sous liste initial : " + sousListe);
        	    	System.out.println("");
        	    	
        	    	
        	         trierReverse(sousListe);
        	         
          	        System.out.println("sous liste trié en ordre decroissant : " + sousListe); 
          	        System.out.println("");
   	    	
          	       
          	        
          	        
        	    	sousListe.add("White");
        	    	sousListe.add("Pink");
        	    	sousListe.add("Yellow");
        	    	
       
          
         	     
        	      System.out.println("sous liste modifier avec nouveau element add : " + sousListe);
        	    
        	      
        	       trierReverse(sousListe);
        	       System.out.println("");
        	       
        	       System.out.println("sous liste trié en ordre decroissant : " + sousListe); 
        	       
        	       
        	       
    
	}
	

}
