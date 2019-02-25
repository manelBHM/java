package com.lesson8;

import java.util.Scanner;

public class Etudiant  {
	
	
	protected String Nom;
	protected String prenom;
	protected Double[] notes;
	 
	
	Scanner scan = new Scanner(System.in);
 
	
	
	public Etudiant(String leNom) {
		super();
		this.Nom = leNom;
	}
	
	
	
	public void  getNom() {
		System.out.println("hello : "+this.Nom);
		
	}
	
	
	
	
	
	
	
	
	
	public void enterNotes(int nbrNotes) {
		notes = new Double[nbrNotes];
		
		double input;
		for(int i=0;i<nbrNotes;i++) {
			System.out.println("enter  your notes pls : ");
			input = scan.nextInt();
			notes[i] = input;
		}
 	
		}
		
		
		//
		public double minimum() {
			double m = notes[0];
			
			for(int i =0;i<notes.length;i++) {
				
				if(m < notes[i]) {
					m=notes[i];
				} 
			}
			return m;
		}
		
		
		
		
		
		
		//
		public double maximum() {
			double max = notes[0];
			for(int i=0;i<notes.length;i++) {
				if(notes[i] > max) {
					max = notes[i];
				}
			}	 
			return max;
		}
		
		
		
		
		public double moyen() {
			double moy = notes[0];
			double sum = 0,result;
			
			for(int i=0;i<notes.length;i++) {
				sum = sum+notes[i];
			}
			
		 
			return result =sum/notes.length;
		}
		 
		
		
		public String valid() {
			String pass;
			if(moyen() >= 10) {
				pass = "u passed your year successfully ";
			}else {
				pass ="sorry you could not make it ";
			}
			
			
			
			
			return pass;
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	 
	
	
	


