package classes.demo;

import java.util.HashMap;
import java.util.Map;

public class Bills {
	
	private Delivery delivery;
	private Customer customer;
	private Map<Product, Integer> products = new HashMap<Product,Integer>();
	
	StringBuffer buffer = new StringBuffer();

 
	
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
	
	
	
	
	///Servlet section
	
	//a method to show product that returns a String 
	public StringBuffer coutTotal(Map<Product,Integer> p) {
		for(Map.Entry<Product, Integer> ls :p.entrySet()){
			buffer.append(ls.getKey().getName()).append(", ").append("<br>").append(ls.getKey().getDescription())
			.append(", ").append("<br>").append(ls.getKey().getPrice()).append("Euros ").append("<br>")
			.append(ls.getValue()).append(", ").append("<br><br>");
		}
		System.out.println(" ");
		
		return buffer;
	
		
	}
	
	//a method that return a String for the Servlet
	public StringBuffer showProducts(Map<Product,Integer> prod) {
		buffer.append("We are very happy that you have chosesn our products ").append("<br>");
		buffer.append("here is your bill ").append("<br><br>");
		buffer.append("Your full  :  "+customer.getFullname()).append("<br><br>");
		buffer.append("Your address :  "+customer.getAddress()).append("<br><br>");
		buffer.append("Products  ").append("<br><br>");
		buffer.append(coutTotal(products)).append("<br><br>");
		buffer.append("Delivery information  ").append("<br>");
		buffer.append(delivery.getInfo()).append("<br><br>");
		//buffer.append(((Bills) products).getTotal()).append("Euros").append("<br>");
		
		return buffer;
		
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
