package application4;

public class RunApplication4 {


	
public static void affiche (int tab []) {
	System.out.println("Le tableau :   "  );
	for ( int i =0 ; i<tab.length ; i++ ) {
		
		System.out.print ("     "+tab[i]);
	}
	System.out.println();
	System.out.println("***********************************");
}
	
	
public static  void remplir1 (int tab [] ) {
		
		for ( int i = 0 ; i < tab.length ; i++ ) {
			 tab[i] = i ;
			
		}
	 
	}
	
public static  void remplir2 (int tab [] ) {
		
		for ( int i = 0 ; i < tab.length ; i++ ) {
			 tab[i]  = i+ 5 ;
			
		}
	 
	}


public static void remplir3 ( int tab[]) {
	
}

public static int  operation1 (int tab[]) {
	int element9 =0; 
	for ( int i=0 ; i< tab.length ; i++) {
		
		if ( tab[i]== 9 ) { element9++ ;}
		  
	}
	return element9 ;
}



public static int  operation2 (int tab[]) {
	int elementTrouve =0; 
	for ( int i=0 ; i< tab.length ; i++) {
		
		if ( tab[i]> 4 || tab[i]<2) { elementTrouve++ ;}
		  
	}
	return elementTrouve ;
}

public static void operation3 ( int tab[]) {
	int somme = 0 ;
	for (int i = 0 ; i< tab.length ; i++ ) {
		
		somme = somme + tab[i];
				
	}
	System.out.println(" la somme totale du tableau est "+ somme ); 
}

public static void operation4 ( int tab[]) {
	int moyenne  = 0 ;
	int somme = 0 ;
	for (int i = 0 ; i< tab.length ; i++ ) {
		
		somme = somme + tab[i];
				
	}
	 moyenne = somme / tab.length;
	System.out.println(" la moyenne  du tableau est "+ moyenne ); 
}

public static void operation5(int tab[]) {
	int max = tab[0] ;
	for ( int i =0 ; i<tab.length-1 ; i++) {
		if ( tab[i+1] > tab[i])  max = tab[i+1];
	}
	System.out.println(" Le plus grand du tableau est : " + max);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int tab1 [] = new int[10];
		int tab2 [] = new int[10];
		
		remplir1(tab1);  affiche(tab1);
		remplir2(tab2);   affiche(tab2);
		// remplir3(tab1);   affiche(tab1);
		
		 
		System.out.println("il y a : "  + operation2(tab1) );
		System.out.println(" le numero 9 est repeté   " +  operation1(tab1) +" fois "  );
		operation3(tab1);
		operation4(tab1);
		
		operation5(tab1);
	}
	
	

}
