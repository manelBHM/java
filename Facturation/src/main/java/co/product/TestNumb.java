package co.product;

public class TestNumb {

	public int getNumber(int[] tab) {
		int i = 0;
		int max = Integer.MIN_VALUE;
		for (i = 0; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab[i];
			}
		}
		return max;
	}
}
