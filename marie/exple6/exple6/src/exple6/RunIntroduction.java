package exple6;

public class RunIntroduction {

	public static void main(String[] args) {
        /*Animal animalTiti = new Animal("titi", 2);
        animalTiti.parler();
        Animal animalMinet = new Animal("Gros minet", 4);
        animalMinet.parler();
        Animal.afficherNombreDAnimaux();*/
		
		
		String animal;
		Animal animalTiti = new Animal ("titi", 2); 
		String titi = animalTiti.FormulerMonNom();
		System.out.println(titi);
		animalTiti.parler();
		Animal animalGrosMinet = new Animal ("Gros Minet", 4);
		animalGrosMinet.parler();
		Animal.afficherNombreDAnimaux();
		
				
	
}
		
}

	

