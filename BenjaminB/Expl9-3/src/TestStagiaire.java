import java.util.ArrayList;
import java.util.Collections;

public class TestStagiaire extends Stagiaires {

	public TestStagiaire(String nom, int age, int id) {
		super(nom, age, id);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Stagiaires> al = new ArrayList<Stagiaires>();
		Stagiaires stagiaire1 = new Stagiaires("Tonny.S", 48, 001);
		Stagiaires stagiaire2 = new Stagiaires("James.B", 37, 007);
		Stagiaires stagiaire3 = new Stagiaires("Lucifer.A", 999999999, 666);
		Stagiaires stagiaire4 = new Stagiaires("Rocco.S", 69, 714);
		al.add(stagiaire1);
		al.add(stagiaire2);
		al.add(stagiaire3);
		al.add(stagiaire4);
		for(Stagiaires x : al) {
			System.out.println(x.toString());
		}
System.out.println("____________________________________");
System.out.println("____________________________________");
		Collections.sort(al, Stagiaires.ageComparator);
		for(Stagiaires x : al) {
			System.out.println(x.toString());
		}
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		System.out.println("____________________________________");
		Collections.sort(al, Stagiaires.nomComparator);
		for(Stagiaires x : al) {
			System.out.println(x.toString());
		}
	}

}
