package application9;

public class B extends A {

	 
		// TODO Auto-generated constructor stub
		boolean verite;
		int valeur;
		
		B() {
			 System.out.println("Constructeur B ");
		}
		
		B ( int valeur){
			this();
			this.valeur=valeur;
			System.out.println(" Constructeur B(int)");
		}
		
		B( boolean verite){
			this();
			this.verite= verite;
			System.out.println(" Constructeur B(boolean)");
		}
		
		B(boolean verite , int valeur){
			this(valeur);
			this.verite= verite;
			// this.valeur=valeur;
			System.out.println(" Constructeur B(boolean, int)");
		}
		
		public String toSring () {
			return "B : ( "+ verite + " , "+ valeur+" )\n";
		}
	}


