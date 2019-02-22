
public class Run {

	public Run() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ville v1 = new Ville ("Lyon", 10);
		Ville v2 = new Ville("Lille",100);
		Ville v3 = new Ville("Nice");
		
		
		Capital c1 = new Capital("Paris", 20 ,"France");
		Capital c2 = new Capital("Berlin",-1,"Allmagne");
		Capital c3 = new Capital("Damas",-1,"");
		
		System.out.println(v1.presenteToi());
		System.out.println(v2.presenteToi());
		System.out.println(v3.presenteToi());
		
		System.out.println(c1.presenteToi());
		System.out.println(c2.presenteToi());
		System.out.println(c3.presenteToi());
		

	}

}
