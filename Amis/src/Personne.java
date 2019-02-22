
public class Personne {
	private String nom;
	private Personne ami;

	public Personne(String nom) {
		this.nom = nom;
	}

	public Personne(Personne ami, String nom) {
		this.ami = ami;
		this.nom = nom;
	}

	public Personne getAmi() {
		return ami;
	}

	public void setAmi(Personne ami) {
		this.ami = ami;
	}

	public String toString() {
		if (this.ami != null) {
			return this.nom + "est ami avec " + this.ami.nom;

		} else {
			return this.nom + " n'a pas d'amis";
		}

	}

	public static class EssaiAmi {
		public static void main(String[] args) {
			Personne personne = new Personne("benjamin");
			Personne friend1 = new Personne(" toto ");
			Personne friend2 = new Personne("samba ");
			friend1.setAmi(friend2);

			System.out.println(personne.toString());
			System.out.println(friend1.toString());
			System.out.println(friend2.toString());

		}

	}

}
