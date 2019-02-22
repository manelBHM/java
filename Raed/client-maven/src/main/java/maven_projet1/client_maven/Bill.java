package maven_projet1.client_maven;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Bill {
	
	
	private Customer customer;
	private Map<Product, Integer> products = new HashMap<Product ,Integer>();
	
	public Bill(Customer customer) {
		super();
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Map<Product, Integer> getProducts() {
		return products;
	}

	public void setProducts(Map<Product, Integer> products) {
		this.products = products;
	}
	
	
	
	public void addProduct(Product product,Integer quantity) {
		this.products.put(product, quantity);
		
	}
	
	public void show(Map<Product,Integer> pr){
		for(Entry<Product, Integer> s:pr.entrySet() ) {
			System.out.println(s.getKey()+" : "+s.getValue()); 
		}
		System.out.println("");
	}
	

}
