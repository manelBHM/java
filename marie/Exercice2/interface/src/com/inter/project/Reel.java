package com.inter.project;

public class Reel extends IAffiche implements IOperation{

	private double x;

	
	public Reel(double x) {
		this.x = x;

		
	}
	
	public String affiche() {
		
		return null;
	}


	public Object plus(Object obj) {
		Reel com = (Reel) obj;
		return new Reel(this.x + com.x);
	}


	public Object moins(Object obj) {
		Reel com = (Reel) obj;
		return new Reel(this.x - com.x);
	}
}