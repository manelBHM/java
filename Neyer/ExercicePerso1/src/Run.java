
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ville v1 = new Ville("France",2);
		
		System.out.println(v1.affiche());
		
		Ville v2 = new Ville(10000000);
		
		System.out.println(v2.affiche());
		
		Capital c1 = new Capital("France",2,"Paris");
		
		System.out.println(c1.affiche());
		
		Capital c2 = new Capital(3,"Paris");
		
		System.out.println(c2.affiche());

	}

}
