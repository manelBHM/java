import java.util.ArrayList;

public class TestPokemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 ArrayList<Pokemon>list=new ArrayList<Pokemon>();
		
		Pokemon a =new Pokemon("charizard",100);
		Pokemon b = new Pokemon("blastoise",200);
		Pokemon c = new Pokemon("venusaur",300);
		Pokemon d = new Pokemon("d",400);
		
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		
		System.out.println("the numper of the pokemon"+" "+Pokemon.nppok+"\n");
		
		Pokemon.aficher(a);
		Pokemon.compat(a, list);
		 System.out.println("\n");
		 
		 Pokemon.aficher(b);
			Pokemon.compat(b, list);
			 System.out.println("\n");
			 
			 Pokemon.aficher(c);
				Pokemon.compat(c, list);
				 System.out.println("\n");
				 
				 Pokemon.aficher(d);
					Pokemon.compat(d, list);
					 System.out.println("\n");
		
	}

}
