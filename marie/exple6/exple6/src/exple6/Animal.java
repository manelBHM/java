package exple6;

public class Animal {

	private static int totalAnimal = 0;
	protected String nom;
	private int nombreDePatte;
	
	
	public Animal(String nom, int nombreDePatte) {
	super();
	this.nom = nom;
	this.nombreDePatte = nombreDePatte;
	totalAnimal ++;
}

	public String FormulerMonNom() {
	return "Je m'appelle" + this.nom;	
	}
	
		public void parler() {
			System.out.println(this.FormulerMonNom());
			System.out.println("Je Suis un animal et j'ai " + this.nombreDePatte + "pattes");
		}
		

        public static void afficherNombreDAnimaux() {
                System.out.println("**************************");
                System.out.println("Il y a " + totalAnimal + " animaux");
}

       /* public static void main(String[] args) {
                Animal animalTiti = new Animal("titi", 2); 
                animalTiti.parler();
                Animal animalMinet = new Animal("Gros minet", 4); 
                animalMinet.parler(); 
                Animal.afficherNombreDAnimaux();
 }*/}
        
        
        
        