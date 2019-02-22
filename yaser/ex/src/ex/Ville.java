package ex;



    class pay {
	   String name;
	   String capital;
	   int nbh;
	   
	   void printInfo() {
		   System.out.println("name: " +name);
		   System.out.println("capital: " +capital);
		   System.out.println("nbh: " +nbh);
		   System.out.println("\n");
	   }
	   
   }





public class Ville {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		pay p1 = new pay();
		pay p2 = new pay();
		pay p3 = new pay();
		
		
		p1.name="france";
		p1.capital="paris";
		p1.nbh=13000000;
		
		p2.name="jordan";
		p2.capital="amman";
		p2.nbh=13000000;
		
		
		p3.name="almangi";
		p3.capital="birlan";
		p3.nbh=13000000;
		
		
		p1.printInfo();
		p2.printInfo();
		p3.printInfo();
		
	}

}
