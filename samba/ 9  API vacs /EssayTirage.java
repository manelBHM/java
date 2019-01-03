public class EssayTirage {

	static java.util.Random random = new java.util.Random();

	static Animal tirage() {
		return random.nextInt() % 2 == 0 ? new Oiseau() : new Chat();
	}

	public static void main(String[] args) {
		tirage().devine();

	}

}
