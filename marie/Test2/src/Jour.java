
enum Jour {
	LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE;
		static void action(String nom) {
			
			try {
			Jour jour = Jour.valueOf(nom);
			switch(jour) {
			case SAMEDI:
			case DIMANCHE:
				System.out.println("se reposer");
			break;
			default:
				System.out.println("travailler");}}
				catch(java.lang.IllegalArgumentException e) {
					System.out.println("mot Illegale" + e.getMessage());
}
				finally {
					System.out.println("");
				}
}
}


	class EssaiJour{
		public static void main(String[] arg) {
			Jour.action("LUNDI");
			Jour.action("mardi");
			Jour.action("SAMEDI");
			
		}
	}