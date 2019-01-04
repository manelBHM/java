
public class AfficheTableau {

	static int sommeTab(int[] tab) {
		int somme = 0;
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}
		System.out.println("La somme du tableaux est = " + somme);
		return somme;
	}

	static int LongTab(int[] tab) {
		for (int i = 0; i <= tab.length; i++) {
		}
		System.out.println("La longeur du taleau est = " + tab.length);
		return tab.length;
	}

	static int maxTab(int[] tab) {
		int max = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab[i];
			}
		}

		System.out.println("Indice max du tableaux " + max);
		return max;
	}

	public static void main(String[] args) {

		int[] tableaux = { 3, -8, 14, 4 };
		int lonTab = LongTab(tableaux);
		int somme = sommeTab(tableaux);
		int max = maxTab(tableaux);

		tableaux = new int[] { 3, -8, 14, 4, 20 };
		for (int size : tableaux) {
			System.out.print(size + " ");
		}
	}

}
