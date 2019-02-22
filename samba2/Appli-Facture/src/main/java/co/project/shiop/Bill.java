package co.project.shiop;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Bill {
	private Customer customer;
	private double total;
	private Delivery delivery;
	private Map<Product, Integer> products = new HashMap<Product, Integer>();
	StringBuilder str = new StringBuilder();
	StringBuilder s = new StringBuilder();

	public Bill(Customer customer, Delivery delivery) {
		this.customer = customer;
		this.delivery = delivery;
	}

	public void addProduct(Product product, Integer quantity) {
		products.put(product, quantity);
	}

	public double calculTotal(Map<Product, Integer> product) {
		for (Entry<Product, Integer> element : product.entrySet()) {
			total += element.getKey().getPrice() * element.getValue();
		}
		return total;
	}

	// public StringBuilder resume(Map<Product, Integer> products) {
	// System.out.println("Voici le resumé de la commande");
	//
	// for (Entry<Product, Integer> resume : products.entrySet()) {
	// str.append(resume.getKey()).append(" --->
	// ").append(resume.getValue()).append("unités");
	// }
	// return str;
	//
	// }

	public StringBuilder afficherFacture(Map<Product, Integer> produits) {
		s.append("------------------- FACTURE --------------------").append("<br> <br>");
		s.append(customer.getFullName()).append("<br>");
		s.append(customer.getAddress()).append("<br><br>");
		s.append("------------------- PRODUITS -------------------").append("<br><br>");
		s.append(resumePanier(produits));
		s.append("<br>-------------- MODE DE LIVRAISON ---------------").append("<br><br>");
		try {
			s.append(delivery.getInfo()).append("<br>");
		} catch (Exception e) {
			e.getMessage();
		}

		s.append("<br>------------------------------------------------").append("<br><br>");
		s.append("TOTAL : ").append(calculTotal(produits)).append(" euros").append("<br>");
		return s;
	}

	public StringBuilder resumePanier(Map<Product, Integer> produits) {
		for (Entry<Product, Integer> element : produits.entrySet()) {
			str.append(element.getKey().getName()).append(" - ").append(element.getKey().getDescription()).append(" - ")
					.append(element.getKey().getPrice()).append(" euros").append(" - ").append(element.getValue())
					.append(" unités").append("<br>");
		}
		System.out.println("");
		return str;
	}

	public StringBuilder resume(Map<Product, Integer> prod) {
		for (Entry<Product, Integer> element : prod.entrySet()) {
			str.append(element.getKey().getName()).append("-").append(element.getKey().getDescription()).append("-")
					.append("-").append(element.getKey().getPrice()).append("euro").append("-")
					.append(element.getValue()).append("uniteés");
		}
		return str;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Map<Product, Integer> getProducts() {
		return products;
	}

	public void setProducts(Map<Product, Integer> products) {
		this.products = products;
	}

}
