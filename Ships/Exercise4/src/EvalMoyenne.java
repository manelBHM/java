import java.util.Scanner;
public class EvalMoyenne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrez les numuré de étoile");
		
		int étoile = scan.nextInt();
		
		
		switch(étoile) {
			case 10 :
				System.out.println("test");
			break;
			
			case 11 :
			case 12 :
			
				System.out.println("Pas bien");
				break;
			
			
			case 13 :
			case 14 :
			
				System.out.println("Assez bien");
				break;
			
			
			case 15 :
			case 16 :
			
				System.out.println("bien");
				break;
			
			case 17 :
			case 18 :
			case 19 :
			case 20 :
			
				System.out.println("Très bien");
				break;
			
			default :
				System.out.println("default msg");
			
		};
		
	
		
	}
	
}
	
	
	
