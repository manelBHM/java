
public class Personne1 {
	private String name;
	private Personne1 ami;

	public Personne1(String name) {
		this.name = name;
	}

	public Personne1(String name, Personne1 ami) {
		this.name = name;
		this.ami = ami;
	}

	public Personne1 getAmi() {
		return ami;
	}

	public void setAmi(Personne1 ami) {
		this.ami = ami;
	}

	public String toString() {
		if (this.ami == null) {
			return this.name + " N'a pas d'ami ";
		} else {
			return this.name + " est ennemi avec " + this.ami.name;
		}
	}

}
