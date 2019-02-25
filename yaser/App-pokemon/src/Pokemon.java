import java.util.ArrayList;

public class Pokemon {
	 String name;
	    int pv;
	    static int nbrepoke = 0;
	    
	    
		public Pokemon(String name, int pv) {
			super();
			this.name = name;
			this.pv = pv;
			nbrepoke++; 
		}
	  
	static void afficher(Pokemon a) {        
	
	 
	     
	  System.out.println("Je suis " + a.name + ", j'ai " + a.pv + " points de vie.");
	
	    }
	
	
	static void combat(Pokemon a, ArrayList<Pokemon> list) {       
		for (Pokemon element : list) {
        
        if (a.pv > element.pv) {

   System.out.println("Je suis plus fort que " + element.name + ".");
}
        else if (a.pv < element.pv) {

    System.out.println("Je suis moins fort que " + element.name + ".");
} 
        else if (a.pv == element.pv && a.name != element.name) {

   System.out.println("Je suis de force égale à " + element.name + ".");
}
}    }
}

	  
	    
	  


