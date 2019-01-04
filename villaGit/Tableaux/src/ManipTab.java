
public class ManipTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] tab = {1,4,2,6,9,12,5};
		int [] tabCopi = null ; 
		
		  copier(tab); 
		 afficher (tab);
		
	}
	
       static int [] copier ( int[] tab) {
		int [] tabCopi = (int []) tab.clone();   // copier un tableau tab = tabCopi 
		System.out.println(" tabCopi est : ");
		return tabCopi; 

	}
       static void afficher(int[] tab) {
           
       	for ( int i = 0 ; i < tab.length ; i++)
       	{
       		
           System.out.print("     " + tab[i] );
       	}
       System.out.println();    // Saut de ligne à la fin de l'affichage
   }
	 

}
