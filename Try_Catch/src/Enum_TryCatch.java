enum Jour {
	LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE;

	static void action(String nom) {
		try {
			Jour jour = Jour.valueOf(nom);
			switch (jour) {
			case SAMEDI:
			case DIMANCHE:
				System.out.println("Se reposer");
				break;
			default:
				System.out.println("Travailler");
				break;
			}
			// catch excption
		} catch (Exception e) {
			System.out.println("Jour incorrect :( " + e.getMessage());
		}
	}
}

public class Enum_TryCatch {
	public static void main(String[] args) {
		Jour.action("mardi");
		Jour.action("LUNDI");
		Jour.action("DIMANCHE");
	}
}
