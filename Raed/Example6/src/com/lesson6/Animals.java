package com.lesson6;



	
public  class Animals {
		// propriété de la classe
		private static int totalNumber = 0;
		// propriétés de l'objet
	    protected String nom;
	    private int nombreDePatte;
	    
	    // cAnimalscteur
		public Animals(String nom, int nombreDePatte) {
			super();
			this.nom = nom;
			this.nombreDePatte = nombreDePatte;
			totalNumber++;
			
		}
		  // une methode de l'objet
		  private String formulerMonNom() {
	          return "Je m'appelle " + this.nom; // appel de la propriété nom
	  }
		  
	      // une methode de l'objet
	      public void parler() {
	              System.out.println(this.formulerMonNom()); // appel d'une méthode de l'objet
	              System.out.println("Je suis un animal et j'ai " + this.nombreDePatte + " pattes");
	      }
	      // une methode de la classe
	      public static void afficherNombreDAnimaux() {
	              System.out.println("**************************");
	              System.out.println("Il y a " + totalNumber + " animaux");
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated methodAnimals		
        Animals AnimalslTiti = new Animals("titi", 2); // creation animal
        AnimalslTiti.parler(); // appel d'une méthode dAnimalsnce
        Animals AnimalslMinet = new Animals("Gros minet", 4); // creation animal
        AnimalslMinet.parler(); // appel d'une méthode Animalsance
        Animals.afficherNombreDAnimaux(); // appel d'une méthode de classe		

	}

}
