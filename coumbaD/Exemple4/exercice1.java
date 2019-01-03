import java.util.Scanner;

public class exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int note;
		System.out.println("Entrez votre note :");
		
		note = sc.nextInt();
				
		switch (note) {
		
		case 1: case 2: case 3 : case 4 : case 5 : case 6 : case 7 : case 8 : case 9 : 
			System.out.println("Il faut travailler plus!!");
		break;
		case 10:
		case 11:
		    System.out.println("Passable");
		break;
		case 12:
		case 13:
		System.out.println("Assez bien!");
		break;
		case 14:
		case 15:
		System.out.println("Bien");
		break;
		case 16 :
		case 17 :
		case 18 :
		case 19 :
		case 20 :
		System.out.println("TB");
		break;
		default: 
			System.out.println("Erreur");
		}
		
		

	}

}
