package personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne personneSeule, ami1, ami2;
		
		
		 personneSeule = new Personne("Suzanne");
		 
		ami1 = new Personne("Lucky");
		
		 ami2 = new Personne("Ships",ami1);
		
		 ami1.setAmi(ami2);

	     
		    System.out.println(personneSeule.toString()+'\n');
		     System.out.println(ami1.toString()+'\n');
		     System.out.println(ami2.toString());
	}

}
