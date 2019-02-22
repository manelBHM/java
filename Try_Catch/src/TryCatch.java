
public class TryCatch {

	public static void main(String[] args) {
		int j = 20;
		int i = 0;

		try {
			System.out.println(j / i);
			if (j < i) {
				System.out.println("erreur ocured ! ");
			}
		} catch (ArithmeticException e) {
			e.getMessage();
		}

		try {
			System.out.println("<=" + (1 / 0));
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
	}
}
