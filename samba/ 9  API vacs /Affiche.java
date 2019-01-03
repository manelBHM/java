
public class Affiche {

	public static void main(String[] arg)  {

		A[] table = new A[5];
		table[0] = new B();
		table[1] = new C();
		table[2] = new C();
		table[3] = new B();
		table[4] = new C();
		for (int i = 0; i < 5; i++) {
			table[i].decrire();
		}
	}
}
