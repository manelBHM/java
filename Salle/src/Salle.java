import java.util.Comparator;

public class Salle {
	private int id;
	private String code;
	private String libelle;

	public Salle(int id, String code, String libelle) {
		this.id = id;
		this.code = code;
		this.libelle = libelle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String toString() {
		return this.code + " " + this.libelle;
	}

	public static Comparator<Salle> idComparator = new Comparator<Salle>() {
		public int compare(Salle s1, Salle s2) {
			int id1 = s1.getId();
			int id2 = s2.getId();
			/* For ascending order */
			return id1 - id2;
		}
	};

}
