package eshop.store;
import java.util.HashMap;
import java.util.Map;

public class Bill implements Delivery{

	private Customer customer;
	private Product product;
	private Delivery delivery;
	private int quantity;
	private double total;
	private static double id;	
	Map<Product, Integer> listProducts = new HashMap<Product, Integer>();


	public Bill(Customer customer, Delivery delivery)
	{
		this.customer = customer;
		this.delivery = delivery;
		id++;
	}


	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public Delivery getDelivery() {
		return delivery;
	}



	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}



	public Map<Product, Integer> getListProducts() {
		return listProducts;
	}


	public void setListProducts(Map<Product, Integer> listProducts) {
		this.listProducts = listProducts;
	}

	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public static double getId() {
		return id;
	}


	public static void setId(double id) {
		Bill.id = id;
	}


	public Map addProducts(Product product, int quantity)
	{
		listProducts.put(product, quantity);

		return listProducts;
	}


	public void getProducts()
	{
		for(Map.Entry<Product, Integer> p : listProducts.entrySet())
		{
			System.out.println(p.getKey() + " | Quantity: " + p.getValue());
		}

	}


	public double calcuTotal()
	{
		double val, key;

		for(Map.Entry<Product, Integer> p : listProducts.entrySet())
		{
			key = (Double)p.getKey().getPrice();
			val = p.getValue();

			total+=key*val;
		}

		if(delivery != null)
		{
			total+=this.delivery.getPrice();
		}

		return total;

	}


	public void generateBill(Writer write)
	{
		write.start(); 
		write.writeLine("Facture a l'attention de: ");
		write.writeLine("");
		write.writeLine("Fullname: " + this.customer.getFullName());
		write.writeLine("");
		write.writeLine("Adresse: " + this.customer.getAddress()+", "+this.customer.getPostalCode());
		write.writeLine("");
		if(delivery!=null)
		{write.writeLine(this.delivery.toString());}
		write.writeLine("");
		write.writeLine("Products");
		write.writeLine("---------------------------");

		for(Map.Entry<Product, Integer> p : listProducts.entrySet())
		{
			quantity = p.getValue();

			Product product = p.getKey();
			write.writeLine(product.getName() + " - " + product.getPrice() + " - " + quantity + " unité(s)");
			write.writeLine(product.getDescription());
			write.writeLine("");
		}

		if(delivery!=null)
		{write.writeLine("Livraison: " + delivery.getPrice());}
		write.writeLine("------------------------");
		write.writeLine("Total: " + total);
		write.stop();
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Votre Facture est: " + total;
	}


	public double getPrice() {
		// TODO Auto-generated method stub
		return this.delivery.getPrice();
	}

}
