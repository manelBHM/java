
public class TestRun {

	public static void main(String[] args) {

		Ville v1 = new Ville("Lyon ", 150000);
		String x =v1.afficher();
		System.out.println(x);
		  
		  
		Ville v2 = new Ville("Nice ");
		String y = v2.afficher();
		System.out.println(y);
		
		Capitale c1 = new Capitale("Paris ", "France ", 1000000);
		String a = c1.afficher();
		System.out.println(a);
		
		Capitale c2 = new Capitale("Berlin ", "Allemagne");
		String b = c2.afficher();
		System.out.println(b);
		

		
		
		
		
	}

}
