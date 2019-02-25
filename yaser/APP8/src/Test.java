
public class Test {

	public static void main(String[] args) {
		A [] table= new A [5];
		int i = 0;
		
		table[0] = new B();
		table[1] = new C();
		table[2] = new C();
		table[3] = new B();
		table[4] = new C();
		for (i = 0; i < 5; i++)
		table[i].decrier();

	}

}
