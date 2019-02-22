package com.simplon.Shop;
import java.util.HashMap;

import java.util.Iterator;

import java.util.LinkedHashMap;

import java.util.Map;

import java.util.Map.Entry;

import java.util.Set;

public class Bill {
	int Integer;
	Customer customer;
	Product product; 
	Map<Integer, Product> prodList = new HashMap<Integer, Product>();
	
	public Bill(Customer customer) {
		this.customer=customer;
	}	
	
	public void addProduct(Product product, int i ) {
		prodList.put(i, product);
	}
	public Customer getCustomer() {
		return customer;
	}



	public Map<Integer, Product> getProdList() {
		return prodList;
	}
	public void generate(Writer writer) {
		writer.start();
		writer.writeLine("Magasin du centre");
		writer.writeLine("129 boulevard masséna 75013, paris");
		writer.writeLine("");
		writer.writeLine(customer.getFullname());
		writer.writeLine(customer.getAdress());
		writer.writeLine("");
		writer.writeLine("Mode de livraison ");
		writer.writeLine("");
		writer.writeLine("produit(s) :");
		writer.writeLine("----------------------------------------------------------------------");
		for(Entry<Integer, Product> map : this.prodList.entrySet()) {
			Integer quantity = map.getKey();
			Product product = map.getValue();
			writer.writeLine(product.getName() + " - " + product.getPrice()+ " - " + quantity + "unité(s)");
			writer.writeLine(product.description);
			writer.writeLine("");
		}
		writer.writeLine("Livraison");
		writer.writeLine("--------------------------");
		writer.writeLine("Total : " +this.totalProduct(prodList));
		writer.stop();
	}

	private double totalProduct(Map<Integer, Product> prodList) {
		int quantity = Integer;
		// TODO Auto-generated method stub
		return quantity*((Product) prodList).getPrice();
	}
}
