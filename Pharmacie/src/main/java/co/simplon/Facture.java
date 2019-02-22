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
		for (Entry<Produit, Integer> element : ListePanier.entrySet()) {
			 s.append("- " + element.getValue()+ "- " + element.getKey().getNom()+" "+element.getKey().prix  + "€" +"<hr>");
	
					total += element.getKey().getPrix() * element.getValue();
		}
		s.append("TOTAL :"+" "+total+" "+"€");
		return s;
	}
	
	public void generate(Writer writer) {
		writer.start();
		writer.writeLine("Pharmacie");
		writer.writeLine(" La Pepinière");
		writer.writeLine("");
		writer.writeLine(client.getNom() + " " + client.getPrenom());
		writer.writeLine("");
		writer.writeLine("Produits :");
		writer.writeLine("-----------------------------------------------------");
		for(Entry<Produit, Integer> entry : this.ListePanier.entrySet()) {
			Produit produit = entry.getKey();
			Integer quantite = entry.getValue();
			writer.writeLine(produit.getNom() + " - " + produit.getPrix() + " - " + quantite + " unite(s)");
			writer.writeLine("");
		}
		writer.writeLine("-----------------------------------------------------");
		writer.writeLine("Total  : " + totalProduits(ListePanier));
		writer.stop();	
		}
	
	public void generateConsole() {
		System.out.println();
		System.out.println("Pharmacie");
		System.out.println(" La Pepinère");
		System.out.println("");
		System.out.println("Client : " + client.getNom() + " " + client.getPrenom());
		System.out.println("-----------------------------------------------------");
		System.out.println("Produits :");
		System.out.println("-----------------------------------------------------");
		for(Entry<Produit, Integer> entry : this.ListePanier.entrySet()) {
			Produit produit = entry.getKey();
			Integer quantite = entry.getValue();
			System.out.println(produit.getNom() + " - " + produit.getPrix() + " - " + quantite + " unite(s)");
			System.out.println("");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("Total  : " + this.totalProduits(ListePanier));
		System.out.println();
		}
	
	public StringBuilder afficherFacture(Map<Produit, Integer> produits) {
		str.append("------------------- FACTURE --------------------").append("<br><br>");
		str.append("Client : ").append(client.getNom() + " " + client.getPrenom()).append("<br>");
		str.append("------------------- PRODUITS -------------------").append("<br><br>");
	   str.append(TPanier(produits));
		//str.append("TOTAL : ").append(this.totalProduits(produits)).append(" Euros").append("<br>");
	  
		return str;
	}
	
	
}





















