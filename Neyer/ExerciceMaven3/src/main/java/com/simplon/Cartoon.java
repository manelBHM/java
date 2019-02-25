package com.simplon;

public class Cartoon {
	
	private String nom;
	private String adj;
	
	
	public Cartoon(String nom) {
		
		this.nom=nom;
		
	}
	
	public Cartoon() {
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getAdj() {
		return adj;
	}

	public void setAdj(String adj) {
		this.adj = adj;
	}

	
	/*public void bipBip() {
		for(int i = 0; i<10;i++) {
			System.out.println("BIP BIP!");
		}
	}*/

}
