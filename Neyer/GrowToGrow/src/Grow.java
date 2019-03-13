import java.util.Scanner;

public class Grow {
	
	int nbEmploye;
	int capital;
	int endettement;
	int chiffreAffaire;
	int deficite;
	int nbAnne;
	
	public void creation() {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Vous êtes prêt à devenir votre propre patron ?");
		System.out.println("J'espère que vous êtes ambitieux et avez un moral à toute épreuve ! ");
		System.out.println("Parcque il vous en faudra beaucoup !");
		
		System.out.println("Choisissez votre difficulté : " + "\n"+"1 - Patron "+"\n"+"2 - Salarié"+"\n"+"3 - Stagiaire");
		int difficulte = sc.nextInt();
		
		System.out.println("Quel sera le nom de votre Startup : ");
		
		String entreprise = sc.nextLine();
		
		System.out.println(entreprise);
		
		
		
	}
	
}
