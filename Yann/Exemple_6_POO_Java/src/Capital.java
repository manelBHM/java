
public class Capital extends Ville{
	
	private String nomPays;
	
	
	// Premier Constructeur

	public Capital(String nomVille, int nmbreHabitant, String nomPays)
	
	{
		super(nomVille, nmbreHabitant);
		this.nomPays= nomPays;
		
		// TODO Auto-generated constructor stub
	}
	
	// Deuxième Constructeur 
	
	
public Capital(String nomVille, int nmbreHabitant)
	
	{
		super(nomVille, nmbreHabitant);
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
// Methode presente toi de la Class Capital

//Définition de la methode presenteToi constructeur Ville.

		 public String presenteToi() 
		 {
			
			String chaine = super.presenteToi();
			
			if(nomPays==null) {chaine=chaine + ", Pays inconnu ";}
			else {chaine = chaine +", Capitale de " + nomPays;}
			 return chaine;
			 
		 }

	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		Capital Londre = new Capital("Londre", 150000, "Angleterre");
		Capital Paris = new Capital("Paris", 200000000);
		
	
		System.out.println(Londre.presenteToi());
		System.out.println(Paris.presenteToi());
*/
	}

}
