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
		
		
		System.out.println("Vous êtes monsieur "+ nom + " votre solde est de : " + c3.toInt() + " euros ");
		
		
		System.out.println("Deposer un montant sur votre compte");
	     depot = exc.nextInt();
		
		
		// Deposer sur le compte 
		
		((Compte) c3).deposer(depot);
		
		System.out.println("\nTitulaire du compte: " + c3.titulaire+'\n');
		
		System.out.println("Depot: " + depot + " euro\n");
		
		System.out.println("Solde: " + c3.toInt()+" euro\n");
		
		
		// Retire de l'argent du compte
		System.out.println("Vous vous faire un retrait oui 1 / non 2\n");
		answer = exc.nextInt();
		
		
		
		if(answer == 1)
		
		{
		System.out.println("Entrez la somme a retirer\n");
		retrait = exc.nextInt();
		
		((Compte) c3).retirer(retrait);

		
        System.out.println("Retrait: " + retrait + " euro\n");
		
		System.out.println("New Solde:" + c3.toInt());
		
		
		}
		
		
		/*
		((Compte) c3).deposer(depot);
		
		
		
		
		((Compte) c3).retirer(2000);
		System.out.println("Vous avez retire un montant de: " + 2000 + " euro ");
		
		System.out.println("Votre nouveau solde est: " + c3.toInt()+ " euro ");
		*/

	}

}
