import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {
		
		int billet1 = 5;
		int billet2 = 8;
		int billet3 = 4;
		
		System.out.println("Combien de personnes êtes vous ?");
		
		Scanner sc = new Scanner(System.in);

		int nbPersonne = sc.nextInt();
		
		for (int i =0; i<nbPersonne; i++) {
		
		
		System.out.println("Quel age avez vous ?");
				
		
		int age = sc.nextInt();
		
		if (age<=60 && age>=3) {
			
			System.out.println("Habitez vous a Montreuil ? 1 oui / 2 non");
			
			int x =sc.nextInt();
			
			switch (x) {
			
			case 1 : System.out.println("Le billet coute " + billet1 + " euro");
			break;
			
			case 2 : System.out.println("Le billet coute " + billet2 + " euro");
			}
		}
			
			else if (age<3) {
				
				System.out.println("Billet gratuit");
				
				
			}
		
			else if (age>60) {
				
				System.out.println("Le billet coute" + billet3 + " euro");
			}
		    
			else {
				System.out.println("Try again");
			}
		
		    
		}
		
		
		
	}
		
		
		
		
		
		
		
		
		
	}

	
	


