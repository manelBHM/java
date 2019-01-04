package complexe.inter3;

import inter2.IAffichage;
import inter2.IOperation;

public class Complexe implements IOperation , IAffichage {

	
    private double im;
	
	private double re;
	
	 
	
	public Complexe (double im , double re) {
		this.im=im;
		this.re=re;
	}
	

	@Override
	public Object plus(Object ob) {
		// TODO Auto-generated method stub
		
		Complexe com = (Complexe) ob;
		return new Complexe (this.re+ com.re, this.im+ com.im);
	}

	@Override
	public Object moins(Object ob) {
		// TODO Auto-generated method stub
		Complexe com = (Complexe) ob;
		return new Complexe (this.re- com.re, this.im- com.im);
	}
	
	@Override
	public String afficher() {
		// TODO Auto-generated method stub

		if(this.im>0)
		   return this.re + "+"+ this.im + "i";
	 
		else if ( this . im < 0) 
		return this.re + " " + this .  im + " i" ;
		else  return this.re + "" ;
	}
	
	
	public double getIm() {
		return im;
	}

	public void setIm(double im) {
		this.im = im;
	}

	public double getRe() {
		return re;
	}

	public void setRe(double re) {
		this.re = re;
	}


}
