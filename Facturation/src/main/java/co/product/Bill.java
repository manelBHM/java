package co.product;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Bill {
	private Customer costomer;
	private Map<Product, Integer> produits = new HashMap<Product, Integer>();
	private Deliver deliver;
	private double total;

	public Bill(Customer costomer, Deliver deliver) {
		this.costomer = costomer;
		this.deliver = deliver;
	}

	public void addProduct(Product product, Integer quantity) {
		this.produits.put(product, quantity);
	}

	public double totalBill(Map<Product, Integer> produit) {
		for (Entry<Product, Integer> element : produits.entrySet()) {
			total += element.getKey().getPrice() * element.getValue();
		}
		return total;
	}

	public void resumeBill(Map<Product, Integer> produit) {
		System.out.println("Resume de la commande : ");
		for (Entry<Product, Integer> resume : this.produits.entrySet()) {
			System.out.println("-" + resume.getValue() + "-" + resume.toString() + " \nlivraison " + deliver.getInfo());
		}
	}

	public void generate(FileWriter writer) {
		writer.start();
		writer.writeLine("Magasin Darty");
		writer.writeLine("8 avenue du chien qui chasse, 77750, Courtomer");
		writer.writeLine("");
		writer.writeLine(costomer.getFullName());
		writer.writeLine(costomer.getAddress());
		writer.writeLine("");
		writer.writeLine("Mode de livraison : " + deliver.getInfo());
		writer.writeLine("");
		writer.writeLine("Produits :");
		writer.writeLine("-----------------------------------------------------");
		for (Entry<Product, Integer> entry : produits.entrySet()) {
			Product produit = entry.getKey();
			Integer qdt = entry.getValue();
			writer.writeLine(produit.getNom() + "-" + produit.getPrice() + "-" + qdt + " unité(s)");
			writer.writeLine(produit.toString());
			writer.writeLine("");
		}
		writer.writeLine("Livraison :");
		writer.writeLine("-----------------------------------------------------");
		writer.writeLine("Total  : " + this.getTotal());
		writer.stop();
	}

	public Customer getCostomer() {
		return costomer;
	}

	public void setCostomer(Customer costomer) {
		this.costomer = costomer;
	}

	public Map<Product, Integer> getProduits() {
		return produits;
	}

	public void setProduits(Map<Product, Integer> produits) {
		this.produits = produits;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
