package co.simplon;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Facture {
	double total =0;
	Client client;
	Livraison livraison;
	HashMap<Produit, Integer> mapProduit = new HashMap<Produit, Integer>();
	Takeway takeway = new Takeway();
	
	public Facture(Client client, Livraison livraison ) {
		this.client = client;
		this.livraison = livraison;
	}
	
	public Livraison getLivraison() {
		return livraison;
	}

	public void setLivraison(Livraison livraison) {
		this.livraison = livraison;
	}

	public void addProduct(Produit produit, Integer quantitey){
		mapProduit.put(produit, quantitey);
	}

	public HashMap<Produit, Integer> getProduits(){
		return mapProduit;
		
	}
	
	public void generateConsole() {
		System.out.println("Bienvenue au mag");
		System.out.println("66 freidrischain strasse");
		System.out.println(client.getFullname());
		System.out.println(client.getAdress());
		System.out.println();
		System.out.println("Mode de livraison :" + livraison.getInfo());
		System.out.println("-----------------------------");
		System.out.println("Produits :");
		for(Entry<Produit, Integer> entry : this.mapProduit.entrySet()) {
			Produit produit = entry.getKey();
			Integer quantity = entry.getValue();
			
		System.out.println(produit.getNom() + "-" + produit.getPrix() + "-" + quantity + " unité(s)");
		System.out.println();
		}
		System.out.println("TOTAL PRODUIT :" + this.totalProduit(mapProduit));
		System.out.println();
		System.out.println();
		
		
		
	}
	
	public void generateFichier() {
		
	}
	
	public void generateWeb(){
		
		
		
	}
	
	public double totalProduit(Map<Produit, Integer> mapClient) {
		for(Entry<Produit, Integer> element : this.mapProduit.entrySet()) {
			total += (element.getKey().getPrix())*element.getValue();
		}
		return total;
	}
	
	
}

