package com.projet2.inter;

public  class Complex implements IOperation, IAffichage{
	
	private double re;
	private double im;
	
	
	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}


	@Override
	public String affiche() {
		
		return null;
	}

	public Complex plus(Complex c1, Complex c2) {
		return new Complex(c1.re+c2.re, c1.im+c2.im);
	}
	
	public Complex moins(Complex c1, Complex c2) {
		return new Complex(c1.re-c2.re, c1.im-c2.im);
	}


	@Override
	public Object moins(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object plus(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}


}
