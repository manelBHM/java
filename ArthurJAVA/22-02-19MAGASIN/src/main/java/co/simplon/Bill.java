package co.simplon;

//import java.io.Writer;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Bill {
	double total = 0;
	Client client;
	Map<Produit, Integer> mapClient = new HashMap<Produit, Integer>();
	public Bill(Client client) {
		this.client = client;
	}
	
	public void addProduct(Produit produit, Integer quantity) {
		mapClient.put(produit, quantity);
		
	}

	@Override
	public String toString() {
		return "Bill [products=" + mapClient + "]";
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Map<Produit, Integer> getProducts() {
		return mapClient;
	}

	public void setProducts(Map<Produit, Integer> prod) {
		this.mapClient = prod;
	}
	
	public double totalProduit(Map<Produit, Integer> mapClient) {
		for(Entry<Produit, Integer> element : this.mapClient.entrySet()) {
			total += (element.getKey().getPrice())*element.getValue();
		}
		return total;
	}
	
	public void generate(Writer writer)  {
		//if(mapClient.isEmpty()) {
			//throw new NoProductInBillException();
		
		writer.start();
		writer.writeLine("MAGASIN DU CENTRE");
		writer.writeLine("8 avenue du chat qui pêche, 85300, Bresse-sur-arlèse");
		writer.writeLine("");
		writer.writeLine(client.getFullname());
		writer.writeLine(client.getAddress());
		writer.writeLine("");
		writer.writeLine("Mode de livraison ");
		writer.writeLine("");
		writer.writeLine("Produits :");
		writer.writeLine("----------------------------------------");
		for(Entry<Produit, Integer> entry : this.mapClient.entrySet()) {
			Produit produit = entry.getKey();
			Integer quantity = entry.getValue();
		writer.writeLine(produit.getName() + "-" + produit.getPrice() + "-" + quantity + " unité(s)");
		writer.writeLine(produit.description);
		writer.writeLine("");

		}
		writer.writeLine("Livraison " );
		writer.writeLine("----------------------------------------");
		writer.writeLine("Total :" + this.totalProduit(mapClient));
		writer.stop();
	

		
		
	}
    
	
}
