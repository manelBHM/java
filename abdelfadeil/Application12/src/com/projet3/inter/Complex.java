package com.projet3.inter;



public class Complex extends Affichage implements IOperation {
	private double re;
	private double im;
	
	
	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}


	@Override
	public String affiche() {
		
		return " Résultats de numéro complex "+ this.re +"  "+ this.im;
	}

	public Complex plus(Complex c1) {
		return new Complex(c1.re+this.re, c1.im+this.im);
	}
	
	public Complex moins(Complex c1) {
		return new Complex(c1.re-this.re, c1.im-this.im);
	}


	@Override
	public Object moins(Object c) {
		Complex c1 = (Complex)c;
		return new Complex(c1.re+this.re, c1.im+this.im);
	}


	@Override
	public Object plus(Object c) {
		Complex c1 = (Complex)c;
		return new Complex(c1.re+this.re, c1.im+this.im);
	}


}