package app11;

public class RunInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 System.out.println("Nombre Complexe ==> ");
		 
		 
		Complexe c1 = new Complexe(3, 3);
		Complexe c2 = new Complexe(2, 4);
		Complexe c3, c4;
		
		 c3 = c1.plus(c2);
		 c4 = c1.moins(c2);

        System.out.println(c3.affiche());
        System.out.println(c4.affiche());
		
        
        System.out.println("Nombre Reel ==> ");
		
		
		Reel r1 = new Reel(4);
		Reel r2 = new Reel(4);
		Reel r3, r4;
		
		r3 = r1.plus(r2);
		r4 = r1.moins(r2);
		
        System.out.println(r3.affiche());
        System.out.println(r4.affiche());

	}

}
