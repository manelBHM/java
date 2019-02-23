package co.epharma.client;

import java.util.ArrayList;
import java.util.Map;

import co.epharma.produit.Produit;

public class Historique {
	private String historique, date;
	
	
	public Historique() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Historique(String historique, String date) {
		this.historique = historique;
		this.date = date;
	}
	
	


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getHistorique() {
		return historique;
	}


	public void setHistorique(String historique) {
		this.historique = historique;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
		


	
	
	
	
	
	
	
	

}
