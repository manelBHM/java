package complexe.inter3;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Complexe c1 =  new Complexe(2,2) ; 
		Complexe c2 =  new Complexe(-3,4) ;
		Complexe c3, c4 ;
		Reel r1= new Reel(3.4);
		Reel r2= new Reel(3.89);
		Reel r3;
		c3  =(Complexe)(c1.plus(c2));
		c4=(Complexe)(c1.moins(c2));
		System.out.println( "c2 + c1 = " +c3.afficher());
		System.out.println( "c2  - c1 = " +c4.afficher());
		r3=(Reel)(r1.plus(r2));
		System.out.println( "r1 + r2 = " +r3.afficher());
		r3 = new Reel(100);
		System.out.println( "{1} = " +r3.plus(1,3,4));
		System.out.println( "{2} = " +r3.plus(1,3,4,6,9));
		System.out.println( "{3} = " +r3.moins(22,3,4,6,9));
		System.out.println( "{4} = " +r3.moins(2, 4,6,9));

	}

}
