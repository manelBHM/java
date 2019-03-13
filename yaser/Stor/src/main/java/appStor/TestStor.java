package appStor;

import java.util.Map;



public class TestStor {

	public static void main(String[] args) {
     
		
		System.out.println("");
        System.out.println("bienvenue à notre magasin" );
  
        
        Product pr1 = new Televesion("(1) Televesion", "samsong", "hd", 550);
        Product pr2 =  new Frigo("(2) frigo", "LG", "côte-à-côte", 700);
        Product pr3 = new Fure("(3) four", "php", "noir", 400);
        
        
        System.out.println();
 		 System.out.println("chosi votre product :"+"\n"); 
 		
 		System.out.println(pr1+"\n "+pr2 + "\n"+ pr3);
 		
 		Client cl = new Client("yaser","fontenay sous ois");
 		
 		cl.toString();
 		
 		System.out.println(cl);
 		Factuer f = new Factuer (cl,new ExpressDelivery());
 		
 	


 		
  		Map<Product, Integer> listeProduits = f.getProduct();
  		
  		
  		
  		f.addProduct(pr1, 1);
  		f.addProduct(pr2, 2);
  		f.addProduct(pr3, 2);
  		
  		
  		System.out.println("liveresion Express ");
  	

		f.resumePanier(listeProduits);

System.out.println("Le total des commandes hors livraison est de " + f.totalProduct(listeProduits) + "  € ");

FileWriter file = new FileWriter("/home/simplonco/Bureau/EPEC/Test1");
	f.generate(file);
		
		
		

	}

}
