package com.lesson.app8;

public class App {

	public static void main(String[] args) {
		
		
		A[] tab =  new A[4];
		
 
		tab[0]  = new B();
		tab[1]  = new C();
		tab[2]  = new C();
		tab[3]  = new B();
		
		for(int i =0;i<tab.length;i++) {
			tab[i].decrire();
	 
			
		}
 
	}
}
