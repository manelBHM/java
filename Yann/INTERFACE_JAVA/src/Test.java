import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int depot, retrait, answer;
		String nom;
		
		Scanner exc = new Scanner(System.in);
		
		System.out.println("Veuillez renseignez votre nom");
		
		nom = exc.nextLine();
		
		Compte c3 = new Compte(nom, 0);
		
		
		System.out.println("Bonjour monsieur "+ nom + " votre solde est : " + c3.consulterSolde() + " euros \n");
		
		
		System.out.println("Voulez vous faire un depot sur votre compte 1 pour oui / 2 pour non\n");
	     depot = exc.nextInt();
		
		
		// Deposer sur le compte 
	     
	     if(depot == 1) {
	    	 
	    	 System.out.println("Veuillez indiquez la somme à deposer \n");
	 		 depot = exc.nextInt();
	 		
		((Compte) c3).deposer(depot);
		
		System.out.println("\nTitulaire du compte: " + c3.titulaire +'\n');
		
		System.out.println("Depot: " + depot + " euro\n");
		
		System.out.println("New Solde: " + c3.consulterSolde()+" euro\n");
		
	     }
		
		// Retire de l'argent du compte
		
		System.out.println("Voulez vous effectuez un retrait 1 pour oui / 2 pour non\n");
		answer = exc.nextInt();
		
		
		
		if(answer == 1)
		
		{
		System.out.println("Entrez la somme a retirer\n");
		retrait = exc.nextInt();
		
		((Compte) c3).retirer(retrait);

		
        System.out.println("Retrait: " + retrait + " euro\n");
		
		System.out.println("New Solde:" + c3.consulterSolde() + " euro\n");
		
		System.out.println("A bientôt monsieur " + nom);
		
		}
		
		else {
			System.out.println("A bientôt monsieur " + nom);
		}

	}

}
