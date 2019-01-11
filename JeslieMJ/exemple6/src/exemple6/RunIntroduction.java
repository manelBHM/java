package exemple6;


public class RunIntroduction {
	public static void main(String[]args) {
		Animal animalTiti = new Animal("titi",2); // création animal
		animalTiti.parler(); //appel d'une méthode d'instance
		Animal animalMinet = new Animal("Gros minet", 4); //création animal
		animalMinet.parler(); //appel d'une méthode d'instance
		Animal.afficherNombreDAnimaux(); // appel d'une methode de classe
	
	}

}
