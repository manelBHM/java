import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestStagiaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Stagiaire> s1 = new ArrayList<Stagiaire>();
		
		s1.add(new Stagiaire(100,"Patrick",18));
		s1.add(new Stagiaire(50,"Jean",19));
		s1.add(new Stagiaire(300,"Leo",19));
		s1.add(new Stagiaire(6,"Thoma",20));
		
		for(Stagiaire str:s1) {
		System.out.println(str);	
		}
		
		System.out.println(s1.toString());
		
		
		Collections.sort(s1, Stagiaire.idComparator);
		System.out.println("liste par id : ");
		for(Stagiaire str:s1) {
			System.out.println(str);	
			}
		
		System.out.println("Liste par age : ");
		Collections.sort(s1, Stagiaire.ageComparator);
		for(Stagiaire str:s1) {
			System.out.println(str);	
			}
		
		System.out.println("Liste par nom : ");
		Collections.sort(s1, Stagiaire.nomComparator);
		for(Stagiaire str:s1) {
			System.out.println(str);	
			}
	
	}

}
