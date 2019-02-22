package App_Magazan2.Magazen2;

import java.util.HashMap;
import java.util.Map;

public class Facture {
Client client;
	
	HashMap<Produit, Integer> listProduit = new HashMap<Produit, Integer>();
	
	public Facture(Client client) {
		this.client=client;
	}
	
	public void ajouterProduit(Produit produit, int quantite){
		listProduit.put(produit, quantite);
	}
	
	public double total() {
		double leTotal = 0;
		
		
		
		for(Map.Entry<Produit, Integer> ls : listProduit.entrySet()) {
			
			leTotal += ls.getKey().prix*ls.getValue();
			
		}
		
		return leTotal;
	}
	
	public void afficheFacture() {
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("-------------------------FACTURE---------------------------------");
		System.out.println(" Nom client     : "+client.nom);
		System.out.println(" Adresse client : "+client.adress);
		System.out.println("");
		int a = 1;
		for(Map.Entry<Produit, Integer> ls : listProduit.entrySet()) {
			
			System.out.println(a +" : "+ls.getKey().nomProduit+" X "+ls.getValue()+"---------------"+ls.getKey().prix+"€" );
			System.out.println("");
			
			a++;
		}
		System.out.println("Total : " +total()+"€");
	}	
}
