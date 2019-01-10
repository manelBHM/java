public class Animal {
	
    // propriété de la classe
	private static int totalAnimal = 0;
	// propriété de l'objet
	protected String nom;
	private int nombreDePatte;
	
	public Animal(String nom, int nombreDePatte) {
		super();
		this.nom = nom;
		this.nombreDePatte = nombreDePatte;
		totalAnimal++;
	}
	String formulerMonNom() {
		return "Je m'appelle " + this.nom;	
	}
	
    public void parler() 
    {
        System.out.println(this.formulerMonNom()); 
        System.out.println("Je suis un animal et j'ai " + this.nombreDePatte + " pattes");
    }
    public static void afficherNombreDAnimaux () 
    {
		System.out.println("*************************");
		System.out.println("Il y a " + totalAnimal + " animaux");
	}
	
/*
public static class RunIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animalTiti = new Animal("titi", 2);
		animalTiti.parler();
		Animal animalMinet = new Animal("Gros minet",4);
		animalMinet.parler();
		Animal.afficherNombreDAnimaux();
	}

} */

	}
		
	

