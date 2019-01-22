package com.compare;

import java.util.Comparator;


public class Stagiaire // implements Comparator<Stagiaire>

{
	/*
*
*
*
*
*/
	
	String nom;
	int age, id;
	
	public Stagiaire(String nom, int age, int id) {
		super();
		this.nom = nom;
		this.age = age;
		this.id = id;
	}

	
	public Stagiaire() {
		
	}


	// tri par ordre ascendant
	public static Comparator<Stagiaire> ageCompare = new Comparator<Stagiaire>() {
	public int compare(Stagiaire s1, Stagiaire s2) {
		int age1 = s1.age;
		int age2 = s2.age;
		return age1 - age2;
	}};
	// tri par ordre descendant
	public static Comparator<Stagiaire> ageDesCompare = new Comparator<Stagiaire>() {
		public int compare(Stagiaire s1, Stagiaire s2) {
			int age1 = s1.age;
			int age2 = s2.age;
			return age2 - age1;
		}};

	public static Comparator<Stagiaire> idCompare = new Comparator<Stagiaire>() {
		public int compare(Stagiaire s1, Stagiaire s2) {
			int id1 = s1.id;
			int id2 = s2.id;
			return id1 - id2;
		}};
		
	// triage par nom en ordre ascendant
	public static Comparator<Stagiaire> monCompare = new Comparator<Stagiaire>() {
		public int compare(Stagiaire s1, Stagiaire s2) {
			
			return s1.nom.compareTo(s2.nom);
		}};
		
		// triage par nom en ordre descendant
		public static Comparator<Stagiaire> monDesCompare = new Comparator<Stagiaire>() {
			public int compare(Stagiaire s1, Stagiaire s2) {
				
				return s2.nom.compareTo(s1.nom);
			}};
	
	@Override
	public String toString() {
		
		return ( " id "+ this.id+ " nom du stagiaire "+ this.nom+ " l'age "+this.age);
	}
	
	

}