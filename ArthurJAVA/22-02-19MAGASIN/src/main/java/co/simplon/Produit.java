package co.simplon;

import java.util.Comparator;

public class Produit {

	String name;
	String description;
	int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Produit(String name, String description, int price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public void look() {

	}

	public void buy() {

	}

	@Override
	public String toString() {
		return "Produit " + name + ", description=" + description + ", Prix =" + price + "]";
	}
	
	public static Comparator<Produit> idComparator = new Comparator<Produit>() {
		public int compare(Produit o1, Produit o2) {
			// TODO Auto-generated method stub
			char id1 = o1.getName().charAt(0);
			char id2 = o2.getName().charAt(0);
			return id1 - id2;
		}
	};

}
