import java.util.ArrayList; 
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class StagiaireMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Stagiaire> ls = new ArrayList<Stagiaire>();
		
		Stagiaire s1 = new Stagiaire(225, "Jean.L", 25);
		Stagiaire s2 = new Stagiaire(100,"Franck.D",27);
		Stagiaire s3 = new Stagiaire(220, "Alain.J",20);
		Stagiaire s4 = new Stagiaire(150,"Victor.T", 22);
		
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		ls.add(s4);
		
		

		System.out.println("Liste orig");
		System.out.println("");


		
		Iterator<Stagiaire> it = ls.iterator();
	
		while (it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		System.out.println("");
		
		System.out.println("Liste Triée");
		System.out.println("");
		
		
		Collections.sort(ls,Stagiaire.idComparator); for(Stagiaire str:ls){
			System.out.println(str); }
		
	}
	
	
	
	



}
