
public class BulletinScolaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
   Etudiant yann = new Etudiant("yann", "eloge");
   	  
	yann.saisieNotes(3);
	
   System.out.println("\nVoici Bulletin Scolaire monsieur: " + yann.getName()+"\n");
   System.out.println("Note Maximum: " + yann.getNoteMax()+"\n");
   System.out.println("Note Minimum: " + yann.getNoteMin()+"\n");
   System.out.println("Moyenne: " + yann.getMoyenne()+"\n");
   System.out.println("Décision Final: " + yann.decisionAnnee()+"\n");
  
  
   
   
   
   
   
     
 // Etudiant 2    
     
   
   Etudiant ships = new Etudiant("\nMahfuj", "Ships");
   
   System.out.println("**************Etudiant Suivant*****************\n");
	  
	ships.saisieNotes(3);
	
System.out.println("\nVoici Bulletin Scolaire monsieur: " + ships.getName()+"\n");
System.out.println("Note Maximum: " + ships.getNoteMax()+"\n");
System.out.println("Note Minimum: " + ships.getNoteMin()+"\n");
System.out.println("Moyenne: " + ships.getMoyenne()+"\n");
System.out.println("Décision Final: " + ships.decisionAnnee()+"\n");

                  ships.displayE();
   }
	

}
