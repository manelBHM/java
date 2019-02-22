
public class RuninTime {

	public static void main(String[] args) {
		Ville v1 = new Ville("nice");
		Ville v2 = new Ville("nice", 500);
		Capitale c1 = new Capitale("Paris ", 1000, " France ");
		Capitale c2 = new Capitale("Berlin", " Allemagne ");
		System.out.println(v1.presentToi());
		System.out.println(v2.presentToi());
		System.out.println(c1.presentToi());
		System.out.println(c2.presentToi());

	}

}
