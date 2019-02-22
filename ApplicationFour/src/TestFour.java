
public class TestFour {

	public static void main(String[] args) {

		Four f1 = new Four(30, 180);
		Four f2 = new Four(25, 260);

		f2.setPuissance(122);
		f2.setCapacite(70);
		f2.cuire();

		f1.setPuissance(190);
		f1.setCapacite(45);
		f1.cuire();

	}

}
