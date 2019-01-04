package com.projet2.inter;

public class AppTest {

	public static void main(String[] args) {
		Complex c1 = new Complex(20, 12);
		Complex c2 = new Complex(7, 11);
		Complex c5 = new Complex(44, 12);

		
		Complex c3, c4;
		
		Reel reel1 = new Reel(10);
		Reel reel2 = new Reel(22);
		Reel reel = new Reel(14);
		
		
		reel1.plus(reel2);
		reel = (Reel) reel1.moins(reel2);
		System.out.println("Objet de type reel");
		System.out.println(reel.affiche());
		
		

		c3 = c1.plus(c2);
		c4 =  c2.plus(c3);
		
		
		System.out.println(c3.affiche());
		System.out.println(c4.affiche());
		System.out.println("****************************");
		System.out.println(reel1.plus(10));
		System.out.println(reel2.moins(24));
		System.out.println(c5.moins(c4).affiche());

	}

}
