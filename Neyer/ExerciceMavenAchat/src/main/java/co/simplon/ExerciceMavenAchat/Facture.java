package co.simplon.ExerciceMavenAchat;

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
		//return Math.rint(leTotal);
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
	
	public void generate(Writer writer)throws NoProductInFactureExeception {
		
		if(listProduit.isEmpty()) {//si la list est vide  
			throw new NoProductInFactureExeception();//il execute la class NoP...
		}
		
		writer.start();
		writer.template();
		writer.writeLine(" Nom client     : "+client.nom);
		writer.writeLine(" Adresse client : "+client.adress);
		writer.writeLine("");
		int a = 1;
		for(Map.Entry<Produit, Integer> ls : listProduit.entrySet()) {
			
			writer.writeLine(a+" : "+ls.getKey().nomProduit+" X "+ls.getValue()+"--------------"+ls.getKey().prix+"€");
			writer.writeLine("");
			
			a++;
		}
		
		writer.writeLine("Total : "+total()+"€");
		writer.stop();
	}
}
