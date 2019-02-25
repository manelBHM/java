import java.util.Scanner;

public class Etudiant {
	Scanner sc = new Scanner(System.in);
	
	int moyenne;
	String nom;
	int tab[];
	int nbMatiere;
	
	
	  public Etudiant (String nom) {
		  this.nom = nom;
		  
		  
		  
	
		 
		  
	  }
	  
	  public void Saisie(int nbMatiere) {
		  
		  tab = new int [nbMatiere];
		  
		  
		  for (int i=0; i<=nbMatiere;i++) {
			  
			  tab[i] = sc.nextInt();
			  
			  
			  
			  
		  }
		  
	  }
	
	public int Moyenne () {
		
		int moy = 0, som = 0;
		
		for (int i =0; i<tab.length; i++) {
			som = som + tab[i];
		}
		moy = moy/tab.length;
		
		return moyenne;
	}
	
	public int Minimale() {
		
		int max = tab[0];
		for (int i =0; i<tab.length; i++) {
			if (max<tab[i]) {
				max=tab[i];
			}
			
		}
		
		return min;
}
	
	
	
	
	
	
	
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

}