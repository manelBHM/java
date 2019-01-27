package apply.product;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;




public class Bill implements Delivery{

	private Client<?, ?, ?> client;
	private Product<?, ?, ?> product;
	private Delivery delivery;
	int quantite;
	double total=0;
	Map<Product, Integer> listProducts = new HashMap<Product, Integer>();



	public Bill(Client<?, ?, ?> client)
	{
		this.client=client;
	}


	public Bill(Client<?, ?, ?> client, Delivery delivery)
	{
		this.client=client;
		this.delivery=delivery;
	}



	public Delivery getDelivery() {
		return delivery;
	}


	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}


	public Client<?, ?, ?> getClient() {
		return client;
	}

	public void setClient(Client<?, ?, ?> client) {
		this.client = client;
	}


	public Product<?, ?, ?> getProduct() {
		return product;
	}


	public void setProduct(Product<?, ?, ?> product) {
		this.product = product;
	}



	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}



	public Map addProduct(Product product, int quantite)
	{
		listProducts.put(product, quantite);
		return listProducts;
	}



	public void getProducts()
	{

		for(Map.Entry<Product, Integer> s : listProducts.entrySet())
		{
			System.out.println(s.getKey() + " | Quantité: " + s.getValue());

		}	
	}



	public double calculTotal()
	{	
		double v,k,del;

		for(Map.Entry<Product, Integer> s : listProducts.entrySet())
		{
			k=(Double) s.getKey().getPrice();
			v=s.getValue();

			total+=k*v;
		}

		if(delivery != null)
			total+=this.delivery.getPrice();
		return total;

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


	public String generate(Writer write)
	{
		write.start(); 
		write.writeLine("Facture a l'attention de: ");
		write.writeLine("");
		write.writeLine("Fullname: " + this.getClient().getFullname());
		write.writeLine("");
		write.writeLine("Adresse: " + this.getClient().getAddress()+", "+this.getClient().getCodePostal());
		write.writeLine("");
		write.writeLine(this.getDelivery()+"");
		write.writeLine("");
		write.writeLine("Produits");
		write.writeLine("---------------------------");

		for(Map.Entry<Product, Integer> s : listProducts.entrySet())
		{

			double total=0, key,val;

			key=(Double) s.getKey().getPrice();

			val=s.getValue();

			int quantite = s.getValue();

			total+=key;

			Product product = s.getKey();
			write.writeLine(product.getName() + " - " + product.getPrice() + " - " + quantite + " unité(s)");
			write.writeLine(product.getDescription()+"");
			write.writeLine("");
		}
	

		write.writeLine("Livraison: " + delivery.getPrice());
		write.writeLine("------------------------");
		write.writeLine("Total: " + this.total);
		write.stop();



		return total+"";
	}



	public String generateNoDelivery(Writer writer)
	{
		writer.start(); 
		writer.writeLine("Facture a l'attention de: ");
		writer.writeLine("");
		writer.writeLine("Fullname: " + this.getClient().getFullname());
		writer.writeLine("");
		writer.writeLine("Adresse: " + this.getClient().getAddress()+", "+this.getClient().getCodePostal());
		writer.writeLine("");
		writer.writeLine("Produits");
		writer.writeLine("---------------------------");

		for(Map.Entry<Product, Integer> s : listProducts.entrySet())
		{

			double total=0, key,val;

			key=(Double) s.getKey().getPrice();

			val=s.getValue();

			int quantite = s.getValue();

			Product product = s.getKey();
			writer.writeLine(product.getName() + " - " + product.getPrice() + " - " + quantite + " unité(s)");
			writer.writeLine(product.getDescription()+"");
			writer.writeLine("");
		}
	
		writer.writeLine("------------------------");
		writer.writeLine("Total: " + this.total);
		writer.stop();


		return total+"";
	}

}