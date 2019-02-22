
public class Test {

	public static void main(String[] args) {
		Complex c1 = new Complex(8,10);

		Complex c2 = new Complex(7,8);
		
		Complex c3 = new Complex(44, 12);
		
		Complex c4;
		c4=(Complex) c1.moins(c2);
		System.out.println(c4.Affich());
		c4=(Complex)c1.plus(c2);
		 
		System.out.println(c4.Affich());
		
		Real real1 = new Real(2);
		Real real2 = new Real(10);
		Real real3 = new Real(20);
		
		Real c5;
		
		c5= (Real) real1.plus(real2);
		
		System.out.println(c5.Affich());
		
		
	}

}
