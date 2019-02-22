public class Salle {
	private int id;
	private String code;
	private String libelle;
	public static int nbre_Salles=0;
	private static int comp;
 
	public Salle(String code, String libelle) {
		this.id = ++comp;
		this.code = code;
		this.libelle = libelle;
		nbre_Salles++;
	}
 
	public Salle(int id, String code, String libelle) {
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		nbre_Salles++;
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
		return this.code + " " + this.libelle+ " " + this.id;
	}
 
}