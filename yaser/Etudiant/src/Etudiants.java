import java.util.Scanner;

public class Etudiants{

	private String name;
	
	private double []notes;
	
	private Scanner saisie =  new Scanner (System.in);
	
	public Etudiants(String name) {
		this.name=name;
		
	}
	
	public void saisieNotes(int nbNote) {
		notes = new double [nbNote];
		int note;
		for (int i = 0; i<nbNote; i++) {
			System.out.print("Saisissez une note : ");
			note =saisie.nextInt();
			notes [i] = note;
		}
		
	}
	public double moyenne() {
		
		double resultaMoyenne;
		double sommeTableau=0;
		for (int i=0; i<this.notes.length; i++) {
			sommeTableau += this.notes [i];
		}
		
		if (this.notes.length == 0) {
			System.out.print("Il n'y a pas de notes...");
		      return 0.0;
		}
		else {
		      double resultatMoyenne = sommeTableau / this.notes.length ;
		      return resultatMoyenne;
		    }
		
	}
	
	public double minimum() {

		double min = notes [0];
		for (int i=0; i<notes.length; i++) {
			if (notes [i] < min) {
				min=notes[i];
			}
				
		}
		return min;
	}
	
	public double maximum () {
		double max = notes [0];
		for (int i=0; i>notes.length; i++) {
			if (notes [i]>max) {
				max=notes[i];
			}
		}
		return max;
	}
	
	public boolean valide() {
	if ( this.moyenne() >= 10)	{
		return true;
	}
	else {
		return false;
	}
		
	}
	
	 public double getNote(int index){
		    return this.notes[index];
		  }

		 
		  public double[] getNotes(){
		    return notes;
		  }

		
	
	
	
	
	
	
	
	
	
	
	
}
