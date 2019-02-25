package org.imdrmas.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.imdrmas.entities.Produits;
import org.imdrmas.vente.ProduitsPannier;

public class Facture {
  private double totalPrix = 0;
  StringBuilder strF = new StringBuilder();
  StringBuilder strR = new StringBuilder();
  private Map<ProduitsPannier, Integer> map = new HashMap<ProduitsPannier, Integer>();
  
  public void addPropduit(ProduitsPannier pro, int quantite) {
	  map.put(pro, quantite);
  }
  public Map<ProduitsPannier, Integer> getProduits() {
		return map;
}
  
  public double getTotal(Map<ProduitsPannier, Integer> map) {
	  for (Entry<ProduitsPannier, Integer> element : map.entrySet()) {
		totalPrix += element.getKey().getPrix() * element.getValue();
	}
	  return totalPrix;
  }
  
  public StringBuilder afficherFacture(Map<ProduitsPannier, Integer> produits) {
	    strF.append("------------------- FACTURE --------------------").append("<br> <br>");
	    strF.append("------------------- PRODUITS -------------------").append("<br><br>");
		strF.append(resumePanier(produits));
		strF.append("<br>-------------- MODE DE LIVRAISON ---------------").append("<br><br>");
		strF.append("<br>------------------------------------------------").append("<br><br>");
		strF.append("TOTAL : ").append(getTotal(map)).append("$").append("<br>");
	  return strF;
  }
  
  public StringBuilder resumePanier(Map<ProduitsPannier, Integer> produits) {
	  for (Entry<ProduitsPannier, Integer> element : produits.entrySet()) {
			strR.append(element.getKey().getDesignation()).append(" - ").append(element.getKey().getPrix())
			.append("$ - ").append(element.getValue()).append(" unités <br>");
		}
	  return strR;
  }
}
