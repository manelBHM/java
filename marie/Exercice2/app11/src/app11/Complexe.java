package app11;

import java.util.Objects;

public class Complexe extends IAffichage implements IOperation{

	double re;
	double im;
	
	public Complexe(double re, double im) {
		this.re = re;
		this.im = im;
		
	}
	
	@Override
	public String affiche() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Objects plus(Object obj) {
		Complexe com = (Complexe) obj;
		return new Complexe(this.re + com.re, this.im + com.im);
		
		/*int C1 = 2+2;
		int C2 = -3+4;
		int C3 = (C1.plus(C2)obj);
		return null;*/
	}

	@Override
	public Objects moins(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

}