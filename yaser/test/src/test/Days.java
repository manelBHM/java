package test;


	
	
	enum Jour {
		LUNDI,MARDI,MERCREDI,JEUDI,VENDREDI,SAMDI,DIMANCHE;
	
	
		
	
	static void action (String nom) {
		try {
			Jour jour =Jour.valueOf(nom);
			switch(jour){
				case SAMDI:
				case DIMANCHE:
					System.out.println("seReposé");
					
					break;
					default:
						System.out.println("travailler");	
			}}	
			catch( Exception e){
				System.out.println("uninclud");
			}
		
		
		
	}
	
	}
	

	


	
	
	
	
	
public class Days {
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		Jour.action("LUNDI");
		Jour.action("mardi");
		Jour.action("DIMANCHE");
		
		
	}

}
