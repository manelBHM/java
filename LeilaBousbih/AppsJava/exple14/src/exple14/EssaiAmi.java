package exple14;

public class EssaiAmi {

	public static void main(String[] args) {
		
		Personne personneSeule = new Personne("Suzanne");
	   
		Personne p1 = new Personne ("Marc");
		Personne p2 = new Personne ("Francois", p1);
		
		// Personne p3 = new Personne ("Marc", p2);
		
		p1.setAmi(p2);
		System.out.println(personneSeule.toString());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
	}

}
