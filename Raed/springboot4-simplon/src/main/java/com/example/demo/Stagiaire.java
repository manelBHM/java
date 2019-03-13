package com.example.demo;

public class Stagiaire {
	
	private String prenom;
	private String nom;
	private String matrichule;
	
	public Stagiaire() {
		
	}
	
	
	
	
	
	public Stagiaire(String prenom, String nom, String matrichule) {
		this.prenom = prenom;
		this.nom = nom;
		this.matrichule = matrichule;
	}





	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMatrichule() {
		return matrichule;
	}
	public void setMatrichule(String matrichule) {
		this.matrichule = matrichule;
	}



	@Override
	public String toString() {
		return "Stagiaire [prenom=" + prenom + ", nom=" + nom + ", matrichule=" + matrichule + "]";
	}
	
	

	
	
}
