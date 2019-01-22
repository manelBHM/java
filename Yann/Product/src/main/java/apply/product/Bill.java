package apply.product;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;




public class Bill{

	private Client<?, ?> client;
	private Product<?, ?, ?> product;
	int quantite;
	double total=0;
	Map<Product, Integer> listProducts = new HashMap<Product, Integer>();



	public Bill(Client<?, ?> client)
	{
		this.client=client;
	}



	public Client<?, ?> getClient() {
		return client;
	}

	public void setClient(Client<?, ?> client) {
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
		double v,k;
		for(Map.Entry<Product, Integer> s : listProducts.entrySet())
		{
			k=(Double) s.getKey().getPrice();
			v=s.getValue();
			if(v>1)
			{total+=(v*k);}
			else {
				total+=k;}
		}
		return total;
	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Votre Facture est: " + total;
	}





}
