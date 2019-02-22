package co.hamza.facture;

import java.util.ArrayList;
import co.hamza.clients.Client;
import co.hamza.livraison.Livraison;
import co.hamza.produits.Produits;

public class Facture {

	private Client client;
	private Livraison livraison;
	private ArrayList<Produits> produits = new ArrayList<Produits>();
	private double total = 0;

	public Facture() {
	}

	public Facture(Client client, Livraison livraison) {
		this.client = client;
		this.livraison = livraison;

	}

	public void addProduits(Produits produits) {
		this.produits.add(produits);

	}

	public void panier(ArrayList<Produits> arrayList) {
		for (Produits element : this.produits) {
			System.out.println("- " + element.getQuantite() + " " + element.getNom() + " : " + element.getDescription()
					+ " - " + element.getPrix() * element.getQuantite() + " euros.");
		}

	}

	public double total(ArrayList<Produits> arrayList) {

		for (Produits element : this.produits) {
			total += element.getQuantite() * element.getPrix();
		}
		total += livraison.getPrix();

		return total;

	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ArrayList<Produits> getProduits() {
		return produits;
	}

	public void setProduits(ArrayList<Produits> produits) {
		this.produits = produits;
	}

}
