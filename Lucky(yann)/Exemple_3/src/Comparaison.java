import java.util.Scanner;

public class Comparaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Ecrire une application qui permet de comparer 2 nombres entiers et afficher le plus petit ?
		
		System.out.println("Entrez deux nombre et afficher le plus pétit");
		
		       Scanner sc = new Scanner(System.in);
		
				int a=sc.nextInt(),  b=sc.nextInt();
				
				
				
				if(a>b){System.out.println("Le nombre le plus pétit est: " + b);}
				
				else if(a<b) {System.out.println("Le nombre le plus pétit est: " + a);}
				
				else {System.out.println("Les deux nombre saisir sont égaux");}
		
		
	}

}
