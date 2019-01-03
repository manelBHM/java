

public class classNo1 {
	public classNo1() {
		System.out.println("Bonjour de classNo1");
	}
	

}

class classNo2 extends classNo1 {
	boolean verite;
	int valeur;
	public classNo2() {
		System.out.println("Bonjour de classNo2");
	}
	classNo2(int valeur){
		this();
		this.valeur = valeur;
		System.out.println("Constracteur classNo2(int)");

	}
	classNo2(boolean verite){
		this.verite = verite;
		System.out.println("Constracteur classNo2(boolean)");
	}
	public classNo2(boolean verite, int valeur) {
		this(valeur);
        this.verite = verite;
        System.out.println("Constracteur classNo2(boolean, int)");
	}
	
	public String toString() {
		return"classNo2 : (" + verite + ", " + valeur +")\n";
	
				}
	
}
