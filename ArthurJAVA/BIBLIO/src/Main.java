import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


import java.util.List;



public class Main {


	public static void main(String[] args) {
		
		
	
		
		
	Scanner sc = new Scanner(System.in);
	
	List<String> l = new LinkedList<String>(Arrays.asList("livre1","livre2", "livre3", "livre4"));
	//List<String> l = Arrays.asList("livre1","livre2", "livres3", "livres4"); 
	List<String> li = new LinkedList<> ();


	String texte = "BIENVENUE A LA BIBLIOTHEQUE DU FUTUR LES ENFANTS" + "\n" + "\n";
	int nombreEspaces = (int) 70 - texte.length() / 2;
    for(int i = 0; i<nombreEspaces; i++){
        System.out.print(" ");
    }
    
    System.out.println(texte);
	
	
	
	//System.out.println("BIENVENUE A LA BIBLIO");
    System.out.println("Veuillez vous indentifier, entrez votre nom :");
    String nom = sc.nextLine();
    if(nom.equals("Nabil")) {
    	for(int i=0; i<100; i++) {
    	System.out.print("ABORT");}
    	System.exit(0);
    }
    System.out.println("Entrez votre ID :");
    int id = sc.nextInt();
    Personne pers = new Personne(nom, id);
    boolean rester = true;

    
    System.out.println("Bienvenue " + pers.getName() + " Votre ID est : " + pers.getId());
    
    
    do {
        
    System.out.println(" Que souhaitez vous faire ?" + "\n" + "1 : consulter les livres disponibles" + "\n" 
    		+ "2 : retirer" + "\n" + "3 : rendre" + "\n" + "4 : quitter");
    
    
    int choix = sc.nextInt();
    
    
    switch(choix) {
    
    
      case 1 : System.out.println("les livres dispo sont : " + l.toString() + "\n" + " Voulez vous rester ? 1 : Oui / 2 : Non");
             int var = sc.nextInt();
             if(var== 2) {
            	 rester = false;
            }
             break;
             
             
             
             
             
      case 2 : System.out.println("Quel livre voulez vous retirer ? :");
             Scanner sc1 = new Scanner(System.in);             
             String aRetirer = sc1.nextLine();
             if (l.contains(aRetirer)) {
            	 li.add(aRetirer);
            	 int za = l.indexOf(aRetirer);
            	 l.remove(za);
            	 System.out.println("Vous avez choisi " + aRetirer.toUpperCase() + "\n" + "votre panier est : " + li.toString().toUpperCase() + "\n" + " Voulez vous rester ? 1 : Oui / 2 : Non");
            	 
            	 int var2 = sc.nextInt();
                 if(var2== 2) {
                	 rester = false;
                }
             }
             else {
            	 System.out.println("Ce livre n'est pas dans notre DB" + "\n");
             }
             break;
             
             
    	
      case 3 : System.out.println("Quel livre voules vous retirer ? :");
    Scanner sc2 = new Scanner(System.in);             
    String aRendre = sc2.nextLine();
    if (li.contains(aRendre)) {
   	 l.add(aRendre);
   	 int zb = li.indexOf(aRendre);
   	 li.remove(zb);
   	 System.out.println("Vous avez rendu " + aRendre.toUpperCase() + "\n" + "votre panier est : " + li.toString().toUpperCase() + "\n" + " Voulez vous rester ? 1 : Oui / 2 : Non");
   	 
   	 int var2 = sc.nextInt();
        if(var2== 2) {
       	 rester = false;
       }
    }
    else {
   	 System.out.println("Ce livre n'est pas dans notre DB" + "\n");
    }
    break;
    	
    	
    	
    case 4 : System.out.println("Etes vous sur de quitter ? 1 : Oui / 2 : Non");
    int var2 = sc.nextInt();
    if(var2== 1) {
   	 rester = false;}
    	
    }
    
    
	} while(rester);

}
}
