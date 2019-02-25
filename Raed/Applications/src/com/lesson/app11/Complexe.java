package com.lesson.app11;

public class Complexe extends IAffiche implements IOperation  {

	private double re;
	private double im;
	
	
	public Complexe(double re, double im) {
		//super();
		this.re = re;
		this.im = im;
	}

	@Override
	public Object plus(Object a) {
		Complexe com = (Complexe) a;
		return new  Complexe(this.re + com.re, this.im+ com.im);
	}

	@Override
	public Object moin(Object b) {
		Complexe com = (Complexe) b;
		return new Complexe(this.re - com.re,  this.im - com.im);
	}

	@Override
	public String showCase() {
		if (this.im > 0) {
			return this.re + " + " + this.im + "i";
		} else if (this.im < 0) {
			return this.re + " " + this.im + "i";
		}else
		return this.re + "";
 
	}

}
