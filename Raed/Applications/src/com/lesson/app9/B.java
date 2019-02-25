package com.lesson.app9;

public class B extends A{
	
	boolean verite;
	int valeur;
	
	B(){
		System.out.println("constructeur B()");
	}

	
	public B(int valeur) {
		this();
		this.valeur = valeur;
		System.out.println("constructeur B(int)");
	}
	
	
	public B(boolean verite) {
		 
		this.verite = verite;
		System.out.println("constructeur B(boolean)");
	}


	B(boolean verite, int valeur) {
		this(valeur);
		this.verite = verite;
		System.out.println("constructeur B(boolean, int)");
		}
	
	@Override
	public String toString() {
		return "B [verite=" + verite + ", valeur=" + valeur + "]";
	}
	
	 
	

}
