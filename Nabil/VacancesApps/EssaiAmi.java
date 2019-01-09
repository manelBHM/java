package Application_Vacances;

public class EssaiAmi {
	
	
	static Personne personneSeule = new Personne("Julien");
	
	static Personne ami1 = new Personne("Arthur");
	
	static Personne ami2 = new Personne (ami1, "Kevin");
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ami1.setami(ami2);
		
		personneSeule.afficher();
		ami1.afficher();
		ami2.afficher();
		

	}

}
