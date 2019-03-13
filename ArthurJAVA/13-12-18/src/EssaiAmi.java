
public class EssaiAmi {

	public static void main(String[] args) {

	    
		
		Personne personneSeule = new Personne("Suzane");
		Personne ami1 = new Personne("Olivier");
		Personne ami2 = new Personne ("Marc",ami1);
		
		ami1.setAmi(ami2);
		//ami2.setAmi(ami1);
		
		
		

		
		
		System.out.println(personneSeule);
		System.out.println(ami1);
		System.out.println(ami2);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
