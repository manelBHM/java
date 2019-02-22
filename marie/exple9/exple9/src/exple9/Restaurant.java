package exple9;
import java.util.Scanner;
public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		accompagnement();
	}		
	
	
		public static void accompagnement() {
		System.out.println("Que voulez vous comme accompagnement");
		System.out.println("1 - Legumes frais");
		System.out.println("2 - Frites");
		System.out.println("3 - Riz");
		
	}
		public static void accompagnementVegetarien() {
		System.out.println("Voulez vous un peu de riz?");
		System.out.println("1 - Riz");
		System.out.println("2 - Pas de riz");
		}
		
		public int askMenu() {
		Scanner sc = new Scanner(System.in);
		int askMenu=sc.nextInt();
		return askMenu;
		
	}
		
		
		
}
