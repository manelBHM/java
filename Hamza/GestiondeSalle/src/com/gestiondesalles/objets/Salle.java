package com.gestiondesalles.objets;

public class Salle {

	private int id, capacite;
	private String libelle;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Salle(int id, String libelle, int capacite) {
		this.id = id;
		this.libelle = libelle;
		this.capacite = capacite;

	}

	@Override
	public String toString() {
		String s = "La salle " + this.libelle + " avec l'identifiant " + this.id + " a une capacité de " + this.capacite
				+ " places. ";
		return s;
	}

}
