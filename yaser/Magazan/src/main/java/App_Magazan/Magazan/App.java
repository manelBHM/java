package App_Magazan.Magazan;

import java.util.ArrayList;
import java.util.Map;



public class App 
{
    

	public static void main( String[] args )
    {
		
    	
  
    
    	 
    	  System.out.println("");
          System.out.println("bienvenue à notre magasin" );
    
  
      		 
    		 Product p1 = new Televesion ("(1) télévision : ", "hd", 599,"Samsong");
    		 Product p2 = new Frigo("(2) frigo", "côte-à-côte", 600, "americain");
    		 
    	    
    		
    		
        	   System.out.println();
      		 System.out.println("chosi votre product :"+"\n"); 
      		
      		System.out.println(p1+"\n "+p2);
               
      		Client y = new Client ("yaser","Fontenay sous bois");
      		y.toString();
      		System.out.println(y);
      		
      		Facture f = new Facture (y);
      		
      		Map<Product, Integer> listeProduits = f.getProduct();
      		
      		f.addProduct(p1, 1);
      		f.addProduct(p2, 2);
      	

   		f.resumePanier(listeProduits);

	System.out.println("Le total des commandes hors livraison est de " + f.totalProduct(listeProduits) + "  € ");

      		FileWriter file = new FileWriter("/home/simplonco/Bureau/EPEC/Test");
      		f.generate(file);
             
      			 
    }}      
    		 
    	
    		 

  
             
          
             
            
    		 
    		
             
             
			
			
			
			
			
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
         
        

