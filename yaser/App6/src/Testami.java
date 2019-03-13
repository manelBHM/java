
public class Testami {

	public static void main(String[] args) {
		
		Personne Personnesoul = new Personne("suzane");
		Personne ami1 = new Personne("marc");
		Personne ami2 = new Personne("francois",ami1);
		ami1.setPersonne(ami2);
		
	   System.out.println(Personnesoul.toString());
	   System.out.println(ami1.toString());
	   System.out.println(ami2.toString());

	}

}
