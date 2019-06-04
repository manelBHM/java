package maven_projet1.customer_maven;

import java.util.HashMap;
import java.util.Map;

public class Bill{
 

	private Customer  customer;	
	private Map<Product, Integer> products = new HashMap<Product, Integer>();
	
	 private Delivery delivery;
	
	
	
	public Bill(Customer customer) {
		super();
		this.customer = customer;
	}
	
	

	public Bill(Customer customer, Delivery delivery) {
		super();
		this.customer = customer;
		this.delivery = delivery;
	}



	public Customer getCustomer() {
		return customer;
	}
 
	public Map<Product, Integer> getProducts() {
		return products;
	}
 
 
	public void addProduct(Product product,Integer quantity) {
		this.products.put(product, quantity);
		
	}
	
	
	//stop
 
	public void generate(Writer writer) {
		 writer.start();
		    writer.writeLine("HomeShop compagnie");
		    writer.writeLine("1 Place Charles de Gaulle, 75008 Paris");
		    writer.writeLine("");
		    writer.writeLine("Facture à l'attention de : ");
		    writer.writeLine(customer.getFullname());
		    writer.writeLine(customer.getAddress());
		    writer.writeLine("");
		    //writer.writeLine("Mode de livraison : " + delivery.getInfo());
		    writer.writeLine("");
		    writer.writeLine("Produits : ");
		    writer.writeLine("-----------------------------------------------------");
		    for (Map.Entry<Product, Integer> entry : products.entrySet()) {
		        Product product = entry.getKey();
		        Integer quantity = entry.getValue();
		        writer.writeLine(product.getName() + " - " + product.getPrice() + " - " + quantity + " unité(s)");
		        writer.writeLine(product.getDescription());
		        writer.writeLine("");
		    }
		    //writer.writeLine("Livraison : " + delivery.getPrice());
		    writer.writeLine("-----------------------------------------------------");
		    writer.writeLine("Total : " + this.getTotal());
		    writer.stop();
		
	}
	
	public double getTotal() {
		
		return 0;
	}
	
	
	/**
	 * get the total price for the current bill, including products and delivery cost
	 * @return total price
	*/
	
	/*
	public double getTotal() {
	double total = delivery.getPrice();
	    for (Map.Entry<Product, Integer> entry : products.entrySet()) {
	        Product product = entry.getKey();
	        Integer quantity = entry.getValue();
	        total += product.getPrice() * quantity;
	    }
	    return total;
	}
	*/
	

 
	
	}