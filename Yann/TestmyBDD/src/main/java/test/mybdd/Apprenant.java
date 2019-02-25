package test.mybdd;

public class Apprenant {

	private String nom,prenom,surnom,date;
	
	public Apprenant(String nom, String prenom, String date)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
	}

	
	public Apprenant(String surnom)
	{
		this.surnom = surnom;
	}
	
	
	
	public String getSurnom() {
		return surnom;
	}


	public void setSurnom(String surnom) {
		this.surnom = surnom;
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
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getSurnom();
	}
	
	
	
	
}
