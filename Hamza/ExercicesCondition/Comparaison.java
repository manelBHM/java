import java.util.Scanner ;

public class Comparaison {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un premier entier :");
		int nbre1 = sc.nextInt();  
		
		System.out.println("Veuillez saisir un deuxième entier :");
		int nbre2 = sc.nextInt(); 
		
		//int nbre1 = 10, nbre2 = 5;
		
		if (nbre1 < nbre2) {
			System.out.println("L'entier le plus petit est " + nbre1);
					
		} else if (nbre1 > nbre2){
			System.out.println("L'entier le plus petit est " + nbre2);
		} else {
			System.out.println("Les deux entiers ont la même valeur.");
		}

	}

}
