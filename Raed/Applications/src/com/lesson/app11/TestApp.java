package com.lesson.app11;

public class TestApp {

	public static void main(String[] args) {
		System.out.println("Traitement de mes nombres complexes");
		Complexe c1 = new Complexe(4, 7);
		Complexe c2 = new Complexe(-5, 8);
		Complexe c3, c4;
		c3 = (Complexe) (c1.plus(c2));
		c4 = (Complexe) (c1.moin(c2));
		System.out.println("c1 + c2 = " + c3.showCase());
		System.out.println("c1 - c2 = " + c4.showCase());
		
		
		System.out.println("Traitement de mes nombres Réels");
		Reel r1 = new Reel(10);
		Reel r2 = new Reel(20);
		Reel r3;
		r3 = (Reel) (r1.plus(r2));
		System.out.println("r1 + r2 = " + r3.showCase());

	}

}
