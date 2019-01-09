bimport java.util.Scanner;

public class voyelle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println("Saisissez les différentes voyelles");
		
		 
		 char tableauCaractere[] = {'a','e','i','o','u','y'};
		 int 1 = 0; 
		 char reponse = ' ', carac = ' ';
		 
		 Scanner sc = new Scanner(System.in);
		 
		do {
		do {
		1 = 0;
				
		System.out.println("Rentrez une lettre présente de dans le tableau s'il vous plaît");
		
		carac = sc.nextLine().charAt(0);
		while (1 < tableauCaractere.length && carac != tableauCaractere[1])
		1++;
		if (1< tableauCaractere.length)
		System.out.println("La lettre " + carac+ "se trouve bien dans mon tableau !");
		else 
		System.out.println("La lettre " + carac+ " ne se trouve bien dans mon tableau !");
		}
		
	while (1>= tableauCaractere.length);
		do {
			System.out.println("Voulez vous essayer à nouveau ? (O/N)");
			reponse = sc.nextLine().charAt(0);
		}
		While (reponse != 'N' && reponse )
		
			
		
			

			 if (reponse != 'T' && reponse < 'T'){
		    System.out.println("La lettre ne se trouve pas dans le tableau");
		    System.out.println("Veuillez réessayer ?!");

		    }
		   else if (reponse != 'a','e','i','o','u','y' && reponse > 'a','e','i','o','u','y' {
		    System.out.println("La lettre ne se trouve pas dans le tableau");
		    System.out.println("Veuillez réessayer ?!");
		   }
		   else if (reponse = 'a')
			   System.out.println("Bonne réponse champion");
		   
		    else 
		    System.out.println("Parfait");
		   }
		 
		 while (reponse != 'a','e','i','o','u','y');



	private static boolean reponse(char a, char e, char i, char o, char u, char y) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
