package appCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class TestStagiaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Stagiaire> st = new ArrayList<Stagiaire>();
		//Stagiaire st1=new Stagiaire("Franck.L", 25, 224);
		st.add(new Stagiaire("Jean.L", 25, 225));
		st.add(new Stagiaire("Franck.D", 27, 100));
		st.add(new Stagiaire("Alain.J", 20, 220));
		st.add(new Stagiaire("Victor.T", 22, 150));
		
		System.out.println("Liste original");
		System.out.println(st.toString());;
		  
		System.out.println("\nliste trier selon l'age:");
	    Collections.sort(st, Stagiaire.ComparatorAge);
	    
	    	for(Stagiaire e:st)
		       System.out.println(e);
	
}
}


