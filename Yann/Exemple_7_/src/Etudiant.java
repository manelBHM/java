
import java.util.Scanner;
public class Etudiant {
	
	public double min, max, moyenne, somme, nmbreMatiere;
	public String nom, prenom;
	public double notes[];
	public int nmbreE=0;
	
	


// Constructor
	
	public Etudiant(String nom, String prenom)
	{
		super();
		this.nom= nom;
		this.prenom=prenom;
		nmbreE+=1;
	}
	
	
	public void displayE()
	{
		System.out.println("le nombre d'étudiant est: " + (nmbreE+=1));
	}
	
		
	
	
	// Methode pour afficher le nom de l'étudiant
	
	public String getName() 
	{
		return nom + " " + prenom;
	}
	
	
	
	
	// Methode pour saisir les notes de l'étudiant
	
	public void  saisieNotes(int nmbreMatiere)
	
	{
		// Je declare un tableau de type double qui sera rempli par les notes saisies par l'étudiant;
		
		 notes = new double[nmbreMatiere];
		
		Scanner sc = new Scanner(System.in);
		
	       
		  for(int i=0; i<nmbreMatiere; i++)
		  
		  {  System.out.println("Entrez votre note numero "+ (i+1));
			  notes[i] = sc.nextInt();
		  }
		
		      
	}
	
	
	
	
	
	
	// Methode pour Afficher la note Maximum () ==> de l'étudiant
	

    public double getNoteMax() 
    
{   	  
   	 max = notes[0];
   	 
   	 for(int i=0; i<notes.length; i++)
   	 {
   		 if (max < notes[i]) {
   			 max = notes[i];

   		 };
   	 }
   	 return max;
}
	
	  
     
 // Methode pour Afficher la note Minimum () ==> de l'étudiant
     
     public double getNoteMin() 
     
     {   
    	 min = notes[0];
    	 
    	 for(int i=0; i<notes.length; i++)
    	 {
    		 if (min > notes[i]) {
    			 min = notes[i];
    		 };
    	        
    	 }
    	 return min;
     }   
     
     
 
   
  // Methode pour Afficher la Moyenne () ==> de l'étudiant   
     
 public double getMoyenne()
 {
	 moyenne = 0.0; somme=0.0;
	 
	for (int i=0; i<notes.length; i++)
	{
		somme = somme + notes[i];
	}
	
	moyenne = somme/notes.length;
	
	return moyenne;
 }
  
 
 
//Methode pour Afficher la Décision Final  () ==> 
	
public String decisionAnnee()

{
	String dFinal = " ";
	
	if(moyenne>=10) {dFinal = "Année valider";}
	
	else {dFinal= "Année non valider";}
	return dFinal;
}
     


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
