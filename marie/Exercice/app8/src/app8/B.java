package app8;

public class B extends A{
	boolean verite;
	int valeur;
	B() {
		System.out.println("constructeur B()");
		}
	
	B(int valeur) {
		this();
		this.valeur = valeur;
	
	System.out.println("constructeur B(int)");
}
	B(boolean verite) {
	this.verite = verite;
	System.out.println("constructeur B(boolean)");
	}
	B(boolean verite, int valeur) {
	this(valeur);
	this.verite = verite;
	System.out.println("constructeur B(boolean, int)");
	}
	public String toString() {
	return "B : (" + verite + ", " + valeur +")\n";
	}
	
}
