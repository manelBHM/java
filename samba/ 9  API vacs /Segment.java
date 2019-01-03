import java.util.Scanner;

public class Segment {

	static int extremA;
	static int extremB;
	static int abscis;

	public Segment(int extremA, int extremB) {
		this.extremA = extremA;
		this.extremB = extremB;
	}

	static boolean verification(int abscis) {
		return (abscis >= extremA) && (abscis <= extremB);
	}

	static int longueur(int x) {
		return extremB - extremA;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Segment s = new Segment(-10, 20);

		System.out.print("Veuillez saisir votre point d'abscisse : ");
		abscis = sc.nextInt();

		if (verification(abscis)) {
			System.out.print("La longueur du segment [" + extremA + ", " + extremB + "] : ");
			System.out.println(longueur(abscis));
			System.out.print(verification(abscis) + " ");
			System.out.print(abscis + " Appartient a l'abscisse ");
		} else {
			System.out.print("La longueur du segment [" + extremA + ", " + extremB + "] : ");
			System.out.println(longueur(abscis));
			System.out.print(verification(abscis) + " ");
			System.out.println(abscis + " - Appartient pas l'abscisse");
		}

		// (abscis >= extremA && abscis <= extremB) {
		//
	}

}
