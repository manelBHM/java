import java.util.Scanner;


public class SWITCH {
	
	public static void main(String[] args) {
		Scanner scp = new Scanner(System.in);
		System.out.println("Veuillez saisir votre fourchette de moyenne : a=[0 à 10], b=[10 à 12] c=[12 à  14] , d = [14 à 16], e=[16 à 18]");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir votre moyenne");
		
		int note = sc.nextInt();
		
		switch (note)
		{
			
		case 0|1:
			System.out.println("insuffisant");
			break;
		case 10|11:
			System.out.println("Passable");
			break;
		case 12:
			System.out.println("Assez bien");
			break;
		case 14:
			System.out.println("bien");
			break;
		case 16:
			System.out.println("Trés Bien");
			break;
		case 18:
			System.out.println("excelence");
		default :
			System.out.println("Vous n'avez pas mit de moyenne.");
			
		}
	}
}