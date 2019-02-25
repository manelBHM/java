
public class EssaiAmi {

	public static void main(String[] args) {

		Personne personneSeule = new Personne("Suzy");
		Personne Marc = new Personne("Marc");
        Personne Olivier = new Personne("Olivier", Marc);
        
        
        System.out.println(personneSeule.toString());
        System.out.println(Olivier.toString());
        Marc.setAmi(Olivier);
        System.out.println(Marc.toString());
	}

}
