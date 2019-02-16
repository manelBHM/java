package model;

public class Telephone extends Product{ 
	private String model;
   private int quantite;
	public Telephone(String name, String desc, double price, String model) {
		super(name, desc, price);
		this.model = model;
	}

	public Telephone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Telephone(String name, String desc, double price, int quantite) {
		super(name, desc, price);
		this.quantite= quantite;
		// TODO Auto-generated constructor stub
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	public int getQuantite() {
		return this.quantite;
	}
	

}
