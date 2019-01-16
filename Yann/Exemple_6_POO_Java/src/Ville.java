public class Ville {
	
	// Définition des propriétés de l'objet
	
	  public String nomVille;
	  protected static String chaine;
	  protected int  nmbreHabitant;
	  
	  
	
	// Constructeur avec deux paramètres 
	  
	 public Ville(String nomVille, int nmbreHabitant) {
		 
			super(); // appel du constructeur parent
			
			this.nomVille= nomVille;
			this.nmbreHabitant= nmbreHabitant;
		 
	 }
	 
	  
	 
	// Constructeur avec un paramètres 
	 
	 
	 public Ville(String nomVille) {
		 
			super(); // appel du constructeur parent
			
			this.nomVille= nomVille;
	 }
	 
	 
	 
	 
		// Définition de la methode presenteToi constructeur Ville.
		 
		 public String presenteToi() 
		 {
			
			
			 if(nmbreHabitant>0){chaine = "Ville "+ nomVille + " nombre d'habitants = " + nmbreHabitant;}
			 
			 else {chaine = "Ville "+ nomVille + " nombre d'habitants inconnu ";}
			 
			 return chaine;
			 
		 }
	 
	  
	 
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
		Ville nice = new Ville("nice", 150000);
		Ville panam = new Ville("panam");
		
	
		System.out.println(nice.presenteToi());
		System.out.println(panam.presenteToi());
		
		
*/
	}

}
