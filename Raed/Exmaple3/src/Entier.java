import java.util.Scanner;

public class Entier {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("entrez un nombre entre 50 et 100 s'il vous plait : ");
		int input = scan.nextInt();
		
		
		if((input > 50)&&(input < 100)) {
			System.out.println("votre nombre est bien verifie :" + input);
		}else {
			System.out.println("votre nombre n'est pas verifie : "+input);
		}
		 
		
	}

}
