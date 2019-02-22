import java.util.ArrayList;

public class Etudiant {

	public static void main(String[] args) {
		
		ArrayList<String> ET = new ArrayList<String> ();
		
		ET.add("Francoi");
		ET.add("juliette");
		ET.add("Danil");
		ET.add("Jack");
		ET.add("Patric");
		ET.add("Frank");
		
		System.out .println(ET);
		
		
		ET.remove(0);
		ET.remove(3);
		
		System.out .println(ET);
		
		ET.remove(2);
		System.out .println(ET);
		
		for(String str:ET) {
			System.out .println(str);
		}
		
		
	}

}
