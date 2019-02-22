import java.util.Scanner;
public class Cinema {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quel âge avez vous");
		int ageUtilisateur=sc.nextInt();
		
		System.out.println("Habitez vous à Montreuil? 1 Oui / 2 Non");
		int residenceUtilisateur=sc.nextInt();
		
		
		if (ageUtilisateur<=3) {
			System.out.println("Le billet est gratuit");
			
		}
		else if(ageUtilisateur > 3 && ageUtilisateur <=60 && ageUtilisateur ==1) {
			System.out.println("Le billet coute 5 euros");

		}
		else if(ageUtilisateur > 3 && ageUtilisateur <=60 && ageUtilisateur ==2) {
			System.out.println("Le billet coute 8 euros");
		}
		else if(ageUtilisateur > 60) {
			System.out.println("Le billet coute 4 euros");
		}
		
	}
}
