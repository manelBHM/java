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
		
		System.out.println("Crie: Grogne");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Animal loup = new Loup (19, "gris blanc", "loup");
		
	loup.nom();
	loup.poids();
	loup.couleur();
	loup.crie();
	loup.deplacement();
	System.out.println("\n****************************************************** Présentation ********************************************");
	loup.presentation(); 
	

	}

}
