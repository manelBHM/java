package co.simplon;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Facture {

	private Map<Produit, Integer> ListePanier = new HashMap<Produit, Integer>();
	
	private Client client;
	private double total=0;
	StringBuilder str = new StringBuilder();
	StringBuilder s = new StringBuilder();
	
	public Facture(Client client) {
		this.client = client;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public Client getClient() {
		return client;
	}
	
	public Map<Produit, Integer>getProduit(){
		return ListePanier;
	}
	
	public void setProduit(Map<Produit, Integer> produits) {
		this.ListePanier = produits;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addProduit(Produit produit, Integer quantite) {
		this.ListePanier.put(produit, quantite);
	}
	
	public double totalProduits(Map<Produit, Integer> ListePanier) {
		for(Entry<Produit, Integer> element : this.ListePanier.entrySet()) {
			total += (element.getKey().getPrix()) * element.getValue();
		}
		return total;
	}
	
	public String resumPanier(Map<Produit, Integer> ListePanier) {
		for(Entry<Produit, Integer> element : this.ListePanier.entrySet()) {
			System.out.println("- " + element.getValue() + " " + element.getKey().getNom() + " - " + element.getKey().getPrix() + " Euros");
		}
		return "Le total de la commande est de " + totalProduits(ListePanier) + " Euros";
	}
	
	public StringBuilder TPanier(Map<Produit, Integer>ListePanier) {
		for(Entry<Produit, Integer> element : this.ListePanier.entrySet()) {
		s.append("- ").append(element.getValue()).append(" ").append(element.getKey().getNom()).append(" - ").append(element.getKey().getPrix()).append(" Euros").append("<br>");
		}
		return s;
	}
	
	public StringBuilder afficherFacture(Map<Produit, Integer> produits) {
		str.append("------------------- FACTURE --------------------").append("<br><br>");
		str.append("Client : ").append(client.getNom() + " " + client.getPrenom()).append("<br>");
		str.append("------------------- PRODUITS -------------------").append("<br><br>");
		str.append(TPanier(produits));
		str.append("TOTAL : ").append(this.totalProduits(produits)).append(" Euros").append("<br>");
		
		return str;
	}
	
	
}