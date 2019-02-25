package com.lesson.interface1;

public class Compte implements Convertible {
	
	int solde;
	String titulaire;
	int numero;
	
	
	
 

	public Compte(String s, int num) {
		super();
		this.titulaire = s;
		this.numero = num;
		solde =0;
	}
	
	public void afficher() {
		System.out.println("the sold is : "+solde);
	}

	void deposer(int montant) {
		this.solde = this.solde+montant;
	}

	void retirer(int montant) {
		this.solde = this.solde - montant;
	}


	public int toInt() {
		return solde;
	}

	
	
}
