package exple6;

public class Animal {

	
		// TODO Auto-generated method stub
    private static int totalAnimal = 0;
    protected String nom;
    private int nombreDePatte;
    public Animal(String nom, int nombreDePatte) {
    	super();
    	this.nom = nom;
    	this.nombreDePatte = nombreDePatte;
    	totalAnimal++;
    }
    
    private String formulerMonNom() {
     return "Je m'appelle " + this.nom;
    }
    
    public void parler() {
    	System.out.println(this.formulerMonNom());
    	System.out.println("Je suis un animal et j'ai " + this.nombreDePatte + "pattes");
    }
    
    public static void afficherNombreDAnimaux() {
    System.out.println("************");
    System.out.println("Il y a " + totalAnimal + " animaux");
    }
    
    

}
    
	

