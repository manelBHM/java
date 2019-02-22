import java.util.ArrayList;

public class Pokemon {
	
	private String name;
	private int pv;
	static int nppok=0;
	public Pokemon(String name, int pv) {
		super();
		this.name = name;
		this.pv = pv;
		nppok++;
	}
	
	static void aficher(Pokemon a) {
		
		System.out.println("i'am"+" "+a.name+" "+"my poere is : "+" "+a.pv);
		
	}
	
	static void compat(Pokemon a, ArrayList<Pokemon>list) {
		
		for(Pokemon elem : list) {
			
			if (a.pv>elem.pv) {
				System.out.println("i am more strong then"+elem.name+" ");
			}
			else if (a.pv<elem.pv) {
				System.out.println("i am less strong then "+elem.name+" ");
			}
			
			else if (a.pv == elem.pv && a.pv != elem.pv) {
				System.out.println("i have the same power of "+elem.name+" ");
			}
			
		}
		
	}
	

}
