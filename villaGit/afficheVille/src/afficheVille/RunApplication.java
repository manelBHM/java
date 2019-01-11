package afficheVille;
public class RunApplication {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ville v1 = new Ville ("Lyon", 10);
		Ville v2 = new Ville("Lille",100);
		Ville v3 = new Ville("Nice");
		
		
		Capitale c1 = new Capitale("Paris", 20 ,"France");
		Capitale c2 = new Capitale("Berlin",-1,"Allmagne");
		Capitale c3 = new Capitale("Damas",-1,"Syrie");
		
		System.out.println(v1.presenteToi());
		System.out.println(v2.presenteToi());
		System.out.println(v3.presenteToi());
		
		System.out.println(c1.presenteToi());
		System.out.println(c2.presenteToi());
		System.out.println(c3.presenteToi());
		

	}

}