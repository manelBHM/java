package co.apiMagasin;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Bill {
	private Client client;
	private double total;
	private Delivery deliver;

	private HashMap<Produit, Integer> produits = new HashMap<Produit, Integer>();

	public Bill(Client client, Delivery deliver) {
		this.client = client;
		this.deliver = deliver;
	}

	public void addProduct(Produit produit, Integer quantity) {
		this.produits.put(produit, quantity);
	}

	public double totalProduit(Map<Produit, Integer> produits) {
		for (Entry<Produit, Integer> element : this.produits.entrySet()) {
			total += element.getKey().getPrix() * element.getValue();
		}
		return total;
	}

	public void resumProduit(Map<Produit, Integer> produits) {
		System.out.println("Resumé de vos produits : ");
		for (Entry<Produit, Integer> resume : this.produits.entrySet()) {
			System.out.println("- " + resume.getValue() + "-" + resume.toString() + "€");
		}
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Map<Produit, Integer> getProduits() {
		return produits;
	}

	public void setProduits(HashMap<Produit, Integer> produits) {
		this.produits = produits;
	}

	public double getTotal() {
		return total;
	}

	public void generate(Writer writer) {
		writer.start();
		writer.writeLine("MAGASIN FNAC");
		writer.writeLine("8 avenue du chien qui chasse, 77750, Courtomer");
		writer.writeLine("");
		writer.writeLine(client.getFullName());
		writer.writeLine(client.getAdresse());
		writer.writeLine("");
		writer.writeLine("Mode de livraison : ");
		writer.writeLine("");
		writer.writeLine("Produits :");
		writer.writeLine("-----------------------------------------------------");
		for (Entry<Produit, Integer> entry : this.produits.entrySet()) {
			Produit produit = entry.getKey();
			Integer qdt = entry.getValue();
			writer.writeLine(produit.getNom() + " - " + produit.getPrix() + " - " + qdt + " unité(s)");
			writer.writeLine(produit.descriptive);
			writer.writeLine("");
		}
		writer.writeLine("Livraison");
		writer.writeLine("-----------------------------------------------------");
		writer.writeLine("Total  : " + this.getTotal());
		writer.stop();
	}

	// .generate(Fw);
}
