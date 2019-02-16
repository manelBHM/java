import java.util.Scanner;

public class PlayPendu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		char tableau[]= {'a', 'e', 'i', 'o', 'u'};
		
		
		System.out.println("Rentrez une lettre en miniscule, SVP");
		
		char answer;
		 
		
		
			do {
				
			
					answer= sc.nextLine().charAt(0);
					
					switch (answer)
					
			
			{
			
			case 'a':
			
				System.out.println("La lettre saisir se trouve bien dans le tableau a l'indice 0 \n Voulez vous essayer a nouveau ? (y/n)");
				break;
				
			case 'e':
				System.out.println("La lettre saisir se trouve bien dans le tableau a l'indice 1 \n Voulez vous essayer a nouveau ? (y/n)");
				break;
				
			case 'i':
				System.out.println("La lettre saisir se trouve bien dans le tableau a l'indice 2 \n Voulez vous essayer a nouveau ? (y/n)");
			break;
			
			case 'o':
				System.out.println("La lettre saisir se trouve bien dans le tableau a l'indice 3 \n Voulez vous essayer a nouveau ? (y/n)");
				break;
				
				
			case 'u':
				System.out.println("La lettre saisir se trouve bien dans le tableau a l'indice 4 \n Voulez vous essayer a nouveau ? (y/n)");
				break;
				
			
			case 'n':
				System.out.println("Au Revoir !");
				break;
			
				

				default :
					System.out.println("La lettre " + answer + " ne se trouve pas dans le tableau \n Rentrez une lettre en miniscule, SVP" );
					break;
			}
				
			
			}while(answer!='n');
	
		
		
		

	}

}
