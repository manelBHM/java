package com.lesson9one;

public class MonApp {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		  try {
		        Ville v1 = new Ville ("Lyon", 10);
		        Ville v2 = new Ville("Lille",100);
		        Ville v3 = new Ville("Nice",-2);
		        
		        System.out.println(v1.presenteToi());
		        System.out.println(v2.presenteToi());
		        System.out.println(v3.presenteToi());
		        
		        } catch ( NombreHabitantException  | NomVilleException e1) { e1.printStackTrace(); }
		        
		        
		        
		        try {
		        Capitale c1 = new Capitale("Paris", 20 ,"France");
		        Capitale c2 = new Capitale("Berlin",-1,"Allmagne");
		        Capitale c3 = new Capitale("Damas",-1,"Syrie");
		        
		        
		        
		        System.out.println(c1.presenteToi());
		        System.out.println(c2.presenteToi());
		        System.out.println(c3.presenteToi());
		        
		        } catch (NombreHabitantException | NomVilleException e ) {  System.out.println(e.getMessage());};

	}

}
