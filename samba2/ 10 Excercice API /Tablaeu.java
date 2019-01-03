public class Tablaeu {

	public static void main(String[] args) {

		int[] tab = { 3, 7, 1, 9, 2, 8, 9, 1, 2, 5 };
		showOperation(tab);

		int[] tab1 = fillIn(4);
		int[] tab2 = fillIn2(10);
		int[] tab3 = fillIn3(5);

		showOperation(tab1);
		showOperation(tab2);
		showOperation(tab3);

	}

	static int[] fillIn(int nb) {
		int tab[] = new int[nb];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = i;
		}
		return tab;
	}

	static int[] fillIn2(int nb) {
		int tab[] = new int[nb];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = i + 5;
		}
		return tab;
	}

	static int[] fillIn3(int nb) {
		int[] tab = new int[nb];
		for (int i = tab.length - 1; i > 0; i--) {
			tab[i] = tab.length - i;
		}
		return tab;
	}

	static void operat1(int[] tab) {
		int nb = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == 9) {
				nb++;
			}
		}
		System.out.println("Il ya " + nb + " de valeur 9 dans le tableau");
	}

	static void operat2(int[] tab) {
		int nb = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > 4 || tab[i] < 2) {
				nb++;

			}
		}
		System.out.println("Il ya " + nb + " est plus grand que 4 es plus petit que 2 ");
	}

	static void operat3(int[] tab) {
		int somme = 0;
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}
		System.out.println("La somme de tableau est " + somme);
	}

	static void operat4(int[] tab) {
		int somme = 0;
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}
		double moyene = somme / tab.length;
		System.out.println("La moyenne du tableau est " + moyene);
	}

	static void show(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}

		System.out.println();
	}

	static void operat5(int[] tab) {
		int max = 0;
		for (int i = 0; i < tab.length; i++) {
			if (max < tab[i]) {
				max = tab[i];
			}
		}
		System.out.println("Le plus grand element vaut " + max);
	}

	static void showOperation(int[] tab) {
		show(tab);
		operat1(tab);
		operat2(tab);
		operat3(tab);
		operat4(tab);
		operat5(tab);
	}

}
// System.out.println(nb + " est plus grand que 4 es plus petit que 2 ");
