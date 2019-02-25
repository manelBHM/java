package com.lesson.app2;

public class Segment {
	private int extr1,extr2;
	
	public Segment(int e1, int e2) {
		super();
		this.extr1 = e1;
		this.extr2 = e2;
		ordonne();
		
	}

	
	
	private  void ordonne() {
		if(extr1 > extr2) {
			int emps;
			
			emps = extr1;
			extr1 = extr2;
			extr2 = emps;
		}
			
		}
	 
		public int longeur() {
			return extr2 - extr1;
		}
		
	 
		public boolean appart(int x) {
			return (x >= extr1) && (x <= extr2);
		}
		
	

	@Override
	public String toString() {
		return "Segment [extr1=" + extr1 + ", extr2=" + extr2 + "]";
	}
	
	
	
	
	
	

}
