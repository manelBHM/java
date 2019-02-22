<<<<<<< HEAD
import java.util.Scanner;
public class Moyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		Scanner scan4 = new Scanner(System.in);
		Scanner scan5 = new Scanner(System.in);
		System.out.println("veuiller rentrer une note : ");
		int input1 = scan1.nextInt();
		System.out.println("veuiller rentrer la note suivante : ");
		int input2 = scan2.nextInt();
		System.out.println("veuiller rentrer la note suivante : ");
		int input3 = scan3.nextInt();
		System.out.println("veuiller rentrer la note suivante : ");
		int input4 = scan4.nextInt();
		System.out.println("veuiller rentrer la note suivante : ");
		int input5 = scan5.nextInt();
		int moyenne = (input1 + input2 + input3 + input4 + input5)/ 5;
		System.out.println("Votre moyenne est de : " + moyenne);
		
		switch (moyenne) {
		case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
			System.out.println("Tu es mauvais ! Nul ! BOUH !");
		break;
		case (10):
			System.out.println("Passable");
		break;
		case (11):
			System.out.println("Passable");
		break;
		case (12):
			System.out.println("Assez bien");
		break;
		case (13):
			System.out.println("Assez bien");
		break;
		case (14):
			System.out.println("Bien");
		break;
		case (15):
			System.out.println("Bien");
		break;
		case (16):
			System.out.println("Tres bien");
		break;
		case (17):
			System.out.println("Tres bien");
		break;
		case (18):
			System.out.println("Excellent");
		break;
		case (19):
			System.out.println("Excellent");
		break;
		case (20):
			System.out.println("Parfait");
		break;
		default :
			System.out.print("Miskine !");
			break;
	

		
		}
}
=======
import java.util.Scanner;
public class Moyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		Scanner scan4 = new Scanner(System.in);
		Scanner scan5 = new Scanner(System.in);
		System.out.println("veuiller rentrer une note : ");
		int input1 = scan1.nextInt();
		System.out.println("veuiller rentrer la note suivante : ");
		int input2 = scan2.nextInt();
		System.out.println("veuiller rentrer la note suivante : ");
		int input3 = scan3.nextInt();
		System.out.println("veuiller rentrer la note suivante : ");
		int input4 = scan4.nextInt();
		System.out.println("veuiller rentrer la note suivante : ");
		int input5 = scan5.nextInt();
		int moyenne = (input1 + input2 + input3 + input4 + input5)/ 5;
		System.out.println("Votre moyenne est de : " + moyenne);
		
		switch (moyenne) {
		case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
			System.out.println("Tu es mauvais ! Nul ! BOUH !");
		break;
		case (10):
			System.out.println("Passable");
		break;
		case (11):
			System.out.println("Passable");
		break;
		case (12):
			System.out.println("Assez bien");
		break;
		case (13):
			System.out.println("Assez bien");
		break;
		case (14):
			System.out.println("Bien");
		break;
		case (15):
			System.out.println("Bien");
		break;
		case (16):
			System.out.println("Tres bien");
		break;
		case (17):
			System.out.println("Tres bien");
		break;
		case (18):
			System.out.println("Excellent");
		break;
		case (19):
			System.out.println("Excellent");
		break;
		case (20):
			System.out.println("Parfait");
		break;
		default :
			System.out.print("Miskine !");
			break;
	

		
		}
}
>>>>>>> 9731d8118d80b09b7d14eeaf403e7b8c423e4ae9
}