package testeUnitaire;

public class Calculation {

	public static int Square(int nb) {
		return nb*nb;
	}
	
	public static int Cube(int nb) {
		return nb*nb*nb;
	}
	
	public static void main(String[] args) {
		System.out.println(Square(4));
	}
}
