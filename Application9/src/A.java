import static java.lang.System.out;

public class A {

	public A() {
		out.println("Bonjour de A");
	}
}

class B extends A {
	Boolean verite;
	int valeur;

	public B() {
		out.println("Constructeur B");
	}

	public B(int valeur) {
		this();
		this.valeur = valeur;
		out.println("Constructeur B(int)");
	}

	public B(Boolean verite) {
		this.verite = verite;
		out.println("Constructeur B(Boolean)");
	}

	public B(Boolean verite, int valeur) {
		this(valeur);
		this.verite = verite;
		out.println("Constructeur B(Boolean, int)");
	}

	public String toString() {
		return " B : ( " + verite + " " + valeur + " ) \n";
	}

}
