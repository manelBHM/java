package maven_projet1.products_maven;

import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NoProductException
    {
        //System.out.println( "Hello World!" );
    	
		
		
    	Tele tele = new Tele("Samsung", "Téléviseur OLED", 800, 40);
		Four four = new Four("Samsung", "Four micro-onde à double rotative", 70, 100);
		Frigo frigo = new Frigo("Siemens", "frigo qui fait du froid", 200, 'A');

		Client client = new Client("Raed", "108 rue de Montigny");

		Facture facture = new Facture(client);

		facture.addProduit(tele, 1);
		facture.addProduit(frigo, 1);
		facture.addProduit(four, 2);

		Map<Product, Integer> listeProduits = facture.getProduits(); ///??????????

		//Panier products
		facture.addedProducts(listeProduits);

		System.out.println("Le total des commandes hors livraison est de " + facture.totalProduits(listeProduits) + " euros");

		
		FileWriter file = new FileWriter("file.txt");
		//facture.generate(file); we can't print it out as it's fileWriter 
		 
		
		  try { 
			  facture.generate(file); 
			  }catch(NoProductException e){ 
				  e.getMessage();
		  
		  }
		 
		
    }
}
