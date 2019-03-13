package com.salle;

import java.util.ArrayList;
import java.util.List;

import com.interSalle.Isalle;

public class Salle {

	int id;
	private String libelle;
	private int capacite;
	private boolean disp;
    static int com;
	public Salle() {
		super();
	}

	public Salle(String libelle, int capacite) {
		id = ++com;
		this.id = id;
		this.libelle = libelle;
		this.capacite = capacite;

	}

	public int getId() {
		return id;
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

	public boolean isDisp() {
		return disp;
	}

	public void setDisp(boolean disp) {
		this.disp = disp;
	}
   @Override
public String toString() {
	
	return " id= "+this.getId()+" " + this.getLibelle()+" capacité " +this.getCapacite();
}



}
