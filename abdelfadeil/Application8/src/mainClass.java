
public class mainClass {

	public static void main(String[] args) {
		A[] table;
		table = new A [5];
		table[0] = new B();
		table[1] = new C();
		table[2] = new C();
		table[3] = new B();
		table[4] = new C();
		for (int i = 0; i < table.length; i++) {
			table[i].decrire();
		}
		
		
	}

}