package com.projet.inter;

import java.util.Date;
public class Personne {

	
	private String nom;
	private Date dateNais;
	private double salaire;
	
	
	 public Personne(String nom, Date dateNais, double salaire) { 
	
		
		this.nom =nom;
		this.dateNais = dateNais;
		this.salaire = salaire;                                
	
	 }

	 double calculerSalaire() {
		 
	double code = 0;
	if(code==1) {
		salaire = (salaire*0.1) + salaire;}
		
	 
		else if(code==2){
		  salaire = (salaire*0.2)+ salaire;}
		 return salaire;}
	 
	 
	 
    
    
	      
    
 public void  affiche() {
      System.out.println("Je m'appelle " + nom+". Je suis né le "+dateNais+". Mon salaire est de "+calculerSalaire() );
	 
}
}
