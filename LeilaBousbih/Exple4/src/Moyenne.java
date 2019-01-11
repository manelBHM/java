import java.util.Scanner;

public class Moyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Entrez la note");
		int note = sc.nextInt();
		switch (note)
		{
		case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
			System.out.println("il faut travailler !");
			break;
		case 10: case 11:
			System.out.println("passable");
		    break;
		case 12: case 13:
			System.out.println("Assez bien");
			break;
		case 14: case 15:
			System.out.println("Bien");
			break;
		case 16: case 17: case 18: case 19: case 20:
			System.out.println("TB");
			break;
		default:
			System.out.println("pas compris");
			
			
			
		
		}
		
		
	
		
		

	}

}
