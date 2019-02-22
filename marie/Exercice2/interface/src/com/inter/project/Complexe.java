package com.inter.project;




public class Complexe extends IAffiche implements IOperation{

	private double re;
	private double im;
	
	public Complexe(double re, double im) {
		this.re = re;
		this.im = im;
		
	}
	

	public String affiche() {
		
		return null;
	}

	
	public Object plus(Object obj) {
		Complexe com = (Complexe) obj;
		return new Complexe(this.re + com.re, this.im + com.im);
		
	}

	
	public Object moins(Object obj) {
		Complexe com = (Complexe) obj;
		return new Complexe(this.re - com.re, this.im - com.im);
	}

}

