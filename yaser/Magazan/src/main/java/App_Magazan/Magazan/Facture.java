package App_Magazan.Magazan;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Facture {
private Client client;
	
	private Map<Product, Integer> product = new HashMap<Product, Integer>();
	
	private double total = 0;
	
	public Facture() {
		// TODO Auto-generated constructor stub
	}
	
	public Facture(Client client) {
		
		this.client = client;
	}
	
	
	public void addProduct(Product product, Integer quantite ) {
		
		this.product.put(product, quantite);
		
	}
	
	public double totalProduct(Map<Product, Integer> product) {
		
		for (Entry<Product, Integer> element : this.product.entrySet()) {
			total += element.getKey().getPrise() * element.getValue();
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


	public Client getClient() {
		return client;
	}


	public Map<Product, Integer> getProduct() {
		return product;
	}
 public void generate(Writer writer) {
	 writer.start();
	 writer.writeLine("HomeShop Companie");
     writer.writeLine("saint mandé 94100");
	 writer.writeLine("");
	 writer.writeLine("facture a l'atteotion de :");
	 writer.writeLine(client.getNom());
	 writer.writeLine(client.getAdresse());
	 writer.writeLine("");
	 writer.writeLine("mode de la livraison :");
	 writer.writeLine("a domicile");
	 writer.writeLine("");
	 writer.writeLine("product : ");
	 writer.writeLine(" " + this.getProduct());
	 
	 writer.writeLine("----------------------------------------");
	 writer.writeLine ("Résumé de votre panier : " );
		for (Entry<Product, Integer> element : this.product.entrySet()) {
			 writer.writeLine("- " + element.getValue()+ " " + element.getKey().getName());}
		//writer.writeLine("Le total des commandes hors livraison est de " + totalProduct(product) + "  € ");
		
 
		 writer.writeLine("");
		 
		 writer.writeLine("livraison :"  );
		 writer.writeLine("-------------------------------------");
		 writer.writeLine("total :" + this.total);
		
		 
		 writer.stop();
 }
	
}
