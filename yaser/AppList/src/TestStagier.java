import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStagier {

	public static void main(String[] args) {
		
		
		
	
		ArrayList<Stagiaire> l = new  ArrayList<Stagiaire>();
		
		l.add(new Stagiaire(225,"Jaen.L",25));
		l.add(new Stagiaire(100,"Frank.D",27));
		l.add(new Stagiaire(220, "Alain.J",20));
		l.add(new Stagiaire(150,"Victor.T",22));
		
	System.out .print(l);
	
	System.out .print("---------------\n");
		 

	Collections.sort(l,Stagiaire.idCom);
	
	for(Stagiaire st: l) {
		System.out.println(st.toString());
	}
	
	System.out .print("---------------\n");
		
Collections.sort(l,Stagiaire.ageCom);
	
	for(Stagiaire st: l) {
		System.out.println(st.toString());
	}
		

	
	System.out .print("---------------\n");
Collections.sort(l,Stagiaire.nomCom);
	
	for(Stagiaire st: l) {
		System.out.println(st.toString());
	}
	
	}

}
