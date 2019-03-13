public class Loup extends Animal {

	public Loup(int poids, String couleur, String nom){
		
		super(poids, couleur, nom);
		
	}
	
	
	
	protected void deplacement() 
	{
		
		System.out.println("Deplacement: Les loups se deplacent en meutent");
		
	}
	
	
	
	protected void crie() 
	{
		System.out.println("Crie: Grognement");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Animal loup = new Loup (19, "blanche", "loup");
		
	System.out.println("--------------------------------------------------- Déscription ------------------------------------------------\n");
	loup.getNom();
	loup.poids();
	loup.couleur();
	loup.crie();
	loup.deplacement();
	System.out.println("\n--------------------------------------------------- Présentation ------------------------------------------------\n");
	loup.presentation(); 
 

	}

}
