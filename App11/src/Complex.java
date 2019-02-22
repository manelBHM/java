
public class Complex implements IOperation,IAffichage {
	
	
	private int re;
	private int im;
	
	public Complex(int re, int im) {
		this.re=re;
		this.im=im;
	}
	
	
	

	@Override
	public Object plus(Object c) {
	
	Complex com = (Complex) c;	
		return new Complex (this.re + com.re , this.im + com.im);
	}

	@Override
	public Object moins(Object c) {
		
		Complex com = (Complex) c;	
			return new Complex (this.re - com.re , this.im - com.im);
	}




	@Override
	public String Affich() {
	
		return this.re +" ," +this.im;
	}

}