package Tableau_Multidimension;
import java.util.*;

public class Tableau {

	
		public static int getLongueur(int[] tab)
		{
			return tab.length;
		}
	
		
		public static int getIndiceMax(int[] tab)
		{
			int iMax = tab[0];
			
			for(int i=0; i<tab.length; i++)
			{
				
				if(iMax < tab[i])
					
				  {
					  iMax = i;
				  }
			}
			
			return iMax;
		}
		
		
		
		
		public static int  getSomme(int[] tab)
		{
			
			int somme = java.util.stream.IntStream.of(tab).sum();
			return somme; 
		}
		
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] tab = {3, -8, 14, 4};
		int[] tab1 = {20};
		
	//	System.out.println(array.tostring(tab));
		     
	    System.out.println("Longueur du tableau est = " +  getLongueur(tab));
		System.out.println("La somme du tableau = " + getSomme(tab));
		System.out.println("Indice du Max du tableau = " + getIndiceMax(tab));
		
		for(int i = 0; i<tab.length; i++)
		{
			System.out.println(tab[i]);
		}
	     

	}

}
