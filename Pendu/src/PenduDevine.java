
public class PenduDevine {

	char str = 'z';
	char letter;
	String chaine;
	// String devine="azerty";

	public String motDevine(String devine) {
		chaine = new String(devine);
		for (int i = 0; i < devine.length(); i++) {
			if (' ' == devine.charAt(i)) {
				chaine += ' ';
				// System.out.println(" ");
			} else {
				chaine += "*";
				// System.out.println("*");
			}

		}
		System.out.println(chaine);
		return chaine;
	}

	public static void main(String[] args) {
		motDevine(chaine);
	}

}
