package segment;

public class Segment {

	public void testSegment(int ext1, int ext2, int point) {

		// S'assurer que ext1 est bien inférieur à ext2
		if (ext1 > ext2) {
			int temp = ext1;
			ext1 = ext2;
			ext2 = temp;

		}

		// Calcul de la longueur du segment
		int longueur = ext2 - ext1;
		System.out.println("Longueur du segment [" + ext1 + "," + ext2 + "]" + ": " + Math.abs(longueur));

		// Vérification de l'appartenance du point d'abscisse donné au segment

		if (ext1 <= point && point <= ext2) {
			System.out.println(point + " appartient au segment [" + ext1 + "," + ext2 + "]");
		} else {
			System.out.println(point + " n'appartient pas au segment [" + ext1 + "," + ext2 + "]");
		}
	}
}
