

public class A {
	public A() {
		System.out.println("Bonjour de A");
	}

}

class B extends A {
	boolean verite;
	int valeur;
	public B() {
		System.out.println("Bonjour de B");
	}
	B(int valeur){
		this();
		this.valeur = valeur;
		System.out.println("Constracteur B(int)");

	}
	B(boolean verite){
		this.verite = verite;
		System.out.println("Constracteur B(boolean)");
	}
	public B(boolean verite, int valeur) {
		this(valeur);
        this.verite = verite;
        System.out.println("Constracteur B(boolean, int)");
	}
	
	public String toString() {
		return"B : (" + verite + ", " + valeur +")\n";
	
				}
	
}
