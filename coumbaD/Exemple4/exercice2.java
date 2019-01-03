import java.util.Scanner;

public class exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner (System.in);
		
		System.out.println("Quel plat désirez vous??");
		System.out.println("1- Un plât au Poulet ?");
		System.out.println("2- Un plât au Poisson ?");
		System.out.println("3- Un plât au Boeuf ?");	
		
		String carte = sc.nextLine();
		
		if(carte.equals("poulet")) {
			System.out.println ("Votre plât au Poulet seras servi dans 15min");
		}

		else if(carte.equals("boeuf")) {
		System.out.println("Votre plat au boeuf est servi");}
		
		else if (carte.equals("poisson")) {
		System.out.println("Votre plat au poisson est servi");}
		
		else {
			System.out.println("Adressez vous à la serveuse s'il vous plaît !!");}
		
		/*
		int a = sc.nextInt();
		
		if(a==1){
		System.out.println("Votre plat au poulet est servi"); 
		
		}
		else if(a==2){
		System.out.println("Votre plat au boeuf est servi");}
		
		else if (a==3){
		System.out.println("Votre plat au poisson est servi");}
		
		else {
			System.out.println("Adressez vous à la serveuse s'il vous plaît !!");}
		}
		*/
	/*	
	   int carte = sc.nextInt();
	   
	   switch (carte){
	   
	   case 1 :
	   System.out.println("Votre plat au poulet est servi"); 
	   break;
	
	   case 2: System.out.println("Votre plat au boeuf est servi");
	   break;
	
	   case 3:
	   System.out.println("Votre plat au poisson est servi");
	   break;
	   default:
	   System.out.println("Adressez vous à la serveuse s'il vous plaît !!");
	}
	*/
		
	}

}