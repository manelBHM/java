package exple7;
import java.util.Scanner;
public class Voyelle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//char tableauCaractere[] = {'a', 'e', 'i', 'o', 'u', 'y'};
		//int i = 0;
		//char reponse = ' '
	char tableau; char a; char e; char i; char o; char u; char y;
	Scanner sc = new Scanner(System.in);
	int note = sc.nextInt();
		
switch (tableau) {
case a:
	System.out.println("La lettre se trouve bien dans le tableau à l'indice 0");
	System.out.println("Voulez-vous esseyer à nouveau (O/N)");
	break;	
case e:
	System.out.println("La lettre se trouve bien dans le tableau à l'indice 1");
	System.out.println("Voulez-vous esseyer à nouveau (O/N)");
	break;
case i:
	System.out.println("La lettre se trouve bien dans le tableau à l'indice 2");
	System.out.println("Voulez-vous esseyer à nouveau (O/N)");
	break;
case o:
	System.out.println("La lettre se trouve bien dans le tableau à l'indice 3");
	System.out.println("Voulez-vous esseyer à nouveau (O/N)");
	break;
case u:
	System.out.println("La lettre se trouve bien dans le tableau à l'indice 4");
	System.out.println("Voulez-vous esseyer à nouveau (O/N)");
	break;
case y:
	System.out.println("La lettre se trouve bien dans le tableau à l'indice 5");
	System.out.println("Voulez-vous esseyer à nouveau (O/N)");
	break;
	default:
	System.out.println("La lettre ne se trouve pas dans le tableau");
}
		
		
	}

}
