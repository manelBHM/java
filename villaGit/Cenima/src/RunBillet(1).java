import java.util.Scanner;

public class RunBillet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println(" Hello :  vous pretes pour un film ce weekend : ");
		
		System.out.println("Vous etes combien des personnes ? ");
		int nbrePersonne = clavier.nextInt();
				
				if (nbrePersonne >0 ) {
					 
					 System.out.println(" Combien des enfants moins que  5 ans parmi vous ? ");
					  int nbreEnfant = clavier.nextInt();
					 prixBilletsEnfant(nbreEnfant);
					 
					 System.out.println(" Combien des personnes qui ont plus que 60 ans ? ");
					 int perAge = clavier.nextInt();
					 prixBilletsAge(perAge);
					 
					 System.out.println(" Combien des personnes qui resident ici a Montreuil ? ");
					 int perResidant = clavier.nextInt();
					 int perNonResidant = nbrePersonne - perResidant - nbreEnfant - perAge ; 
					 prixBilletsAdulte(perResidant, perNonResidant );
					 
					 int prixTotal = prixBilletsAge(perAge) + prixBilletsAdulte(perResidant, perNonResidant ) ;
					 
					 System.out.println(" ***************************************************** ");
					 System.out.println("" + afficheFacture( nbreEnfant,  perAge,  perResidant,  perNonResidant ));
					 
					 System.out.println(" ***************************************************** ");
					 System.out.println(" Votre devez payer en total  : " + prixTotal+ " euros ");
				}
				else System.out.println("  etes vous du nombre de personnes que vous avez saisi ?? .. "+ nbrePersonne + " est imcomprehensible ? ");
	           
	     
	           
	      	// int prixTotal = prixEnfant + prixAge + prixBilletsAdulte;
			 
	}



	public static int  prixBilletsAdulte(int perResidant , int perNonResidant ) {
		// TODO Auto-generated method stub
		int prixBilletsAdulte ;
		prixBilletsAdulte = (perResidant * 4 ) +(perNonResidant*8 );
		 
		String factureAdulte = " ffffff";
	   return prixBilletsAdulte ;
	}



	public static int prixBilletsAge(int perAge ) {
		// TODO Auto-generated method stub
		
		 int prixAge = perAge + 5 ;
		 return prixAge;
	}



	public  static int prixBilletsEnfant(int nbreEnfant) { // gratuit en fait lol 
		// TODO Auto-generated method stub
	  
			int prixEnfant = nbreEnfant * 0; 
			return prixEnfant ;
		
	}
	

	
	
	public static String afficheFacture(int nbreEnfant, int perAge, int perResidant, int perNonResidant ) {
		// TODO Auto-generated method stub
		String facture ="";
		
		     
			 facture = " Votre facture finale detaillée est  :\n *  "
			 + nbreEnfant+ " billets gratuits   \n * "
			 + perAge +" billets a tarif + 60 ans pour " +prixBilletsAge( perAge )+" euros  \n * "
			 + perResidant +" billets a tarif adulte pour  "+prixBilletsAdulte( perResidant ,  perNonResidant )+" euros \n * dont "
			 + perNonResidant + " billet a tarif normal non residant  a  8 euros  \n ";
			 
		  
		return facture ;
		
	}


     
	 

}
