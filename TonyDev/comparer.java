import java.util.Scanner;

		public class comparer 
	{
			public static void main (String[] args)
			{ 
			// 1ere application \\
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Veuillez saisir un nombre entier pour l'application 1");
				int nbre = sc.nextInt();
				System.out.println("Veuilelz saisir un deuxieme nombre entier pour l'application 1");
				int nbre4= sc.nextInt();
				
				
				if (nbre < nbre4)	
				System.out.println(nbre);
				
				else if (nbre == nbre4)
				System.out.println("probleme les nombres sont egaux");
				
				else
				System.out.println(nbre4);
				
				
			
			
			//2eme application \\
			
				Scanner scp = new Scanner(System.in);
				System.out.println("Veuillez saisir un nombre entier pour l'application 2");
				int nbre1 = scp.nextInt();
		
				if (nbre1 > 0)
				System.out.println("le chiffre est positif");
				
				else if (nbre1 == 0)
				System.out.println("le chiffre est nul");
					
				else
				System.out.println("le chiffre est négatif");
			
			
			// 3eme application \\
				Scanner scd = new Scanner(System.in);
				System.out.println("Veuillez saisir un nombre entier pour l'application 3");
				int nbre3 = scd.nextInt();
						
				if ((nbre3 >= 50) && (nbre3 <= 100))
				System.out.println("Le nombre est comprit entre 50 et 100");
				
				else if (nbre3 > 100)
				System.out.println("Le nombre est comprit au dessu de 100");
				
				else 
				System.out.println("Le nombre est en dessou de 50");
			}	
			
			
			
	}
		