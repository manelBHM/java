package co.hamza.TomEtJerry.animaux;

import java.util.Random;

public class Souris {
	
	private int nbSouris = 1500;
	private int nbSourisMortes = 0;
	private int nbSourisZoneA = 0;
	private int nbSourisZoneB = 0;
	private int nbSourisZoneC = 0;
	private int nbSourisZoneD = 0;
	
	public Souris() {
		// TODO Auto-generated constructor stub
	}
	
	public void changerDeZone() {
		
	}
	
	public void randomSouris() {
		Random hasard = new Random();
	
//		while(nbSouris>0) {
		 nbSourisZoneA = hasard.nextInt(nbSouris);
		 System.out.println("Le nombre de souris dans la zone A est de : " + nbSourisZoneA);
		 nbSourisZoneB = hasard.nextInt(nbSouris-nbSourisZoneA);
		 System.out.println("Le nombre de souris dans la zone B est de : " + nbSourisZoneB);
		 nbSourisZoneC = hasard.nextInt(nbSouris-(nbSourisZoneA+nbSourisZoneB));
		 System.out.println("Le nombre de souris dans la zone C est de : " + nbSourisZoneC);
		 nbSourisZoneD = nbSouris - (nbSourisZoneA + nbSourisZoneB + nbSourisZoneC);
		 System.out.println("Le nombre de souris dans la zone D est de : " + nbSourisZoneD);
		 
		 
//	}
//		return i;
	}

	public int getNbSouris() {
		return nbSouris;
	}

	public void setNbSouris(int nbSouris) {
		this.nbSouris = nbSouris;
	}

	public int getNbSourisMortes() {
		return nbSourisMortes;
	}

	public void setNbSourisMortes(int nbSourisMortes) {
		this.nbSourisMortes = nbSourisMortes;
	}
	
	
	
	

}
