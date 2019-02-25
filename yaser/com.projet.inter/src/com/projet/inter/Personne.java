package com.projet.inter;

import java.sql.Date;

public class Personne implements Ipersonne {
	
	private int id;
	private String nome;
	private String prenome;
	private Date date;
	private double salaire;

	Personne (int id, String nome, String prenome, Date date, double salaire){
	this.id =id;	
	this.nome=nome;
	this.prenome=prenome;
	this.date=date;
	this.salaire=salaire;
	
	
	
	}

public void afiche() {
	
	
		System.out.println("je suis" + nome + prenome + " et j'né le " + date + " et mon salaire  :" + salaire);
	}

	public double calculerSalaire() {
		double salaire;
	
						
		return 0;
	}
	
	
}
