package co.simplon.BOX;

import java.util.ArrayList;

public class Personne {

	
	String nom;
	ArrayList<Box> listeBox = new ArrayList<Box>();
	public Personne(String nom, ArrayList<Box> listeBox) {
		this.nom = nom;
		this.listeBox = listeBox;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
