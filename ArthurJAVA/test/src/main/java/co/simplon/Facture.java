package co.simplon;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Facture {
	Client client;
	Livraison livraison;
	HashMap<Produit, Integer> mapProduit = new HashMap<Produit, Integer>();
	Takeway takeway = new Takeway();
	private double total = 0;
	 StringBuilder str = new StringBuilder();
	 StringBuilder s = new StringBuilder();
	
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
		System.out.println("TOTAL PRODUIT :" + this.totalProduit(mapProduit) + this.livraison.getPrice());
		System.out.println();
		System.out.println();
		
		
		
	}
	
	public StringBuilder afficherFacture(Map<Produit, Integer> mapProduit) {
		s.append("------------------- FACTURE --------------------").append("<br> <br>");
		s.append(client.getFullname()).append("<br>");
		s.append(client.getAdress()).append("<br><br>");
		s.append("------------------- PRODUITS -------------------").append("<br><br>");
		s.append(resumePanier(mapProduit));
		s.append("<br>-------------- MODE DE LIVRAISON ---------------").append("<br><br>");
		s.append(livraison.getInfo()).append("<br>");
		s.append("<br>------------------------------------------------").append("<br><br>");
		s.append("TOTAL : ").append(getTotal(mapProduit)).append(" euros").append("<br>");
		
		return s;
	}
	
	public double getTotal(Map<Produit, Integer> mapProduit) {
        double total = 0;
        for (Map.Entry<Produit, Integer> str : mapProduit.entrySet()) {
            total += str.getKey().getPrix()* str.getValue();
                     
        }
        
        return total + livraison.getPrice();
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
	
	public StringBuilder resumePanier(Map<Produit, Integer> produits) {
		//	System.out.println("Résumé de votre panier : \n" );
			
			for (Entry<Produit, Integer> element : this.mapProduit.entrySet()) {
				 str.append(element.getKey().getNom()).append(" - ").append(" - ").append(element.getKey().getPrix()).append(" euros").append(" - ").append(element.getValue()).append(" unités").append("<br>");
				 
			} 
			
			System.out.println("");
			return str ;
		}
		
	
	
}

