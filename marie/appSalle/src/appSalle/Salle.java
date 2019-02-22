package appSalle;

import java.util.Comparator;

public class Salle {

	int id;
	String libelle;
	int capacite;
	String code;
	
	
	public Salle(int id, String code, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.code = code;
	}


	@Override
	public String toString() {
		return id +" "+ code +" "+ libelle;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
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
	
	public static Comparator<Salle> ComparatorId = new Comparator<Salle>() {
	     
        public int compare(Salle s1, Salle s2) {
            return (int) (s1.getId() - s2.getId());
        }
    };
	
	
}







