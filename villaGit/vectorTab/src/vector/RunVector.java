package vector;

import java.util.*;

public class RunVector {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> tab = new ArrayList();

		tab.add(3);
		tab.add(-4);
		tab.add(14);
		tab.add(8);

		// Collections.sort(tab);
				
		System.out.println(tab);
		System.out.println("La liste a " + tab.size() + " elements ");
         
		int maxTab = Collections.max(tab); // cherche le max
		int indexMax = tab.indexOf(maxTab) ;  // affiche index suivant l'insertion et pas selon ordonner 
		int minTab = Collections.min(tab);// chercher le min 
		int indexMin = tab.indexOf(minTab);

		

		System.out.println(tab); // afficher ma liste 
		 

        // recuperer l'indicxe du grand et de petit 

		System.out.println("Le maximum est : " + maxTab + " et son emplacement est  " + indexMax);
		System.out.println("Le minimum est : " + minTab + " et son emplacement est  " + indexMin);
		
		Scanner clavier = new Scanner(System.in);
		System.out.println(" Vous voulez inserez un nouveau element dans la liste : " + tab);
		System.out.println(" Element : ");
		int entree = clavier.nextInt();

		tab.add(entree); // automatiquement a la fin 
		// 

		// Collections.sort(tab); // trier ma liste avant affichage 
		// System.out.println(tab);
		
		int somme =0;
		for ( int i : tab) {
			somme =somme +  tab.get(i);
		}
			
		 System.out.println("la somme des elements du tableaux est : " + somme);
	}

}