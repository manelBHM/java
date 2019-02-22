package app2;
import java.util.Scanner;
public class Segment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {30,60};
		tableaux(tab);
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i>=30 && i<=60) {
			System.out.println(i + " appartient au Segment [30,60]");
		}
		else {
			System.out.println(i + " n'appartient pas au Segment [30,60]");}
		}
	
		public static void tableaux(int[] tab) {
			testSegment(tab);
	}
		
		static void testSegment(int[] tab) {
		int result = 0;
		for(int i=0; i<tab.length; i++) {
			result += tab[i];
}
		System.out.println("Longueur du segment [30,60]: " + result);

}
}

