import java.util.Comparator;

public class Salle {

	int id;
	String libelle;
	int capacite;
	public static Comparator<Salle> idComparator = new Comparator<Salle>() {
		public int compare(Salle o1, Salle o2) {
			// TODO Auto-generated method stub
			int id1 = o1.getId();
			int id2 = o2.getId();
			return id1 - id2;
		}
	};
	
	public Salle(int id, String libelle, int capacite) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.capacite = capacite;
	}

	@Override
	public String toString() {
		return "Salle [id=" + id + ", libelle=" + libelle + ", capacite=" + capacite + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	
	
	
	
	
}
