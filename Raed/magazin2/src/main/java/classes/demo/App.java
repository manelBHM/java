package classes.demo;

import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ///System.out.println( "Hello World!" );
    	//////////////////////////////////////////
    	
     	Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
    		Television tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
    		Fridge fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);
    		
    		Customer client1 = new Customer("Raed","108 Rue De Montigny");
    		
    		Bills bills = new Bills(client1,new PointRelais("Khartoum"));
    		bills.addProducts(cafe, 3);
    		bills.addProducts(tv, 5);
    		bills.addProducts(fridge, 2);
    		
    		Map<Product,Integer> get = bills.getProducts();
    		
    

		  bills.showAddedProducts(get);
  		
  		System.out.print(bills.getTotal());
	
		  
		  
		  
		/*
		 * //inserting data into filetxt try { FileWriter rf = new
		 * FileWriter("file_name.txt"); bills.puttingDataInFile(rf);
		 * 
		 * }catch(NoBillFound e) { e.getStackTrace(); }
		 */
		  
     
    }
}