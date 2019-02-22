package maven_projet1.products_maven;

 
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

 
 
public class Facture implements Delivery{
	
	private Client client;
	
	private Map<Product, Integer> products = new HashMap<Product, Integer>();
	
	private double total = 0;
	
	 
 
	
	
	
	public double getTotal() {
		return total;
	}

	public Facture() {
		// TODO Auto-generated constructor stub
	}
	
	public Facture(Client client) {
		
		this.client = client;
	}
	
	
	public void addProduit(Product produit, Integer quantitey ) {
		
		this.products.put(produit, quantitey);
		
	}
	
	public double totalProduits(Map<Product, Integer> produits) {
		
		for (Entry<Product, Integer> element : this.products.entrySet()) {
			total += element.getKey().getPrice() * element.getValue();
		} 
	
		
		return total;
	}
	
	public void addedProducts(Map<Product, Integer> produits) {
		System.out.println("Résumé de votre panier : " );
		for (Entry<Product, Integer> element : this.products.entrySet()) {
			System.out.println("- " + element.getValue()+ " " + element.getKey()    .getDescription());
		} 
		System.out.println("");
	}


	public Client getClient() {
		return client;
	}


	public Map<Product, Integer> getProduits() {
		return products;
	}
	
	public void generate(Writer writer) throws NoProductException {
		if(products.isEmpty())
			throw new NoProductException();
		
		writer.start();
	    writer.writeLine("HomeShop compagnie");
	    writer.writeLine("1 Place Charles de Gaulle, 75008 Paris");
	    writer.writeLine("");
	    writer.writeLine("Facture à l'attention de : ");
	    writer.writeLine(client.getNom());
	    writer.writeLine(client.getAdresse());
	    writer.writeLine("");
	    //writer.writeLine("Mode de livraison : " + delivery.getInfo());
	    writer.writeLine("Produits : ");
	    writer.writeLine("-----------------------------------------------------");
	    
	    for(Map.Entry<Product, Integer> element: products.entrySet()){
	    	Product product = element.getKey();
	    	Integer quantity = element.getValue();
	    	writer.writeLine(product.getNom()+" - "+product.getPrice()+" - "+quantity+"unite");
	    	writer.writeLine(product.getDescription());
	    	writer.writeLine(" ");
	    	
	    }
	    //writer.writeLine("Livraison : " + delivery.getPrice());
	    writer.writeLine("-----------------------------------------------------");
	    writer.writeLine("Total : " + this.getTotal());
	    writer.stop();
	
	    
	    
	    
	    
	    
	    
	    
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void getInfo() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
