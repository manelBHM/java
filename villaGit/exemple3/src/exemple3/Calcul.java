package exemple3;

public class Calcul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int a = 5 , b = 2 , iresultat , imod ; 
		double c =5 , d = 2, dresultat, dmod ;
		
		iresultat = a/b;
		System.out.println(" resulat iresultat est : " + iresultat);
		
		
		imod = a%b;
		System.out.println(" resultat imod est : "+ imod);

		
		
		dresultat = (double) (c/d) ;
        System.out.println(" resulat dresultat est : " + dresultat);
		
        
		dmod = (double) ( c % d);
		System.out.println(" resultat dmod est " + dmod);
		
		
	}

}
