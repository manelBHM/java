package appStor;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Factuer {
	
	StringBuilder st =new StringBuilder(); 
	
	private Client client;
	private Liveresion livraison;
	
	private Map<Product, Integer> product = new HashMap<Product, Integer>();
	
	private double total = 0;

 
public void addProduct(Product product, Integer quantite ) {
		
		this.product.put(product, quantite);
		
	}


	
	public Factuer(Client client, Liveresion livraison) {
	super();
	this.client = client;
	this.livraison = livraison;
}



	public double totalProduct(Map<Product, Integer> product) {
		
		for (Entry<Product, Integer> element : this.product.entrySet()) {
			total +=livraison.getPrise()+ element.getKey().getPrice() * element.getValue();
		} 
	
		
		return total;
	}
	
	public void resumePanier(Map<Product, Integer> product) {
	System.out.println("Résumé de votre panier : " );
		for (Entry<Product, Integer> element : this.product.entrySet()) {
			System.out.println("- " + element.getValue()+ " " + element.getKey().getName());
		} 
		System.out.println("");
	}
	
	public StringBuilder resumePanier2(Map<Product, Integer> product) {
		for (Entry<Product, Integer> element : product.entrySet()) {
			 st.append("- " + element.getValue()+ " " + element.getKey().getName()+"<hr>");
	
					total +=livraison.getPrise()+ element.getKey().getPrice() * element.getValue();
		}
		st.append("total"+" "+total);
		return st;
	}


	public Client getClient() {
		return client;
	}


	public Map<Product, Integer> getProduct() {
		return product;
	}
 public void generate(FileWriter file) {
	 file.start();
	 file.writeLine("HomeShop Companie");
     file.writeLine("saint mandé 94100");
	 file.writeLine("");
	 file.writeLine("facture a l'atteotion de :");
	 file.writeLine(client.getFullName());
	 file.writeLine(client.getAdress());
	 file.writeLine("");
	 file.writeLine("mode de la livraison :");
	 file.writeLine("a domicile");
	 file.writeLine("");
	 file.writeLine("product : ");
	 file.writeLine(" " + this.getProduct());
	 
	 file.writeLine("----------------------------------------");
	 file.writeLine ("Résumé de votre panier : " );
		for (Entry<Product, Integer> element : this.product.entrySet()) {
			 file.writeLine("- " + element.getValue()+ " " + element.getKey().getName());}
		//writer.writeLine("Le total des commandes hors livraison est de " + totalProduct(product) + "  € ");
		
 
		 file.writeLine("");
		 
		 file.writeLine("livraison :"  );
		 file.writeLine("-------------------------------------");
		 file.writeLine("total :" + this.total);
		
		 
		 file.stop();
 }



public void infoLiv() {
	// TODO Auto-generated method stub
	
}



public double getPrise() {
	// TODO Auto-generated method stub
	return 0;
}
StringBuilder aficherrOutPut() {
	StringBuilder str = new StringBuilder("");

return str;
}}
