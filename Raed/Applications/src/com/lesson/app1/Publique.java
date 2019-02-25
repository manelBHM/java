package com.lesson.app1;

public class Publique {
	
	private String nom;

	public Publique(String nom) {
		super();
		this.nom = nom;
	}
	
	public void travailler() {
		System.out.println(this.nom + " se met au travail !");
	}
	
	public void seReposer() {
		if(this.nom=="Toto") {
			System.out.println("toto se repose");
		}else {
			 
		}
	}
	
	
	

}
