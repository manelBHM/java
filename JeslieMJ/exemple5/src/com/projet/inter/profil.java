package com.projet.inter;

public class profil {


	private int code;
	private String libelle;
	
	
	public profil(int code, String libelle) {
		
		
		this.code = code;
		this.libelle=libelle;}
		
		public void affiche () {
			
			System.out.println("Mon code est le "+code+" . Je suis un "+ libelle);
		}
		
	}


