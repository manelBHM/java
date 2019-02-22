import java.util.ArrayList;

import javax.lang.model.element.Element;

public class TestPokemon {

	
	  
	  
	public static void main(String[] args) {
		
		
		
		 ArrayList<Pokemon>list=new ArrayList<Pokemon>();
	        
	        Pokemon a=new Pokemon("charizard",100);
	          
	        Pokemon b=new Pokemon("blastoise",200);
	           
	        Pokemon c=new Pokemon("venusaur",300);
	          
	        Pokemon d=new Pokemon("d",400);
	           
	           
	           list.add(a);
	           list.add(b);
	           list.add(c);
	           list.add(d);
	           
	       	System.out.println("Nombre de Pokemons actuel : " +Pokemon.nbrepoke+"\n");
	        
	        Pokemon.afficher(a);
	        Pokemon.combat(a,list);
		
	        System.out.println("\n ");
	        
	        Pokemon.afficher(b);
	        Pokemon.combat(b,list);
	        
 System.out.println("\n ");
	        
	        Pokemon.afficher(c);
	        Pokemon.combat(c,list);
	        
System.out.println("\n ");
	        
	        Pokemon.afficher(d);
	        Pokemon.combat(d,list);
	        
 
	        
		
		
		
		
		
		
		
		
		
		
		
		    
		   
		    
	}


	  }	