import java.util.Scanner;

public class EssayAmi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Personne1 personneSeule = new Personne1("Nala");
		Personne1 ami1 = new Personne1("Poumba");
		Personne1 ami2 = new Personne1("Simba", ami1);
		ami1.setAmi(ami2);

		System.out.println(personneSeule);
		System.out.println(ami1);
		System.out.println(ami2);

	}

}
