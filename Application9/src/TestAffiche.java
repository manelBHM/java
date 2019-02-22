import static java.lang.System.out;

public class TestAffiche {

	public static void main(String[] args) {
		B b = new B(true);
		out.println(b);

		b = new B(true, 0);
		out.println(b);

		b = new B(false, 5);
		out.println(b);

	}

}
