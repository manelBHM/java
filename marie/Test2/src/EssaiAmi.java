
public class EssaiAmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Personne personneSeule;
		personneSeule = new Personne("Suzanne");
		Personne ami1 = new Personne("Olivier");
		Personne ami2 = new Personne("Marc");
		System.out.println(personneSeule.toString());
		System.out.println(ami1.toString());
		System.out.println(ami2.toString());
		
		/*System.out.println(personneSeule + "n'a pas d'ami");
		System.out.println(ami1 + "a pour ami " + ami2);
		System.out.println(ami2 + "a pour ami " + ami1);*/
	}

}

