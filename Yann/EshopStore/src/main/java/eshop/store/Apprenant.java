package eshop.store;

public class Apprenant {

	private String nom,prenom,date;
	
	public Apprenant(String nom, String prenom, String date)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
