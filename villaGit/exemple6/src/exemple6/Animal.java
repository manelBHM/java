package exemple6;

public class Animal {

	
	
	private static int nbreAnimal = 0;
	
	protected String nomAnimal ;
	private int nbrePatte= 0; 
	
	// constructeur 
	public Animal(String nomAnimal , int nbrePatte) 
	{
		this.nomAnimal= nomAnimal;
		this.nbrePatte = nbrePatte;
		nbreAnimal ++ ;
		
	}
	
	
	// methode objet  recupere nom 
	private String FormulerMonNom () {
		
		return " je m'appelle " + this.nomAnimal;
		
	}
	
	// methode objet 
	
	public void parler() {
		
		System.out.println(this.FormulerMonNom()+"");
		System.out.println("Je suis un animal et j'ai "+ this.nbrePatte+" pattes");
	}
	
	// methode classe affiche nbre de pattes 
	public static void afficheNbreAnimaux() {
		
		System.out.println("#####################################");
		System.out.println(" il y a en total : "+ nbreAnimal);
	}
	
}
