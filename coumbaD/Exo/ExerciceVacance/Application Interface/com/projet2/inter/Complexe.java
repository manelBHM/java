package com.projet2.inter;


public class Complexe implements IOperation, IAffichage{
	
	private double re;
	private double im;
	
	public Complexe(int re, int im) {
		this.re = re;
		this.im = im;
	}
	
	public Object plus (Object c) {
		Complexe com = (Complexe) c;
		return new Copmlexe (this.re)
		
		
	}
	
	
}
