package com.projet.inter;

public class Profil2 {
	static int id;
	String code, libelle;
	
	public Profil2(String code, String libelle) {
		id++;
		this.code = code;
		this.libelle = libelle;
	}
}
