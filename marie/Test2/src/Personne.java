import java.util.Scanner;
public class Personne {
	//Scanner sc = new Scanner(System.in);
	private String nom;
	private Personne ami;

	
	public Personne (String nom) {
		super();
		this.nom = nom;
		
	}
	
	 public Personne(String nom, Personne ami) {
		 super();
		this.nom = nom;
		this.ami = ami;
	
	}
	 


	public Personne getAmi() {
		return ami;
	}

	public void setAmi(Personne ami) {
		this.ami = ami;
	}
	
	 public String toString() {
		 String res;
		 if(ami==null) {
			 res = nom + "n'a pas d'ami";
			 }
		 else {
			 res = nom + "a pour ami" + ami.nom;
			 }
		return res;
	 }

}
