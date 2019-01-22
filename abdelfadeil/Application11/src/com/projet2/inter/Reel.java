package com.projet2.inter;

public class Reel implements IOperation, IAffichage {

	private double x;
	
	
	public Reel(double x) {
		this.x = x;
	}

	@Override
	public String affiche() {
		return (x + "" );
	}
	
	public double moins(double x) {
		double s = 0;
			s=this.x - x;
		return s;
	}

	public double plus(double x) {
		double somme = 0;
			somme =this.x + x;
		return somme;
	}
	@Override
	public Object moins(Object obj) {
		Reel reel = (Reel) obj;
		return new Reel(this.x - reel.x);
	}
	@Override
	public Object plus(Object obj) {
		Reel reel = (Reel) obj;
		return new Reel(this.x + reel.x);
	}



}