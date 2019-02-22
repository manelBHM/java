public class Lion extends Animal {
	
	public Lion(int poids, String couleur, String nom){
		
		super(poids, couleur, nom);
		
	}
	
	
	
	protected void deplacement() 
	{
		
		System.out.println("Deplacement: Les lions se deplacent en meutent");
		
	}
	
	protected void crie() 
	{
		
		System.out.println("Crie: Rugissement");
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal lion = new Lion (24, "jaune or", "lion");
		
		lion.nom();
		lion.poids();
		lion.couleur();
		lion.crie();
		lion.deplacement();
		System.out.println("\n****************************************************** Présentation ********************************************");
		lion.presentation(); 

	}

}
