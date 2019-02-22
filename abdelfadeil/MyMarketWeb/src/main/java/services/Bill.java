package services;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import boutiqueWriter.Writer;
import livraison.Delivery;
import model.Product;
import users.Customer;

public class Bill{

	int quantity = 0;
	private Customer customer;
	private Delivery delivery;
	private Map<Product, Integer> map = new HashMap<>();

	public Bill() {
		super();
	}

	public Bill(Customer customer, Delivery delivery) {
		this.customer = customer;
		this.delivery = delivery;
		
		
	}

	public void addProduct(Product pro, int quante) {
		map.put(pro, quante);
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Map<Product, Integer> getProducts() {
		return map;
	}

	public void getProducts(Map<Product, Integer> map) {
		this.map = map;
	}

	public void generate() {
		if(!map.isEmpty()) {
		System.out.println("\nHom Shop Company");
		System.out.println("55 Rue vancinne 93000 Montruit");
		System.out.println("");
		System.out.println("Facture à l'attention");
		System.out.println(customer.getFullname());
		System.out.println(customer.getAddress());
		System.out.println("");
		System.out.println("Mode de livration : " + delivery.getInfo());
		System.out.println("");
		System.out.println("Produits : ");
		//System.out.println("\n-------------------------------");
		
		for(Map.Entry<Product, Integer> str : map.entrySet()) {
			Product pro = str.getKey();
			Integer quantity = str.getValue();
			System.out.println(pro.getName() + " - " + pro.getPrice() + "$ - " + quantity + " unité");
			System.out.println(pro.getDesc());
			System.out.println("");
		}
		//int allQun = quantity + quantity;
		System.out.println("Liviration "+delivery.getPrice()+"$");
		System.out.println("Total Price: " +this.getTotal()+"$");
		System.out.println("\n_________________________________");
		
	}else {
		System.out.println("Sorry Is Empty ");
	}
	}
	public double getTotal() {
		double total = 0;
		for (Map.Entry<Product, Integer> str : map.entrySet()) {
			
			double prix= str.getKey().getPrice();
			 quantity = str.getValue();	
			 total+= prix*quantity;
		}
		
		return total + this.delivery.getPrice();
	}
	
	public void generateConsole() {
		if(!map.isEmpty()) {
		System.out.println("\nHom Shop Company");
		System.out.println("55 Rue vancinne 93000 Montruit");
		System.out.println("");
		System.out.println("Facture à l'attention");
		System.out.println(customer.getFullname());
		System.out.println(customer.getAddress());
		System.out.println("");
		System.out.println("Mode de livration : " + delivery.getInfo());
		System.out.println("");
		System.out.println("Produits : ");
		//System.out.println("\n-------------------------------");
		
		for(Map.Entry<Product, Integer> str : map.entrySet()) {
			Product pro = str.getKey();
			Integer quantity = str.getValue();
			System.out.println(pro.getName() + " - " + pro.getPrice() + "$ - " + quantity + " unité");
			System.out.println(pro.getDesc());
			System.out.println("");
		}
		//int allQun = quantity + quantity;
		System.out.println("Liviration "+delivery.getPrice()+"$");
		System.out.println("Total Price: " +this.getTotal()+"$");
		System.out.println("\n_________________________________");
		
	}else {
		System.out.println("Sorry Is Empty ");
	}
	}
	
	public void myWriter() {
		
		try {
			PrintWriter w = new PrintWriter("text.txt");
			if(!map.isEmpty()) {
			   
				w.println("\nHom Shop Company");
                w.println("55 Rue vancinne 93000 Montruit");
				w.println("");
				w.println("Facture à l'attention");
				w.println(customer.getFullname());
				w.println(customer.getAddress());
				w.println("");
				w.println("Mode de livration : " + delivery.getInfo());
				w.println("");
				w.println("Produits : ");
			    w.println("\n-------------------------------");
				
				for(Map.Entry<Product, Integer> str : map.entrySet()) {
					Product pro = str.getKey();
					Integer quantity = str.getValue();
                    w.println(pro.getName() + " - " + pro.getPrice() + "$ - " + quantity + " unité");
					w.println(pro.getDesc());
					w.println("");
				}
				//int allQun = quantity + quantity;
				w.println("Liviration "+delivery.getPrice()+"$");
				w.println("Total Price: " +this.getTotal()+"$");
				w.println("\n_________________________________");
			}else {
				System.out.println("Sorry Is Empty ");
			}
			w.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void generateFichier() {
		
		try {
			
			PrintWriter fichier = new PrintWriter("file.txt");
			if(!map.isEmpty()) {
			
				fichier.println("\nHom Shop Company");
				fichier.println("55 Rue vancinne 93000 Montruit");
				fichier.println("");
				fichier.println("Facture à l'attention");
				fichier.println(customer.getFullname());
				fichier.println(customer.getAddress());
				fichier.println("");
				fichier.println("Mode de livration : " + delivery.getInfo());
				fichier.println("");
				fichier.println("Produits : ");
			    fichier.println("\n-------------------------------");
				
				for(Map.Entry<Product, Integer> str : map.entrySet()) {
					Product pro = str.getKey();
					Integer quantity = str.getValue();
					fichier.println(pro.getName() + " - " + pro.getPrice() + "$ - " + quantity + " unité");
					fichier.println(pro.getDesc());
					fichier.println("");
				}
				//int allQun = quantity + quantity;
				fichier.println("Liviration "+delivery.getPrice()+"$");
				fichier.println("Total Price: " +this.getTotal()+"$");
				fichier.println("\n_________________________________");
			}else {
				System.out.println("Sorry Is Empty ");
			}
			fichier.close();

			
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
}
	

}
