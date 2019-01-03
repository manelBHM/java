
public enum Jour {

	 LUNDI, MARDI, MERCCRDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE;
	
	static void action(String nom) {
		try {
			Jour jour = Jour.valueOf(nom);
			switch (jour) {
			case SAMEDI:
			case DIMANCHE:
				System.out.println("seRepose");
				break;

			default:
				System.out.println("Travailler");
			break;
			
			}
	} catch (IllegalArgumentException e) {
			System.out.println("Nom de jour incorrect "+ e.getMessage());
		}
	}

	public static void main(String[] args) {
		Jour.action("LUNDI");
		Jour.action("mardi");
		Jour.action("SAMEDI");
		Jour.action("JEUDI");
	
	}
}
