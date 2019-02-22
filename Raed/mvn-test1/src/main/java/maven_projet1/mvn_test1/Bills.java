package maven_projet1.mvn_test1;

import java.util.HashMap;
import java.util.Map;

public class Bills {
	
	private Delivery delivery;
	private Customer customer;
	private Map<Product, Integer> products = new HashMap<Product,Integer>();

 
	
	//define an constructor that takes Customer and Delivery as input 
	public Bills(Customer customer, Delivery delivery) {
		this.customer = customer;
		this.delivery = delivery;

		
	}

 
	
	public double getTotal() {
		System.out.println("printing out the total price");
		delivery.getInfo();
		double total = 0.0 ;
		for(Map.Entry<Product, Integer> element:products.entrySet()) {
			//total += element.getKey().getPrice()  * element.getValue();	
			total += delivery.getPrice()+ element.getKey().getPrice()  * element.getValue();	
		}
		
	 return total;
	}
 

 

	public Bills(Customer customer) {
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
	
	//adding products 
	public void addProducts(Product product,Integer quantity) {
		this.products.put(product, quantity);
	}
	
	//showing products 
	public void showAddedProducts( Map<Product, Integer> prod){
		System.out.println("Résumé de votre panier : " );
		for(Map.Entry<Product, Integer> elements:this.products.entrySet()) {
			
			//System.out.println(elements.getKey()+":"+elements.getValue());
			//System.out.println("-----" + elements.getValue()+ " " + elements.getKey()    .getDescription());
			
			//trying to change getValue and getKey() position
			System.out.println("nb of orders = " +elements.getValue()+":  "+ elements.getKey().getDescription()+ " \n" + elements.getKey().getName()+" \n"+elements.getKey().getPrice()
					+" \n");
		}
		System.out.println("");
	}
	
	
	//write a method that store data in a filetext 
	
	public void puttingDataInFile (Writer write) throws NoBillFound{
	
		if(products.isEmpty()) {
			throw new NoBillFound();
		}
		
		write.start();

	    write.writeLine("HomeShop compagnie");
	    write.writeLine("1 Place Charles de Gaulle, 75008 Paris");
	    write.writeLine("");
	    write.writeLine("Facture à l'attention de : ");
		write.writeLine("");
		write.writeLine(customer.getFullname());
		write.writeLine("");
		write.writeLine(customer.getAddress());
		write.writeLine("");
		
		for(Map.Entry<Product, Integer> ele:products.entrySet()) {
			Product prod = ele.getKey();
			Integer quantity = ele.getValue();
			write.writeLine(prod.getName()+" : "+prod.getPrice()+" : "+prod.getPrice() );
			write.writeLine(prod.getDescription());
			write.writeLine("");
		}
		write.writeLine(" ");
		write.writeLine(".............................");
		write.writeLine(" the total : "+this.getTotal());
		write.writeLine("Avec la livraison  :"+" "+    this.getTotal()+this.delivery.getPrice());
		
		write.writeLine("");
		write.writeLine("........");
		
 
		write.stop();
		
	}
	
	//
	
 

}
