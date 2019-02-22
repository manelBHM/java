package co.magasin;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import co.livraison.Delivery;

public class Facture {

	Map<Produit, Integer> listePanier = new HashMap<Produit, Integer>();
	Client client;
	private double total = 0;
	Delivery delivery;
	StringBuilder str = new StringBuilder();
	StringBuilder s = new StringBuilder();
	
	public Facture(Client client, Delivery del) {
		this.client = client;
		this.delivery = del;
	}

	public Delivery getDelivery() {
		return delivery;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Client getCus() {
		return client;
	}

	public Map<Produit, Integer>getProducts() {
		return listePanier;
	}

	public void setProducts(Map<Produit, Integer> products) {
		this.listePanier = products;
	}

	public void setCus(Client client) {
		this.client = client;
	}
	
	
	public void addProduit(Produit produit, Integer qtd) {
		this.listePanier.put(produit, qtd);
	}
	
	public double totalProducts(Map<Produit, Integer>listePanier) {
		for(Entry<Produit, Integer> element : this.listePanier.entrySet()) {
			total += (element.getKey().getPrix()) * element.getValue();
		}
		total += delivery.getPrix();
		return total;
	}
	
	public String resumePanier(Map<Produit, Integer>listePanier) {
		System.out.println("Resume de votre panier : ");
		for(Entry<Produit, Integer> element : this.listePanier.entrySet()) {
			System.out.println("- " + element.getValue() + " " + element.getKey().getNom() + " - " + element.getKey().getPrix() + " Euros unite ");
		}
		return "Le total de la commande, livraison comprise est de " + totalProducts(listePanier) + " Euros";
	}
	
	public StringBuilder wPanier(Map<Produit, Integer>listePanier) {
		for(Entry<Produit, Integer> element : this.listePanier.entrySet()) {
		s.append("- ").append(element.getValue()).append(" ").append(element.getKey().getNom()).append(" - ").append(element.getKey().getPrix()).append(" Euros unite ").append("<br>");
		}
		return s;
	}
	
	public void generate(FileWriter writer) {
		writer.start();
		writer.writeLine("MAGASIN FNAC");
		writer.writeLine("8 avenue du chien qui chasse, 77750, Courtomer");
		writer.writeLine("");
		writer.writeLine(client.getPrenomNom());
		writer.writeLine(client.getAdresse());
		writer.writeLine("");
		writer.writeLine("Mode de livraison : ");
		writer.writeLine("");
		writer.writeLine("Produits :");
		writer.writeLine("-----------------------------------------------------");
		for(Entry<Produit, Integer> entry : this.listePanier.entrySet()) {
			Produit produit = entry.getKey();
			Integer qdt = entry.getValue();
			writer.writeLine(produit.getNom() + " - " + produit.getPrix() + " - " + qdt + " unite(s)");
			writer.writeLine(produit.description);
			writer.writeLine("");
		}
		writer.writeLine("Livraison");
		writer.writeLine("-----------------------------------------------------");
		writer.writeLine("Total  : " + totalProducts(listePanier));
		writer.stop();	
		}
	
	public void generateConsole() {
		System.out.println();
		System.out.println("ELECTRONICS BASTILLE");
		System.out.println("1 Place de la Bastille; 75011 PARIS");
		System.out.println("");
		System.out.println("Client : " + client.getPrenomNom());
		System.out.println("Adresse du client : " + client.getAdresse());
		System.out.println("");
		System.out.println("Mode de livraison : " + delivery.getInfo());
		System.out.println("-----------------------------------------------------");
		System.out.println("Produits :");
		System.out.println("-----------------------------------------------------");
		for(Entry<Produit, Integer> entry : this.listePanier.entrySet()) {
			Produit produit = entry.getKey();
			Integer qdt = entry.getValue();
			System.out.println(produit.getNom() + " - " + produit.getPrix() + " - " + qdt + " unite(s)");
			System.out.println(produit.description);
			System.out.println("");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("Total  : " + this.totalProducts(listePanier));
		System.out.println();
		}
	
	public StringBuilder afficherFacture(Map<Produit, Integer> produits) {
		str.append("------------------- FACTURE --------------------").append("<br><br>");
		str.append("Client : ").append(client.getPrenomNom()).append("<br>");
		str.append("Adresse de livraison : ").append(client.getAdresse()).append("<br><br>");
		str.append("------------------- PRODUITS -------------------").append("<br><br>");
		str.append(wPanier(produits));
		str.append("<br>-------------- MODE DE LIVRAISON ---------------").append("<br><br>");
		str.append(delivery.getInfo()).append("<br>");
		str.append("<br>------------------------------------------------").append("<br><br>");
		str.append("TOTAL : ").append(this.totalProducts(produits)).append(" Euros").append("<br>");
		
		return str;
	}
	
	
	
	
	
}
