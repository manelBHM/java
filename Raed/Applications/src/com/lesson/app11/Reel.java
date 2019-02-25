package com.lesson.app11;

public class Reel  extends IAffiche implements IOperation {

	private double x;
	
	
	public Reel(double x) {
		//super();
		this.x = x;
	}

	@Override
	public Object plus(Object a) {
		Reel reel = (Reel) a;
		return new Reel(this.x + reel.x);
	}

	@Override
	public Object moin(Object a) {
		Reel reel = (Reel) a;
		return new Reel(this.x - reel.x);
	}

	@Override
	public String showCase() {
		// TODO Auto-generated method stub
		return x + "";
	}
 

}
