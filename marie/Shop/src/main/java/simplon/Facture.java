package simplon;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Facture {
	
	private Map<Produit, Integer> listPanier = new HashMap<Produit, Integer>();

	private Client client;
	private double total = 0;
	private Livraison livraison;
	StringBuilder str = new StringBuilder();
	StringBuilder s = new StringBuilder();

	public Facture(Client client, Livraison livraison) {
		this.client = client;
		this.livraison = livraison;
	}
	
	public Livraison getLivraison() {
		return livraison;		
	}

	public void setLivraison(Livraison livraison) {
		this.livraison = livraison;
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
	
	public Map<Produit, Integer>getProduits() {
		return listPanier;
	}

	public void setProduits(Map<Produit, Integer> produits) {
		this.listPanier = produits;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addProduit(Produit produit, Integer quantite) {
		this.listPanier.put(produit, quantite);
}

	public double totalProduits(Map<Produit, Integer> listPanier) {

		for (Entry<Produit, Integer> element : this.listPanier.entrySet()) {
			total += (element.getKey().getPrix()) * element.getValue();
		}
		total += livraison.prixLivraison();
		return total;
	}
	
	public String resumePanier(Map<Produit, Integer>listePanier) {
		System.out.println("Resume de votre panier : ");
		for(Entry<Produit, Integer> element : this.listPanier.entrySet()) {
			System.out.println("- " + element.getValue() + " " + element.getKey().getNom() + " - " + element.getKey().getPrix() + " Euros unite ");
		}
		return "Le total de la commande, livraison comprise est de " + totalProduits(listePanier) + " Euros";
	}
	
	public StringBuilder TPanier(Map<Produit, Integer>listePanier) {
		for(Entry<Produit, Integer> element : this.listPanier.entrySet()) {
		s.append("- ").append(element.getValue()).append(" ").append(element.getKey().getNom()).append(" - ").append(element.getKey().getPrix()).append(" Euros").append("<br>");
		}
		return s;
	}
	
	public void generate(Writer writer) {
		writer.start();
		writer.writeLine("Boulanger");
		writer.writeLine(" Zac Les 4 Chênes, RN4, 77340 Pontault-Combault");
		writer.writeLine("");
		writer.writeLine(client.getNom() + " " + client.getPrenom());
		writer.writeLine(client.getAdress());
		writer.writeLine("");
		writer.writeLine("Mode de livraison : ");
		writer.writeLine("");
		writer.writeLine("Produits :");
		writer.writeLine("-----------------------------------------------------");
		for(Entry<Produit, Integer> entry : this.listPanier.entrySet()) {
			Produit produit = entry.getKey();
			Integer quantite = entry.getValue();
			writer.writeLine(produit.getNom() + " - " + produit.getPrix() + " - " + quantite + " unite(s)");
			writer.writeLine(produit.description);
			writer.writeLine("");
		}
		writer.writeLine("Livraison");
		writer.writeLine("-----------------------------------------------------");
		writer.writeLine("Total  : " + totalProduits(listPanier));
		writer.stop();	
		}
	
	public void generateConsole() {
		System.out.println();
		System.out.println("Boulanger");
		System.out.println(" Zac Les 4 Chênes, RN4, 77340 Pontault-Combault");
		System.out.println("");
		System.out.println("Client : " + client.getNom() + " " + client.getPrenom());
		System.out.println("Adresse du client : " + client.getAdress());
		System.out.println("");
		System.out.println("Mode de livraison : " + livraison.infoLivraison());
		System.out.println("-----------------------------------------------------");
		System.out.println("Produits :");
		System.out.println("-----------------------------------------------------");
		for(Entry<Produit, Integer> entry : this.listPanier.entrySet()) {
			Produit produit = entry.getKey();
			Integer quantite = entry.getValue();
			System.out.println(produit.getNom() + " - " + produit.getPrix() + " - " + quantite + " unite(s)");
			System.out.println(produit.description);
			System.out.println("");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("Total  : " + this.totalProduits(listPanier));
		System.out.println();
		}
	
	public StringBuilder afficherFacture(Map<Produit, Integer> produits) {
		str.append("------------------- FACTURE --------------------").append("<br><br>");
		str.append("Client : ").append(client.getNom() + " " + client.getPrenom()).append("<br>");
		str.append("Adresse de livraison : ").append(client.getAdress()).append("<br><br>");
		str.append("------------------- PRODUITS -------------------").append("<br><br>");
		str.append(TPanier(produits));
		str.append("<br>-------------- MODE DE LIVRAISON ---------------").append("<br><br>");
		str.append(livraison.infoLivraison()).append("<br>");
		str.append("<br>------------------------------------------------").append("<br><br>");
		str.append("TOTAL : ").append(this.totalProduits(produits)).append(" Euros").append("<br>");
		
		return str;
	}
}