package etudiant;
import java.util.Scanner;
public class TestEtudiant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Saisissez le nom de l'etudiant au travail : ");
		String name1= sc.nextLine();
		System.out.print("Saisissez le nom de l'etudiant au repos : ");
		String name2= sc.nextLine();
		Etudiant etudiant1 = new Etudiant(name1);
		Etudiant etudiant2 = new Etudiant(name2);
		
		etudiant1.travailler();
		etudiant2.seReposer();
	}

}
