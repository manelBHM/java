
  public abstract class Animal {
	
	protected int poids;
	protected String couleur, nom;
	
	
	public Animal(int poids, String couleur, String nom)
	{
		super();
		this.poids=poids;
		this.couleur=couleur;
		this.nom=nom;
	}
	
	
	
	public String manger()
	{
		return "Mange de la viande";
	}
	
	
	
	public String boire()
	{
		return "Bois de l'eau";
	}
	
	
	
	
	
	public void couleur()
	{
		System.out.println("Couleur: " + couleur);
	}
	
	
	
	public void poids()
	{
		
		System.out.println("Poids: " +  poids + " kg");
	}
	
	
	
	public void nom()
	{
		
		System.out.println("nom: " + nom);
	}
	
	
	
	public void presentation()
	{
		System.out.println("Je suis un Animal de type " + nom +  " de la ==> " + this.getClass() +  " je suis de couleur " + this.couleur + " je pèse " + this.poids + " kg"  + " je " + manger() + " et je " +  boire());
	}
	
	 protected abstract void deplacement();
	 protected abstract void crie();
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
