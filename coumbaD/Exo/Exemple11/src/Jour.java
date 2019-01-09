 public enum Jour {
	LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE;
	
	static void action(String nom)
	{
		try {
Jour jour = Jour.valueOf(nom);

switch(jour)
{
case SAMEDI:
case DIMANCHE:
    System.out.println("SeReposer");

break;
    default:
    System.out.println("travailler");

	}

 class EssaiJour
{ 
	public static void main(String[] args) { 
		
	
	}
		 
			  Jour.action("LUNDI");
	} catch (ClassCastException e) {
			  Jour.action("mardi");
		  }
		  finally{
			  Jour.action("SAMEDI");
		  }
}
}