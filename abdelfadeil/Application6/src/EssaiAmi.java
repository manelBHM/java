
public class EssaiAmi {

	public static void main(String[] args) {
		//Personne personneSeule;
		//Personne  ami1;
		//Personne ami2 = null;

		Personne personneSeule = new Personne("Tom");
		Personne ami1 = new Personne("Adam");
		Personne ami2 = new Personne("Hugo");
		
         ami1.setAmi(ami2);
         ami2.setAmi(ami1);
		
		System.out.println(personneSeule);
		System.out.println(ami1); 
		System.out.println(ami2);
	}

}
