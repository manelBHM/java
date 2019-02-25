package model;


public class Stagiaire {
	
	String nom,prenom;
	int id;
	public Stagiaire( int id, String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Stagiaire [nom=" + nom + ", prenom=" + prenom + ", id=" + id + "]";
	}
	
	
	
	
	
	
	
	

}
